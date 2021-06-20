package sample.dataBase;
import javafx.scene.control.ChoiceBox;

import java.awt.*;
import java.sql.*;
public class CustomerToDatabase {
    public static void addToDatabase(String NAME, String SURNAME, String TCID, String PHONENUMBER, String AGE,
                                     String EMAIL, String ADDRESS, String APARTMNO, String CUSTOMERNO,
                                     String PAYMENTMETHOD, String BLOCKNUMBER, String GENDER,
                                     String OTURMASEKLİ,String ARABAMARKA,String ARABAPLAKA) throws SQLException {
        String sql = "INSERT INTO CUSTOMER(NAME,SURNAME,TCID,PHONENUMBER,AGE,EMAIL,ADDRESS,APARTMENTNO,CUSTOMERNO,PAYMENTMETHOD,BLOCKNUMBER,GENDER,OTURMASEKLİ,ARABAMARKA,ARABAPLAKA) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = ApartmanYonetimDB.OpenDB().prepareStatement(sql);
        preparedStatement.setString(1, NAME);
        preparedStatement.setString(2,SURNAME);
        preparedStatement.setString(3,TCID);
        preparedStatement.setString(4,PHONENUMBER);
        preparedStatement.setString(5,AGE);
        preparedStatement.setString(6,EMAIL);
        preparedStatement.setString(7,ADDRESS);
        preparedStatement.setString(8,APARTMNO);
        preparedStatement.setString(9,CUSTOMERNO);
        preparedStatement.setString(10,PAYMENTMETHOD);
        preparedStatement.setString(11,BLOCKNUMBER);
        preparedStatement.setString(12,GENDER);
        preparedStatement.setString(13,OTURMASEKLİ);
        preparedStatement.setString(14, ARABAMARKA);
        preparedStatement.setString(15, ARABAPLAKA);
        preparedStatement.executeUpdate();
    }
}
