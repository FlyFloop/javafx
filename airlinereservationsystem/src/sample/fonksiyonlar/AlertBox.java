package sample.fonksiyonlar;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertBox {
    public static void show(String message){
        Stage stage = new Stage();
        Label label = new Label(message);
        Button confirmationButton = new Button("Tamam");
        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label,confirmationButton);
        confirmationButton.setOnAction(e->{
            stage.close();
        });
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox);
        stage.setMinWidth(250);
        stage.setMinHeight(250);
        stage.setScene(scene);
        stage.show();
    }
}
