package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.database.Dopen;
import sample.fonksiyonlar.AlertBox;
import sample.fonksiyonlar.SearchDb;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RemoveTicket {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ticketTNumber;

    @FXML
    private TextField ticketName;

    @FXML
    void removeTicket(ActionEvent event) throws SQLException {

            sample.fonksiyonlar.RemoveTicket.ticket(ticketTNumber.getText());
            AlertBox.show("Silme Basarili");
        
    }

    @FXML
    void initialize() {
        assert ticketTNumber != null : "fx:id=\"ticketTNumber\" was not injected: check your FXML file 'RemoveTicket.fxml'.";
        assert ticketName != null : "fx:id=\"ticketName\" was not injected: check your FXML file 'RemoveTicket.fxml'.";

    }

}
