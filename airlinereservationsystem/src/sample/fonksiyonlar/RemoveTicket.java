package sample.fonksiyonlar;

import sample.database.Dopen;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveTicket {
    public static void ticket(String number) throws SQLException {
        String sql = "DELETE FROM CUSTOMER WHERE CTNUMBER = ?";
        PreparedStatement preparedStatement = Dopen.openDB().prepareStatement(sql);
        preparedStatement.setString(1, number);
        preparedStatement.executeUpdate();

    }
}
