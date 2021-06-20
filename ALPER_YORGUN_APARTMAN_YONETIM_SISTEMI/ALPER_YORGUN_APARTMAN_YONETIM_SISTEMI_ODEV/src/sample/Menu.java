package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label randomlabel;


        @FXML
        void addDaire(ActionEvent event) {
            try{
                Parent DaireEkle = FXMLLoader.load(getClass().getResource("fxml/DaireEkle.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Daire Ekle");
                stage.setScene(new Scene(DaireEkle));
                stage.show();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        @FXML
        void aidatHesaplaFunc(ActionEvent event) throws IOException {
            Parent aidatHesapla = FXMLLoader.load(getClass().getResource("fxml/AidatHesapla.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Aidat Hesapla");
            stage.setScene(new Scene(aidatHesapla));
            stage.show();
        }


        @FXML
        void apartmanpersonelFunc(ActionEvent event) throws IOException {
            Parent kararDefteri = FXMLLoader.load(getClass().getResource("fxml/ApartmanPersonel.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Apartman Personel Sayfası");
            stage.setScene(new Scene(kararDefteri));
            stage.show();
        }

        @FXML
        void dairesilFunc(ActionEvent event) throws IOException {
            Parent dairesil = FXMLLoader.load(getClass().getResource("fxml/DaireSil.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Daire Silme Sayfası");
            stage.setScene(new Scene(dairesil));
            stage.show();
        }

        @FXML
        void kapat(ActionEvent event) {
            Platform.exit();
            System.exit(0);
        }

        @FXML
        void karardefteriFunc(ActionEvent event) throws IOException {
            Parent kararDefteri = FXMLLoader.load(getClass().getResource("fxml/KararDefteri.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Apartman Kararlarını Gir");
            stage.setScene(new Scene(kararDefteri));
            stage.show();
        }

        @FXML
        void otopartFunc(ActionEvent event) throws  IOException {
            Parent otopark = FXMLLoader.load(getClass().getResource("fxml/Otopark.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Otopark Sayfası");
            stage.setScene(new Scene(otopark));
            stage.show();
        }

        @FXML
        void showDaires(ActionEvent event) throws IOException {
            Parent showDaire = FXMLLoader.load(getClass().getResource("fxml/DaireListe.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Daireleri Listele");
            stage.setScene(new Scene(showDaire));
            stage.show();
        }

        @FXML
        void yonetimKuruluFunc(ActionEvent event) throws IOException {
            Parent yonetim = FXMLLoader.load(getClass().getResource("fxml/YonetimKurulu.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Yonetim Kurulu Sayfası");
            stage.setScene(new Scene(yonetim));
            stage.show();
        }




    @FXML
    void initialize() {
        assert randomlabel != null : "fx:id=\"randomlabel\" was not injected: check your FXML file 'Menu.fxml'.";

    }
}


