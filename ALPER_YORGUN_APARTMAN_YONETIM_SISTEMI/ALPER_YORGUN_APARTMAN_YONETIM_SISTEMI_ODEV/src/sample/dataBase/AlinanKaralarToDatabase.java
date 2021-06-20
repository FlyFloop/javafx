package sample.dataBase;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlinanKaralarToDatabase {
    public static void addKarar(String karar) throws SQLException {
        String sql = "INSERT INTO ALINANKARARLAR(KARAR) VALUES ('"+karar+"')";
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        statement.executeUpdate(sql);
    }
    public static void kararSil(String karar) throws SQLException {
        String sql = "DELETE FROM ALINANKARARLAR WHERE KARAR = ?";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, karar);
        preparedStatement.executeUpdate();

    }
}
