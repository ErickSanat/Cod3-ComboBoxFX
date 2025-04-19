package com.example.cod3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;

public class ComboBoxController {
    @FXML
    ComboBox<String> eleccion;
    @FXML
    Label calificacion;

    @FXML
    public void calificar(ActionEvent event) {
        String resultado;
        resultado = eleccion.getValue();
        if (Integer.parseInt(resultado) == 5) {
            calificacion.setText("correcto");
        } else
            calificacion.setText("incorrecto");
    }

    @FXML
    protected void salir(ActionEvent event) {
        Platform.exit();
    }
}