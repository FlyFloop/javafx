package sample.fonksiyonlar;

import sample.database.Dopen;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addCustomer {
    public static void addCustomerToDB(String name,String surname,String currency,String from,
                                       String to,String paid,String date,String flightid,
                                       String email,String telephonenumber,String citizen)
            throws SQLException {
        String sql = "INSERT INTO CUSTOMER(CNAME,CSNAME,CCURRENY,CFROM,CTO,CPAID,CDATE,CFID,CEMAIL,CTNUMBER,CCITIZEN) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = Dopen.openDB().prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surname);
        preparedStatement.setString(3, currency);
        preparedStatement.setString(4, from);
        preparedStatement.setString(5, to);
        preparedStatement.setString(6, paid);
        preparedStatement.setString(7, date);
        preparedStatement.setString(8, flightid);
        preparedStatement.setString(9, email);
        preparedStatement.setString(10, telephonenumber);
        preparedStatement.setString(11, citizen);
        preparedStatement.executeUpdate();
    }
}
