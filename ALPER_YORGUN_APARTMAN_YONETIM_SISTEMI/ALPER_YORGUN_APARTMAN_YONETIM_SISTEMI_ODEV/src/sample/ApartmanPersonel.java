package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.css.CssParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Ayrintilar.AlertBox;
import sample.fonksiyonlar.ListPersonel;
import sample.fonksiyonlar.ListYonetim;
import sample.fonksiyonlar.PersonelEkle;
import sample.fonksiyonlar.PersonelSİl;
import sample.objeler.Personel;

public class ApartmanPersonel {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Personel, String> personelSoyad;

    @FXML
    private TableColumn<Personel, String> personelGorev;

    @FXML
    private TableColumn<Personel, String> personelAD;
    @FXML
    private TableView<Personel> personeltableview;
    @FXML
    private TableColumn<Personel, String> personelNo;

    @FXML
    private TextField personelNO;

    @FXML
    private TextField personelAdTextfiled;

    @FXML
    private TextField personelSoyadTextfield;

    @FXML
    private TextField personelGorevTextFiled;

    @FXML
    void ListPersonel(ActionEvent event) throws SQLException {
        personelAD.setCellValueFactory(new PropertyValueFactory<>("ad"));
        personelSoyad.setCellValueFactory(new PropertyValueFactory<>("soyad"));
        personelGorev.setCellValueFactory(new PropertyValueFactory<>("gorev"));
        personelNo.setCellValueFactory(new PropertyValueFactory<>("no"));
        personeltableview.setItems(ListPersonel.getYonetimKurulu());
    }

    @FXML
    void addPersonel(ActionEvent event) throws SQLException {
        PersonelEkle.addPersonel(personelAdTextfiled.getText(), personelSoyadTextfield.getText(), personelGorevTextFiled.getText(), personelNO.getText());
        AlertBox.alertboxshow("Personel başarıyla silindi");

    }

    @FXML
    void deletePersonel(ActionEvent event)  throws  SQLException{
        PersonelSİl.delete(personelAdTextfiled.getText(), personelSoyadTextfield.getText(), personelGorevTextFiled.getText(), personelNO.getText());
        AlertBox.alertboxshow("Personel başarıyla silindi");

    }

    @FXML
    void initialize() {
    }
}
