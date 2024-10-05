package com.alesandro.ejercicio15a;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Clase que controla los eventos de la ventana
 */
public class EncuestaController {
    @FXML // fx:id="cbPractica"
    private CheckBox cbPractica; // Value injected by FXMLLoader
    @FXML // fx:id="cmbEdad"
    private ComboBox<String> cmbEdad; // Value injected by FXMLLoader
    @FXML // fx:id="lvDeportes"
    private ListView<String> lvDeportes; // Value injected by FXMLLoader
    @FXML // fx:id="rbHombre"
    private RadioButton rbHombre; // Value injected by FXMLLoader
    @FXML // fx:id="rbMujer"
    private RadioButton rbMujer; // Value injected by FXMLLoader
    @FXML // fx:id="rbOtro"
    private RadioButton rbOtro; // Value injected by FXMLLoader
    @FXML // fx:id="sCine"
    private Slider sCine; // Value injected by FXMLLoader
    @FXML // fx:id="sCompras"
    private Slider sCompras; // Value injected by FXMLLoader
    @FXML // fx:id="sTelevision"
    private Slider sTelevision; // Value injected by FXMLLoader
    @FXML // fx:id="tgSexo"
    private ToggleGroup tgSexo; // Value injected by FXMLLoader
    @FXML // fx:id="txtProfesion"
    private TextField txtProfesion; // Value injected by FXMLLoader
    @FXML // fx:id="txtHermanos"
    private TextField txtHermanos; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se inicia la ventana
     */
    public void initialize() {
        // ComboBox Edades
        cmbEdad.getItems().addAll("Menores de 18", "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 70", "Mayores de 70");
        cmbEdad.setValue("Menores de 18");
        // Lista Deportes
        lvDeportes.getItems().addAll("Tenis", "Fútbol", "Baloncesto", "Natación", "Ciclismo", "Otro");
        lvDeportes.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    /**
     * Función que escucha al cambio del checkbox
     *
     * @param event
     */
    @FXML
    public void cbCambio(ActionEvent event) {
        boolean estado = cbPractica.isSelected();
        if (estado) {
            lvDeportes.setDisable(false);
        } else {
            lvDeportes.setDisable(true);
        }
    }

    /**
     * Función que procesa los datos cuándo se pulsa el botón "Aceptar"
     *
     * @param event
     */
    @FXML
    public void aceptar(ActionEvent event) {
        String error = "";
        if (txtProfesion.getText().isEmpty()) {
            error += "Hay que rellenar el campo profesión";
        }
        if (txtHermanos.getText().isEmpty()) {
            if (!error.isEmpty()) {
                error += "\n";
            }
            error += "Hay que rellenar el campo número de hermanos";
        } else {
            try {
                int nHermanos = Integer.parseInt(txtHermanos.getText());
            } catch (NumberFormatException e) {
                if (!error.isEmpty()) {
                    error += "\n";
                }
                error += "El campo número de hermanos tiene que ser numérico";
            }
        }
        if (cbPractica.isSelected()) {
            if (lvDeportes.getSelectionModel().getSelectedItems().isEmpty()) {
                if (!error.isEmpty()) {
                    error += "\n";
                }
                error += "Tienes que indicar los deportes que practicas";
            }
        }
        if (!error.isEmpty()) {
            alerta(error);
        } else {
            String confirmacion = "Profesión: " + txtProfesion.getText() + "\n" +
                    "Nº de hermanos: " + txtHermanos.getText() + "\n" +
                    "Edad: " + cmbEdad.getSelectionModel().getSelectedItem() + "\n" +
                    "Sexo: ";
            if (rbHombre.isSelected()) {
                confirmacion += "Hombre";
            } else if (rbMujer.isSelected()) {
                confirmacion += "Mujer";
            } else {
                confirmacion += "Otro";
            }
            if (cbPractica.isSelected()) {
                confirmacion += "\nDeportes que practicas:\n";
                for (String deporte : lvDeportes.getSelectionModel().getSelectedItems()) {
                    confirmacion += "\t" + deporte + "\n";
                }
            }
            confirmacion += "Grado de afición a las compras: " + sCompras.getValue() + "\n" +
                    "Grado de afición a ver la televisión: " + sTelevision.getValue() + "\n" +
                    "Grado de afición a ir al cine: " + sCine.getValue();
            confirmacion(confirmacion);
        }
    }

    /**
     * Función que muestra un mensaje de alerta al usuario
     *
     * @param texto contenido de la alerta
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("TUS DATOS");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Función que muestra un mensaje de confirmación al usuario
     *
     * @param texto contenido de la confirmación
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("TUS DATOS");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Función que cierra la aplicación cuándo se pulsa el botón "Cancelar"
     *
     * @param event
     */
    @FXML
    public void cancelar(ActionEvent event) {
        Platform.exit();
    }

}
