package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class YonetimKuruluEkle{
    public static void addYonetimKurulu(String ad,String soyad,String daireno) throws SQLException {
        String sql = "INSERT INTO YONETIMKURULU(AD,SOYAD,DAIRENO) VALUES(?,?,?)";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, ad);
        preparedStatement.setString(2, soyad);
        preparedStatement.setString(3, daireno);
        preparedStatement.executeUpdate();
    }
}
