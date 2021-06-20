package sample.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApartmanYonetimDB {

    public static Connection OpenDB()  {
        Connection connection = null;
        try{
             connection = DriverManager.getConnection("jdbc:sqlite:apartman.db");

        }catch (SQLException exception){
            System.err.println(exception.getClass().getName()+":"+exception.getMessage());
            System.exit(0);
        }
        return  connection;
    }
}
