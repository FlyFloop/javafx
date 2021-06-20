package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaireSil {
    public static void deleteDaire(String ad,String soyad,String id) throws SQLException {
        String sql = "DELETE FROM CUSTOMER WHERE APARTMENTNO = ?";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, id);
        preparedStatement.executeUpdate();

    }
}
