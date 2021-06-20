package sample.fonksiyonlar;

import sample.database.Dopen;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addCustomer {
    public static void addCustomerToDB(String name,String surname,String currency,String from,
                                       String to,String paid,String flightid,
                                       String email,String telephonenumber,String citizen,String customersize,
    String date)
            throws SQLException {
        String sql = "INSERT INTO CUSTOMER(CNAME,CCURRENY,CFROM,CTO,CPAID,CSNAME,CFID,CEMAIL,CTNUMBER,CCITIZEN,CSIZE,CDATE,CHECKIN) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = Dopen.openDB().prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, currency);
        preparedStatement.setString(3, from);
        preparedStatement.setString(4, to);
        preparedStatement.setString(5, paid);
        preparedStatement.setString(6, surname);
        preparedStatement.setString(7, flightid);
        preparedStatement.setString(8, email);
        preparedStatement.setString(9, telephonenumber);
        preparedStatement.setString(10, citizen);
        preparedStatement.setString(11, customersize);
        preparedStatement.setString(12, date);
        preparedStatement.setString(13, "");
        preparedStatement.executeUpdate();
        Dopen.closeDB();


    }
}
