package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.database.Dopen;
import sample.fonksiyonlar.AlertBox;
import sample.fonksiyonlar.SearchDb;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CheckIn {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField customerNameTextField;

    @FXML
    private TextField customerTelNoTextField;
    @FXML
    private Button checkInButton;

    @FXML
    void getCheck(ActionEvent event) throws SQLException {
        boolean temp = sample.fonksiyonlar.CheckIn.Do(customerNameTextField.getText(), customerTelNoTextField.getText());
        if (temp){
            AlertBox.show("Yolcu Bulundu ve Check-in yapildi");
            checkInButton.setVisible(false);
        }else{
            AlertBox.show("Yolcu Bulunamadi ve Check-in yapilamadi");
        }

    }
    @FXML
    void getCheckInToMyTicket(ActionEvent event) throws SQLException {
      //  sample.fonksiyonlar.CheckIn.Do(customerNameTextField.getText(), customerTelNoTextField.getText());
    }

    @FXML
    void initialize() {
        assert customerNameTextField != null : "fx:id=\"customerNameTextField\" was not injected: check your FXML file 'CheckIn.fxml'.";
        assert customerTelNoTextField != null : "fx:id=\"customerTelNoTextField\" was not injected: check your FXML file 'CheckIn.fxml'.";
        checkInButton.setVisible(false);
    }
}
