package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class YonetimKuruluSil {
    public static void deleteYonetimKurulu(String daireno) throws SQLException {
        String sql = "DELETE FROM YONETIMKURULU WHERE DAIRENO = ?";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, daireno);
        preparedStatement.executeUpdate();
    }
}
