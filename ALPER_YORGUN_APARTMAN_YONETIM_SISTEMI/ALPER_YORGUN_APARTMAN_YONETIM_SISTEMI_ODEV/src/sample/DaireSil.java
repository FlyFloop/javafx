package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Ayrintilar.AlertBox;
import sample.fonksiyonlar.ListCustomers;
import sample.objeler.ApartmanSakini;

import java.sql.SQLException;

public class DaireSil {

    @FXML
    private TableView<ApartmanSakini> daireSilTableView;

    @FXML
    private TableColumn<ApartmanSakini, String> daireNoColumn;

    @FXML
    private TableColumn<ApartmanSakini, String> daireAdColumn;

    @FXML
    private TableColumn<ApartmanSakini, String> daireSoyAdColumn;

    @FXML
    private TextField daireNoTextField;

    @FXML
    private TextField daireAdTextField;

    @FXML
    private TextField daireSoyadTextField;

    @FXML
    void deleteDaire(ActionEvent event) throws SQLException {
        sample.fonksiyonlar.DaireSil.deleteDaire(daireAdTextField.getText(), daireSoyadTextField.getText(), daireNoTextField.getText());
        AlertBox.alertboxshow("Daire başarıyla silindi");
    }

    @FXML
    void List(ActionEvent event) throws SQLException {
        daireAdColumn.setCellValueFactory(new PropertyValueFactory<>("ad"));
        daireSoyAdColumn.setCellValueFactory(new PropertyValueFactory<>("soyad"));
        daireNoColumn.setCellValueFactory(new PropertyValueFactory<>("daireNo"));
        daireSilTableView.setItems(ListCustomers.getApartmanSakini());

    }

    @FXML
    void initialize() {
        assert daireSilTableView != null : "fx:id=\"daireSilTableView\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireNoColumn != null : "fx:id=\"daireNoColumn\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireAdColumn != null : "fx:id=\"daireAdColumn\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireSoyAdColumn != null : "fx:id=\"daireSoyAdColumn\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireNoTextField != null : "fx:id=\"daireNoTextField\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireAdTextField != null : "fx:id=\"daireAdTextField\" was not injected: check your FXML file 'DaireSil.fxml'.";
        assert daireSoyadTextField != null : "fx:id=\"daireSoyadTextField\" was not injected: check your FXML file 'DaireSil.fxml'.";

    }

}

