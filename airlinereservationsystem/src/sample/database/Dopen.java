package sample.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dopen {
    public static Connection openDB(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:flight.db");
        }catch (Exception e){
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }
        return connection;
    }
}
