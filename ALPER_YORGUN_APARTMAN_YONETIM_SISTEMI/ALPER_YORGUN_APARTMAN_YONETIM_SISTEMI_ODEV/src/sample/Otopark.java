package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.fonksiyonlar.ListCustomers;
import sample.objeler.ApartmanSakini;

public class Otopark {

    @FXML
    private TableView<ApartmanSakini> carsTableView;

    @FXML
    private TableColumn<ApartmanSakini, String> daireNo;

    @FXML
    private TableColumn<ApartmanSakini, String> daireAD;

    @FXML
    private TableColumn<ApartmanSakini, String> daireSoyad;

    @FXML
    private TableColumn<ApartmanSakini, String> daireCarName;

    @FXML
    private TableColumn<ApartmanSakini, String> dairePlaque;

    @FXML
    void listCarsFunc(ActionEvent event) throws SQLException {
        daireNo.setCellValueFactory(new PropertyValueFactory<>("daireNo"));
        daireAD.setCellValueFactory(new PropertyValueFactory<>("ad"));
        daireSoyad.setCellValueFactory(new PropertyValueFactory<>("soyad"));
        daireCarName.setCellValueFactory(new PropertyValueFactory<>("arabaMarka"));
        dairePlaque.setCellValueFactory(new PropertyValueFactory<>("arabaPlaka"));
        carsTableView.setItems(ListCustomers.getApartmanSakini());
    }

    @FXML
    void initialize() {

    }
}
