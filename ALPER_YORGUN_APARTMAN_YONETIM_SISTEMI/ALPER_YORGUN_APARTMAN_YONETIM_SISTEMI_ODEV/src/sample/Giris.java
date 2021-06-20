package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Ayrintilar.AlertBox;
import sample.fonksiyonlar.GirisKontrol;

public class Giris {



    @FXML
    private TextField ıdTextfield;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button girisYapButton;

    @FXML
    void girisYapFunc(ActionEvent event){
        if (GirisKontrol.login(ıdTextfield, passwordField)){
            try{
                Parent bilgi = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Bilgilendirme");
                stage.setScene(new Scene(bilgi));
                stage.show();
            }catch (Exception e){
                System.out.println("geçiş hatası");
            }
        }
        else {
            AlertBox.alertboxshow("Giriş Başarısız\n" +
                    "Lütfen tekrar deneyiniz");
        }
    }
    @FXML
    private Button quit;

    @FXML
    void cikisFunc(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }


    @FXML
    void initialize() {
        assert ıdTextfield != null : "fx:id=\"ıdTextfield\" was not injected: check your FXML file 'Giris.fxml'.";
        assert girisYapButton != null : "fx:id=\"girisYapButton\" was not injected: check your FXML file 'Giris.fxml'.";
        assert quit != null : "fx:id=\"quit\" was not injected: check your FXML file 'Giris.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'Giris.fxml'.";

    }
}