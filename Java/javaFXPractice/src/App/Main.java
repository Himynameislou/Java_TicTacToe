package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DataProvider;
import model.Dog;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
        primaryStage.setTitle("Animal Application");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        //Pre-populated Dog data for initial TableView
        Dog dog1 = new Dog(1, "Siberian Husky", 15, "Crafty", 599., true, "Whistles");
        Dog dog2 = new Dog(2, "Sug", 5, "Boring", 99., true, "Sleeps");
        Dog dog3 = new Dog(3, "Dalmation", 14, "Energetic", 399., true, "Climbs");
        Dog dog4 = new Dog(4, "Basset Hound", 12, "Lethargic", 6996., true, "Food Ninja");
        Dog dog5 = new Dog(5, "Mut", 22, "Loyal", 20., true, "Great friend");

        //Added Dogs to ObservableList via our DataProvider class and addAnimal static method.
        DataProvider.addAnimal(dog1);
        DataProvider.addAnimal(dog2);
        DataProvider.addAnimal(dog3);
        DataProvider.addAnimal(dog4);
        DataProvider.addAnimal(dog5);

        launch(args);
    }
}
