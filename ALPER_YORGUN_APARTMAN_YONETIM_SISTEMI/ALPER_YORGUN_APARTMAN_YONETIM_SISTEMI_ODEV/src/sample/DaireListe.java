package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.fonksiyonlar.ListCustomers;
import sample.objeler.ApartmanSakini;

public class DaireListe  implements Initializable  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<ApartmanSakini> daireListTableView;

    @FXML
    private TableColumn<ApartmanSakini, String> Ad;

    @FXML
    private TableColumn<ApartmanSakini, String>soyad;

    @FXML
    private TableColumn<ApartmanSakini, String>tcno;

    @FXML
    private TableColumn<ApartmanSakini, String> telefonno;

    @FXML
    private TableColumn<ApartmanSakini, String> yas;

    @FXML
    private TableColumn<ApartmanSakini, String> cinsiyet;

    @FXML
    private TableColumn<ApartmanSakini, String> daireno;

    @FXML
    private TableColumn<ApartmanSakini, String> uyeno;

    @FXML
    private TableColumn<ApartmanSakini, String> odeme;

    @FXML
    private TableColumn<ApartmanSakini, String> adres;

    @FXML
    private TableColumn<ApartmanSakini, String> mailadres;

    @FXML
    private TableColumn<ApartmanSakini, String> blokno;
    @FXML
    private TableColumn<ApartmanSakini, String> oturmasekli;

    @FXML
    void listFunc(ActionEvent event) throws SQLException {

        Ad.setCellValueFactory(new PropertyValueFactory<>("ad"));
        soyad.setCellValueFactory(new PropertyValueFactory<>("soyad"));

        tcno.setCellValueFactory(new PropertyValueFactory<>("tcNo"));

        telefonno.setCellValueFactory(new PropertyValueFactory<>("cep"));

        yas.setCellValueFactory(new PropertyValueFactory<>("yas"));

        cinsiyet.setCellValueFactory(new PropertyValueFactory<>("cinsiyet"));

        daireno.setCellValueFactory(new PropertyValueFactory<>("daireNo"));

        uyeno.setCellValueFactory(new PropertyValueFactory<>("uyeNo"));

        odeme.setCellValueFactory(new PropertyValueFactory<>("odemeTipi"));

        adres.setCellValueFactory(new PropertyValueFactory<>("adres"));

        mailadres.setCellValueFactory(new PropertyValueFactory<>("mailAdresi"));

        blokno.setCellValueFactory(new PropertyValueFactory<>("blokNo"));
        oturmasekli.setCellValueFactory(new PropertyValueFactory<>("oturmasekli"));

        daireListTableView.setItems(ListCustomers.getApartmanSakini());
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
