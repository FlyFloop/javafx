package sample.fonksiyonlar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.dataBase.ApartmanYonetimDB;
import sample.objeler.ApartmanSakini;
import sample.objeler.YonetimKurulu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class ListYonetim {
    public static ObservableList<YonetimKurulu> getYonetimKurulu() throws SQLException {
        ObservableList<YonetimKurulu> yonetimList = FXCollections.observableArrayList();
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM YONETIMKURULU");
        while (resultSet.next()){
            yonetimList.addAll(new YonetimKurulu(resultSet.getString("AD"),resultSet.getString("SOYAD"),resultSet.getString("DAIRENO")));
        }
        return yonetimList;
    }
}
