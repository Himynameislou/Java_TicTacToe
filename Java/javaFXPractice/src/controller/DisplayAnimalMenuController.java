package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Animal;
import model.DataProvider;
import model.Dog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DisplayAnimalMenuController implements Initializable {
    Stage stage;
    Parent scene;
    @FXML
    private TableView<Animal> animalTableView;

    @FXML
    private TableColumn<Animal, Integer> animalIDCol;

    @FXML
    private TableColumn<Animal, String> breedCol;

    @FXML
    private TableColumn<Animal, Integer> lifespanCol;

    @FXML
    private TableColumn<Animal, Double> priceCol;

    @FXML
    void onActionDisplayAnimalDetailsMenu(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/AnimalDetailsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void onActionDisplayMainMenu(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    /*
    * These next few methods deal with adding a new dog object, updating a dog object, and removing dog object from ArrayList
    * */


    //method to be able to search through animal array list in UI
    public boolean search(int id)
    {
        for(Animal dog : DataProvider.getAllAnimals()) {
            if (dog.getId() == id)
                return true;
        }
        return false;
    }

    //Defining method that will perform update
    public boolean update(int id, Animal animal)
    {
        int index = -1;
        for(Animal dog : DataProvider.getAllAnimals())
        {
            index++;
            if(dog.getId() == id)
            {
                DataProvider.getAllAnimals().set(index, animal);
                return true;
            }
        }
        return false;
    }

    //Defining method for removing Object
    public boolean delete(int id)
    {
        for(Animal dog : DataProvider.getAllAnimals())
        {
            if(dog.getId() == id)
            {
                return DataProvider.getAllAnimals().remove(dog);
            }
        }
            return false;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Setting cell values in TableView
        //Letting table know where it's data is coming from
        animalTableView.setItems(DataProvider.getAllAnimals());
        //Setting columns and rows to data
        animalIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        breedCol.setCellValueFactory(new PropertyValueFactory<>("breed"));
        lifespanCol.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));


        //testing to see if search method works
        /*if(search(7))
            System.out.println("Found");
        else
            System.out.println("Not found");
         */

        //testing update method
        /*if(update(5, new Dog(5, "German Shepard", 11, "Feisty", 499, true, "Great friend")))
            System.out.println("Update Worked");
        else
            System.out.println("Update Failed");
         */

        //testing delete method
        /*
        if(delete(7))
            System.out.println("Delete worked");
        else
            System.out.println("Delete Failed");
         */
    }
}
