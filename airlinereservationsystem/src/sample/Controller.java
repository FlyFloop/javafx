package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    void start(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/PageM.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
