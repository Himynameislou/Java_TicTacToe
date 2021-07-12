package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class DisplayAnimalMenuController implements Initializable {

    @FXML
    private TableView<?> animalTableView;

    @FXML
    private TableColumn<?, ?> animalIDCol;

    @FXML
    private TableColumn<?, ?> breedCol;

    @FXML
    private TableColumn<?, ?> lifespanCol;

    @FXML
    private TableColumn<?, ?> priceCol;

    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) {

    }

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
