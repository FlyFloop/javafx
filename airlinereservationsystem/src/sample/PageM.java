package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.database.Dopen;
import sample.fonksiyonlar.Get;

import javax.swing.plaf.DesktopIconUI;

public class PageM {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label info;

    @FXML
    private Label covd;

    @FXML
    private ChoiceBox<String> currency;

    public static String staticCurrency;



    String dollar = "Dollar";
    String euro = "Euro";
    String pound = "Pound";
    String turklira = "Turk Lira";
    String covidInfoUrl = "https://www.turkishairlines.com/tr-int/duyurular/coronavirus-salgini/seyahat-kisitlamalari/";
    String infoUrl = "https://www.turkishairlines.com/tr-int/basin-odasi/hakkimizda/";


    @FXML
    void getCheckIn(MouseEvent event) throws IOException {
        Parent checkIn = FXMLLoader.load(getClass().getResource("fxml/CheckIn.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(checkIn));
        primaryStage.show();

    }

    @FXML
    void getCovidInfo(MouseEvent event) throws IOException {
        Desktop.getDesktop().browse(URI.create(covidInfoUrl));
    }

    @FXML
    void getInfo(MouseEvent event) throws IOException {
        Desktop.getDesktop().browse(URI.create(infoUrl));
    }
    @FXML
    void getMyTicketInfo(MouseEvent event) throws IOException{
        Parent ticketInfo = FXMLLoader.load(getClass().getResource("fxml/TicketInfo.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(ticketInfo));
        primaryStage.show();
    }
    @FXML
    void getSurvey(MouseEvent event) {


    }

    @FXML
    void getRemoveTicket(MouseEvent event) {

    }

    @FXML
    void getTicket(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Ticket.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void initialize() {
        assert info != null : "fx:id=\"info\" was not injected: check your FXML file 'PageM.fxml'.";
        assert covd != null : "fx:id=\"covd\" was not injected: check your FXML file 'PageM.fxml'.";
        assert currency != null : "fx:id=\"currency\" was not injected: check your FXML file 'PageM.fxml'.";
        currency.getItems().addAll(dollar,euro,pound,turklira);
        currency.setValue(turklira);
        staticCurrency = currency.getValue();

    }
}
