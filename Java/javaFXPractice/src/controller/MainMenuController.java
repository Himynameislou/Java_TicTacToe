package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    @FXML
    void onActionCreateAnimal(ActionEvent event) {
        System.out.println("Create button clicked");
    }

    @FXML
    void onActionDisplayAnimals(ActionEvent event) {
        System.out.println("Display button clicked");

    }

    @FXML
    void onActionExit(ActionEvent event) {
        System.out.println("Exit button clicked");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
