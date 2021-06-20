package sample.fonksiyonlar;

import sample.dataBase.ApartmanYonetimDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLCount {

    public static int getKiraci() throws SQLException {
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        String sql = "SELECT * FROM CUSTOMER";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        while (resultSet.next()){
            if (resultSet.getString("OTURMASEKLİ").equals("Kiraci")){
                count++;
            }
        }
        return  count;
    }
    public static int getEvSahibi() throws SQLException {
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        String sql = "SELECT * FROM CUSTOMER";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        while (resultSet.next()){
            if (resultSet.getString("OTURMASEKLİ").equals("Ev Sahibi")){
                count++;
            }
        }
        return  count;
    }
    public static int getKisiSayi() throws SQLException {
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        String sql = "SELECT * FROM CUSTOMER";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        while (resultSet.next()){

            count++;

        }
        return  count;
    }
    public static int getAracSayi() throws SQLException {
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        String sql = "SELECT ARABAMARKA FROM CUSTOMER";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        while (resultSet.next()){
            if (!(resultSet.getString("ARABAMARKA").isEmpty())){
                count++;
            }
        }
        return  count;
    }
}
