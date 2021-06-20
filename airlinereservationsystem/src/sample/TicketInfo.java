package sample;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.database.Dopen;
import sample.fonksiyonlar.SearchDb;

public class TicketInfo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label adLabel;

    @FXML
    private Label sNameLabel;

    @FXML
    private Label telnoLabel;

    @FXML
    private Label mailLabel;

    @FXML
    private Label countryLabel;

    @FXML
    private Label ticketKValue;

    @FXML
    private Label ticketCountLabel;

    @FXML
    private Label fromLabel;

    @FXML
    private Label toLabel;

    @FXML
    private Label amaountLabel;

    @FXML
    private TextField telnoTextField;

    @FXML
    private TextField surNameTextField;

    @FXML
    void getMyTicketInfo(ActionEvent event) throws SQLException {
        if (SearchDb.foundCustomer(surNameTextField.getText(), telnoTextField.getText())){
            System.out.println("arama basarili");

            String sql = "SELECT * FROM CUSTOMER WHERE CNAME = ?";
            PreparedStatement preparedStatement = Dopen.openDB().prepareStatement(sql);
            preparedStatement.setString(1, surNameTextField.getText());
            ResultSet resultSet = preparedStatement.executeQuery();
            adLabel.setText(resultSet.getString("CNAME"));
            sNameLabel.setText(resultSet.getString("CSNAME"));
            telnoLabel.setText(resultSet.getString("CTNUMBER"));
            mailLabel.setText(resultSet.getString("CEMAIL"));
            countryLabel.setText(resultSet.getString("CCITIZEN"));
            ticketKValue.setText("gidis donus");
            ticketCountLabel.setText(resultSet.getString("CDATE"));
            fromLabel.setText(resultSet.getString("CFROM"));
            toLabel.setText(resultSet.getString("CTO"));
            amaountLabel.setText(resultSet.getString("CPAID"));


        }

    }

    @FXML
    void initialize() {
        assert adLabel != null : "fx:id=\"adLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert sNameLabel != null : "fx:id=\"sNameLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert telnoLabel != null : "fx:id=\"telnoLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert mailLabel != null : "fx:id=\"mailLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert countryLabel != null : "fx:id=\"countryLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert ticketKValue != null : "fx:id=\"ticketKValue\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert ticketCountLabel != null : "fx:id=\"ticketCountLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert fromLabel != null : "fx:id=\"fromLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert toLabel != null : "fx:id=\"toLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert amaountLabel != null : "fx:id=\"amaountLabel\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert telnoTextField != null : "fx:id=\"telnoTextField\" was not injected: check your FXML file 'TicketInfo.fxml'.";
        assert surNameTextField != null : "fx:id=\"surNameTextField\" was not injected: check your FXML file 'TicketInfo.fxml'.";

    }
}
