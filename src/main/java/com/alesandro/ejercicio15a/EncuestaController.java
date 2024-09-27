package com.alesandro.ejercicio15a;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Clase que controla
 */
public class EncuestaController {
    @FXML // fx:id="cbPractica"
    private CheckBox cbPractica; // Value injected by FXMLLoader
    @FXML // fx:id="cmbEdad"
    private ComboBox<?> cmbEdad; // Value injected by FXMLLoader
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
