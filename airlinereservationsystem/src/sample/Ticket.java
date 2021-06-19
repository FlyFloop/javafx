package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import static sample.PageM.staticCurrency;

public class Ticket {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton roundTrip;

    @FXML
    private RadioButton oneWay;

    @FXML
    private TextField fromTextField;

    @FXML
    private TextField toTextField;

    @FXML
    private Label toLabel;

    @FXML
    private DatePicker fromDate;

    @FXML
    private DatePicker toDate;

    @FXML
    private Slider customerSize;

    @FXML
    private Label customerValue;

    @FXML
    private Label labelCustomerSize;

    @FXML
    private Label customerSizeLabel;

    @FXML
    private Label from;

    @FXML
    private Label piadTitle;

    @FXML
    private Label fromLabel;

    @FXML
    private Label to;

    @FXML
    private Label ticketValue;

    @FXML
    private Label paidLabel;

    @FXML
    private Label paidValue;

    @FXML
    private Button buyTicketId;

    String currency;

    @FXML
    void buyTicket(ActionEvent event) {

    }

    @FXML
    void getSliderValue(MouseEvent event) {

    }

    @FXML
    void infoTicket(ActionEvent event) {

    }

    @FXML
    void oneWayFunc(ActionEvent event) {
        toDate.setVisible(false);
        toLabel.setVisible(false);
        toTextField.setVisible(false);
    }

    @FXML
    void roundTripFunc(ActionEvent event) {
        toDate.setVisible(true);
        toLabel.setVisible(true);
        toTextField.setVisible(true);
    }

    @FXML
    void initialize() {
        assert roundTrip != null : "fx:id=\"roundTrip\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert oneWay != null : "fx:id=\"oneWay\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert fromTextField != null : "fx:id=\"fromTextField\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert toTextField != null : "fx:id=\"toTextField\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert toLabel != null : "fx:id=\"toLabel\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert fromDate != null : "fx:id=\"fromDate\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert toDate != null : "fx:id=\"toDate\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert customerSize != null : "fx:id=\"customerSize\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert customerValue != null : "fx:id=\"customerValue\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert labelCustomerSize != null : "fx:id=\"labelCustomerSize\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert from != null : "fx:id=\"from\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert to != null : "fx:id=\"to\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert ticketValue != null : "fx:id=\"ticketValue\" was not injected: check your FXML file 'Ticket.fxml'.";
        assert paidLabel != null : "fx:id=\"paidLabel\" was not injected: check your FXML file 'Ticket.fxml'.";
        currency = staticCurrency;

    }
}
