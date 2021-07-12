package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateAnimalMenuController implements Initializable {

    @FXML
    private TextField animalIDTxt;

    @FXML
    private TextField breedTxt;

    @FXML
    private TextField lifespanTxt;

    @FXML
    private TextField behaviorTxt;

    @FXML
    private TextField priceTxt;

    @FXML
    private RadioButton vaccYesRBtn;

    @FXML
    private RadioButton vaccNoRBtn;

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) {

    }

    @FXML
    void onActionSaveAnimal(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
