package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimalDetailsMenuController implements Initializable {

    @FXML
    private Label animalIDLbl;

    @FXML
    private Label breedLbl;

    @FXML
    private Label lifespanLbl;

    @FXML
    private Label behaviorLbl;

    @FXML
    private Label priceLbl;

    @FXML
    private Label vaccLbl;

    @FXML
    private Label specialLbl;

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
