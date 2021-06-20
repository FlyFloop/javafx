package sample.fonksiyonlar;

import sample.database.Dopen;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckIn {
    public static boolean Do(String name,String telno) throws SQLException {

            try{
                String sql = "UPDATE CUSTOMER SET CHECKIN = ? WHERE CTNUMBER = ?";
                PreparedStatement preparedStatement = Dopen.openDB().prepareStatement(sql);
                preparedStatement.setString(1, "DONE");
                preparedStatement.setString(2, telno);
                preparedStatement.executeUpdate();
                Dopen.closeDB();
                return true;
            }catch (Exception e) {
                e.printStackTrace();
                return false;
            }
    }
}
