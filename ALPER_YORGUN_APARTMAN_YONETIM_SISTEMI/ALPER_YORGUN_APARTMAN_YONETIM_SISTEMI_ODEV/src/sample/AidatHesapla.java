package sample;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.dataBase.ApartmanYonetimDB;
import sample.objeler.ApartmanSakini;
/*
yönetim
apartman personeli
apartman gelirleri
apartman giderleri
 */

public class AidatHesapla {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aidatTextfield;

    @FXML
    private TextArea aidatTextpane;

    double aylikGider = 0;
    double kisibasiAidat = 0;


    @FXML
    void aidatHesapla(ActionEvent event) throws SQLException {
        double dairesayisi = 0;
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT  COUNT(NAME)  FROM CUSTOMER");
        dairesayisi = resultSet.getInt(1);


        System.out.println(dairesayisi);
        aylikGider = Double.parseDouble(aidatTextfield.getText());
        if (dairesayisi != 0){
            kisibasiAidat = aylikGider / dairesayisi;
            aidatTextpane.setText("Aylık gider:"+aylikGider+"\nToplam daire sayisi:"+dairesayisi+"\nDaire başı aidat tutarı:"+kisibasiAidat);
        }else {
            aidatTextpane.setText("Bütün daireler boş olduğu için aidat ödeyecek kimse yok.");
        }
    }

    @FXML
    void initialize() {
        assert aidatTextfield != null : "fx:id=\"aidatTextfield\" was not injected: check your FXML file 'AidatHesapla.fxml'.";
        assert aidatTextpane != null : "fx:id=\"aidatTextpane\" was not injected: check your FXML file 'AidatHesapla.fxml'.";

    }
}
