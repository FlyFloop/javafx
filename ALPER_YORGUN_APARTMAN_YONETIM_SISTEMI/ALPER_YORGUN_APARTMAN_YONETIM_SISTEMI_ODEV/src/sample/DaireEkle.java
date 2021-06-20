package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import sample.Ayrintilar.AlertBox;
import sample.dataBase.CustomerToDatabase;
import sample.objeler.ApartmanSakini;

public class DaireEkle {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField adtextfield;

    @FXML
    private TextField soyadtextfield;

    @FXML
    private TextField tcnotextfield;

    @FXML
    private TextField telefontextfield;

    @FXML
    private TextField yastextfield;

    @FXML
    private TextField mailadrestextfield;

    @FXML
    private TextField adrestextfield;

    @FXML
    private TextField dairenotextfield;

    @FXML
    private TextField uyenotextfield;

    @FXML
    private TextField odemetipitextfield;

    @FXML
    private TextField bloknotextfield;

    @FXML
    private Button kaydetbutton;

    @FXML
    private ChoiceBox<String> cinsiyetBox;
    @FXML
    private ChoiceBox<String> oturmasekli;
    @FXML
    private TextField arabaMarkaTextfield;

    @FXML
    private TextField arabaPlakaTextField;
    double daireKaydetSayac;
/*
  ApartmanSakini apartmanSakini = new ApartmanSakini();
        apartmanSakini.setAd(adtextfield.getText());
        apartmanSakini.setSoyad(soyadtextfield.getText());
        apartmanSakini.setTcNo(tcnotextfield.getText());
        apartmanSakini.setCep(telefontextfield.getText());
        apartmanSakini.setYas(yastextfield.getText());
        apartmanSakini.setCinsiyet(cinsiyetBox.getValue());
        apartmanSakini.setDaireNo(dairenotextfield.getText());
        apartmanSakini.setUyeNo(uyenotextfield.getText());
        apartmanSakini.setOdemeTipi(odemetipitextfield.getText());
        apartmanSakini.setAdres(adrestextfield.getText());
        apartmanSakini.setMailAdresi(mailadrestextfield.getText());
        apartmanSakini.setBlokNo(bloknotextfield.getText());
        apartmanSakini.setOturmasekli(oturmasekli.getValue());
        apartmanSakini.kaydet();
                CustomerToDatabase.addToDatabase(adtextfield.getText(), soyadtextfield.getText(), tcnotextfield.getText(), telefontextfield.getText(), yastextfield.getText(), mailadrestextfield.getText(), adrestextfield.getText(), dairenotextfield.getText(), uyenotextfield.getText(), odemetipitextfield.getText(), bloknotextfield.getText(),cinsiyetBox.getValue(),oturmasekli.getValue());

 */
    @FXML
    void kaydetFunc(ActionEvent event) throws SQLException {
        CustomerToDatabase.addToDatabase(adtextfield.getText(), soyadtextfield.getText(), tcnotextfield.getText(), telefontextfield.getText(), yastextfield.getText(), mailadrestextfield.getText(), adrestextfield.getText(), dairenotextfield.getText(), uyenotextfield.getText(), odemetipitextfield.getText(), bloknotextfield.getText(),cinsiyetBox.getValue(),oturmasekli.getValue(),arabaMarkaTextfield.getText(),arabaPlakaTextField.getText());
        daireKaydetSayac++;
        ApartmanSakini.setDairesayi(daireKaydetSayac);
        AlertBox.alertboxshow("Daire Kaydedildi");
        textfieldtemizle();
    }

    @FXML
    void initialize() {
        cinsiyetBox.getItems().addAll("Erkek","Kadın","Belirtmek İstemiyorum");
        oturmasekli.getItems().addAll("Kiraci","Ev Sahibi");
        assert adtextfield != null : "fx:id=\"adtextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert soyadtextfield != null : "fx:id=\"soyadtextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert tcnotextfield != null : "fx:id=\"tcnotextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert telefontextfield != null : "fx:id=\"telefontextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert yastextfield != null : "fx:id=\"yastextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert mailadrestextfield != null : "fx:id=\"mailadrestextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert adrestextfield != null : "fx:id=\"adrestextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert dairenotextfield != null : "fx:id=\"dairenotextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert uyenotextfield != null : "fx:id=\"uyenotextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert odemetipitextfield != null : "fx:id=\"odemetipitextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert bloknotextfield != null : "fx:id=\"bloknotextfield\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert kaydetbutton != null : "fx:id=\"kaydetbutton\" was not injected: check your FXML file 'DaireEkle.fxml'.";
        assert cinsiyetBox != null : "fx:id=\"cinsiyetBox\" was not injected: check your FXML file 'DaireEkle.fxml'.";
    }
    public void textfieldtemizle(){
        adtextfield.setText("");
        soyadtextfield.setText("");
        tcnotextfield.setText("");
         telefontextfield.setText("");
   yastextfield.setText("");
      mailadrestextfield.setText("");
       adrestextfield.setText("");
        dairenotextfield.setText("");
        uyenotextfield.setText("");
       odemetipitextfield.setText("");
        bloknotextfield.setText("");
    }
}
