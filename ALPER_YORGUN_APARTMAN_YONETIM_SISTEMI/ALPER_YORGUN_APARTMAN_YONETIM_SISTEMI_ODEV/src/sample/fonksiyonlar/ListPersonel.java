package sample.fonksiyonlar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.dataBase.ApartmanYonetimDB;
import sample.objeler.Personel;
import sample.objeler.YonetimKurulu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListPersonel {
    public static ObservableList<Personel> getYonetimKurulu() throws SQLException {
        ObservableList<Personel> personelList = FXCollections.observableArrayList();
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSONEL");
        while (resultSet.next()){
            personelList.addAll(new Personel(resultSet.getString("PERSONELAD"),resultSet.getString("PERSONELSOYAD"),resultSet.getString("PERSONELGOREV"),resultSet.getString("PERSONELID")));
        }
        return personelList;
    }
}
