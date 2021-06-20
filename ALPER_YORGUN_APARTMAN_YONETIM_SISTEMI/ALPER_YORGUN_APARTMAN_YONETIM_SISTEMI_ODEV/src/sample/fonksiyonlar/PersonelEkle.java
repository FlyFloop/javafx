package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonelEkle {
    public static void addPersonel(String ad,String soyad,String gorev,String id) throws SQLException {
        String sql = "INSERT INTO PERSONEL(PERSONELAD,PERSONELSOYAD,PERSONELGOREV,PERSONELID) VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, ad);
        preparedStatement.setString(2, soyad);
        preparedStatement.setString(3, gorev);
        preparedStatement.setString(4, id);
        preparedStatement.executeUpdate();
    }
}
