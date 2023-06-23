package com.librairie.librairie.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Classe pour les infos des élèves
 */
public class AboutController implements Initializable {
    /**
     * Déclaration de l'attribut utilisé dans la classe
     */
    @FXML
    private Button infos;

    /**
     * @param url
     * @param resourceBundle
     */
    public void initialize(URL url, ResourceBundle resourceBundle) {
        infos.setOnAction(actionEvent -> infos.getScene().getWindow().hide());
    }


}
