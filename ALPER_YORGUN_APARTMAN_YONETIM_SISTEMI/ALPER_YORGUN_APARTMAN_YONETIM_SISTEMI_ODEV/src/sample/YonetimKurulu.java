package sample;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Ayrintilar.AlertBox;
import sample.dataBase.ApartmanYonetimDB;
import sample.fonksiyonlar.ListCustomers;
import sample.fonksiyonlar.ListYonetim;
import sample.fonksiyonlar.YonetimKuruluEkle;
import sample.fonksiyonlar.YonetimKuruluSil;

public class YonetimKurulu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<sample.objeler.YonetimKurulu> yonetimKurulu;

    @FXML
    private TableColumn<sample.objeler.YonetimKurulu, String> daireno;

    @FXML
    private TableColumn<sample.objeler.YonetimKurulu, String> daireAd;

    @FXML
    private TableColumn<sample.objeler.YonetimKurulu, String> daireSoyad;

    @FXML
    private TextField yonetimno;

    @FXML
    private TextField yonetimad;

    @FXML
    private TextField yonetimsoyad;

    @FXML
    void addYonetim(ActionEvent event)  throws  SQLException{
        YonetimKuruluEkle.addYonetimKurulu(yonetimad.getText(), yonetimsoyad.getText(), yonetimno.getText());
        AlertBox.alertboxshow("Yonetim Kuruluna Ekleme Başarılı");
    }

    @FXML
    void deleteYonetim(ActionEvent event) throws SQLException {
        YonetimKuruluSil.deleteYonetimKurulu(yonetimno.getText());
        AlertBox.alertboxshow("Yonetim Kurulundan Silme Başarılı");
    }

    @FXML
    void listYonetim(ActionEvent event) throws SQLException {
        daireAd.setCellValueFactory(new PropertyValueFactory<>("ad"));
        daireSoyad.setCellValueFactory(new PropertyValueFactory<>("soyad"));

        daireno.setCellValueFactory(new PropertyValueFactory<>("daireNo"));
        yonetimKurulu.setItems(ListYonetim.getYonetimKurulu());

    }

    @FXML
    void initialize() {
        assert yonetimKurulu != null : "fx:id=\"yonetimKurulu\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert daireno != null : "fx:id=\"daireno\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert daireAd != null : "fx:id=\"daireAd\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert daireSoyad != null : "fx:id=\"daireSoyad\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert yonetimno != null : "fx:id=\"yonetimno\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert yonetimad != null : "fx:id=\"yonetimad\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";
        assert yonetimsoyad != null : "fx:id=\"yonetimsoyad\" was not injected: check your FXML file 'YonetimKurulu.fxml'.";

    }
}
