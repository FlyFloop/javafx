package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import sample.dataBase.ApartmanYonetimDB;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ApartmanYonetimDB.OpenDB();
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Giris.fxml"));
        primaryStage.setTitle("Apartman Yönetim Sistemi");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
