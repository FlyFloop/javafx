package sample;

import java.net.URL;
import java.sql.SQLException;
import java.time.temporal.ChronoUnit;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import sample.fonksiyonlar.AlertBox;

import sample.fonksiyonlar.Get;
import static java.time.temporal.ChronoUnit.DAYS;
import sample.fonksiyonlar.addCustomer;

import static sample.PageM.staticCurrency;

public class Ticket {

    @FXML
    private RadioButton roundTrip;

    @FXML
    private RadioButton oneWay;

    @FXML
    private TextField fromTextField;

    @FXML
    private TextField toTextField;

    @FXML
    private Label toLabelOne;

    @FXML
    private DatePicker fromDate;

    @FXML
    private DatePicker toDate;

    @FXML
    private Slider customerSize;

    @FXML
    private Label customerValue;

    @FXML
    private Label piadTitle;

    @FXML
    private Label labelCustomerSize;

    @FXML
    private Label customerSizeLabel;

    @FXML
    private Label from;

    @FXML
    private Label fromLabel;

    @FXML
    private Label to;

    @FXML
    private Label toLabel;

    @FXML
    private Label ticketLabel;

    @FXML
    private Label ticketValue;

    @FXML
    private Label paidLabel;

    @FXML
    private Label paidValue;

    @FXML
    private Button buyTicketId;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label sliderCustomerSizeLabel;

    @FXML
    private TextField surnameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField citizenTextField;

    @FXML
    private TextField telephoneNumberTextField;





    String currency;
    int totaldays;
    @FXML
    void buyTicket(ActionEvent event) throws SQLException {
        totaldays = (int) ChronoUnit.DAYS.between(fromDate.getValue(), toDate.getValue());
        addCustomer.addCustomerToDB(nameTextField.getText(),surnameTextField.getText(),currency, fromDate.getValue().toString(), toDate.getValue().toString(), Get.paid(currency, totaldays, (int)customerSize.getValue()), Get.flightID(), emailTextField.getText(), telephoneNumberTextField.getText(), citizenTextField.getText(), String.valueOf((int)customerSize.getValue()));


    }

    @FXML
    void getSliderValue(MouseEvent event) {
        sliderCustomerSizeLabel.setText(String.valueOf((int)customerSize.getValue()));

    }

    @FXML
    void infoTicket(ActionEvent event) {
        if (fromDate.getValue().isBefore(toDate.getValue())){
        }else {
            AlertBox.show("Gidis tarihi donus tarihinden daha once olamaz");
            System.exit(0);
        }
        labelCustomerSize.setText(String.valueOf((int)customerSize.getValue()));
        from.setText(fromTextField.getText());
        to.setText(toTextField.getText());
        totaldays  = (int) ChronoUnit.DAYS.between(fromDate.getValue(), toDate.getValue());
        ticketValue.setText("gidis donus");
        paidValue.setText(Get.paid(currency, totaldays, (int)customerSize.getValue()) + " "+currency);
        visiableTrue();

    }

    @FXML
    void oneWayFunc(ActionEvent event) {
        toDate.setVisible(false);
        toLabelOne.setVisible(false);
        toTextField.setVisible(false);
    }

    @FXML
    void roundTripFunc(ActionEvent event) {
        toDate.setVisible(true);
        toLabelOne.setVisible(true);
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
        visiableFalse();
    }

    public void visiableFalse(){
        piadTitle.setVisible(false);
        customerSizeLabel.setVisible(false);
        labelCustomerSize.setVisible(false);
        fromLabel.setVisible(false);
        from.setVisible(false);
        toLabel.setVisible(false);
        to.setVisible(false);
        ticketLabel.setVisible(false);
        ticketValue.setVisible(false);
        paidLabel.setVisible(false);
        paidValue.setVisible(false);
        buyTicketId.setVisible(false);
    }
    public void visiableTrue(){
        piadTitle.setVisible(true);
        customerSizeLabel.setVisible(true);
        labelCustomerSize.setVisible(true);
        fromLabel.setVisible(true);
        from.setVisible(true);
        toLabel.setVisible(true);
        to.setVisible(true);
        ticketLabel.setVisible(true);
        ticketValue.setVisible(true);
        paidLabel.setVisible(true);
        paidValue.setVisible(true);
        buyTicketId.setVisible(true);
    }
}
