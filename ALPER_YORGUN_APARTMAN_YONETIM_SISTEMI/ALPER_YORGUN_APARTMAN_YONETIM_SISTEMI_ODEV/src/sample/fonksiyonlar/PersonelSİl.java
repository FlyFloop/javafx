package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonelSİl {
    public static void delete(String ad,String soyad,String gorev,String id) throws SQLException {
        String sql = "DELETE FROM PERSONEL WHERE PERSONELID = ?";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, id);
        preparedStatement.executeUpdate();

    }
}
