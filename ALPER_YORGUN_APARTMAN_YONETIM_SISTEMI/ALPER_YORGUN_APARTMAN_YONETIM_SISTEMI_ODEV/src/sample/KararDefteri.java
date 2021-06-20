package sample;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sample.Ayrintilar.AlertBox;
import sample.dataBase.AlinanKaralarToDatabase;
import sample.dataBase.ApartmanYonetimDB;
import sample.fonksiyonlar.ListKararlar;

public class KararDefteri {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField karardefteriTextfield;

    @FXML
    private ListView<String> kararlistview;


    @FXML
    void kararKaydetFunc(ActionEvent event) throws SQLException {
        AlinanKaralarToDatabase.addKarar(karardefteriTextfield.getText());
        AlertBox.alertboxshow("Karar başarıyla kaydedildi");
    }
    @FXML
    void kararSilFunc(ActionEvent event) throws SQLException {
        //kararlistview.getItems().remove(kararlistview.getSelectionModel().getSelectedIndex());
        System.out.println(kararlistview.getSelectionModel().getSelectedIndex()+1);
        AlinanKaralarToDatabase.kararSil(kararlistview.getSelectionModel().selectedItemProperty().getValue());
        AlertBox.alertboxshow("Karar başarıyla silindi");
    }
    @FXML
    void kararListeleFunc(ActionEvent event) throws SQLException {
        kararlistview.getItems().setAll(ListKararlar.kararlarıListele());
    }


    @FXML
    void initialize() {
        assert karardefteriTextfield != null : "fx:id=\"karardefteriTextfield\" was not injected: check your FXML file 'KararDefteri.fxml'.";
        assert kararlistview != null : "fx:id=\"kararlistview\" was not injected: check your FXML file 'KararDefteri.fxml'.";

    }
}
