package sample.fonksiyonlar;

import sample.database.Dopen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchDb {
    public static boolean foundCustomer(String isim,String telno) throws SQLException {
        String sql = "SELECT CNAME,CTNUMBER FROM CUSTOMER";
        Statement statement = Dopen.openDB().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            if (resultSet.getString("CNAME").equals(isim) &&   resultSet.getString("CTNUMBER").equals(telno)){
                Dopen.closeDB();
                return  true;
            }
        }
        return false;
    }
}
