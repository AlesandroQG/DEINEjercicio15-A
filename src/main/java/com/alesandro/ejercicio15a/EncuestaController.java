package com.alesandro.ejercicio15a;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla
 */
public class EncuestaController implements Initializable {
    @FXML // fx:id="cbPractica"
    private CheckBox cbPractica; // Value injected by FXMLLoader
    @FXML // fx:id="cmbEdad"
    private ComboBox<String> cmbEdad; // Value injected by FXMLLoader
    @FXML // fx:id="lvDeportes"
    private ListView<?> lvDeportes; // Value injected by FXMLLoader
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
    @FXML // fx:id="txrProfesion"
    private TextField txrProfesion; // Value injected by FXMLLoader
    @FXML // fx:id="txtHermanos"
    private TextField txtHermanos; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se inicia la ventana
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //ObservableList<String> edades = FXCollections.<String>observableArrayList();
        //edades.addAll("Menores de 18", "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 70", "Mayores de 70");
        cmbEdad.getItems().addAll("Menores de 18", "Entre 18 y 30", "Entre 31 y 50", "Entre 51 y 70", "Mayores de 70");
    }

    /**
     * Función que escucha al cambio del checkbox
     *
     * @param event
     */
    @FXML
    void cbCambio(ActionEvent event) {
        boolean estado = cbPractica.isSelected();
        if (estado) {
            lvDeportes.setEditable(true);
        } else {
            lvDeportes.setEditable(false);
        }
    }

    /**
     * Función que procesa los datos cuándo se pulsa el botón "Aceptar"
     *
     * @param event
     */
    @FXML
    void aceptar(ActionEvent event) {

    }

    /**
     * Función que cierra la aplicación cuándo se pulsa el botón "Cancelar"
     *
     * @param event
     */
    @FXML
    void cancelar(ActionEvent event) {
        Platform.exit();
    }

}
