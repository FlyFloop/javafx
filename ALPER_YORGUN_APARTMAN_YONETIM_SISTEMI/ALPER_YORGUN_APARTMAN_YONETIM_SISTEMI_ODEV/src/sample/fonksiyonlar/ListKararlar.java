package sample.fonksiyonlar;


import sample.dataBase.AlinanKaralarToDatabase;
import sample.dataBase.ApartmanYonetimDB;

import java.sql.*;
import java.util.ArrayList;

public class ListKararlar {
    public static ArrayList<String> kararlarıListele() throws SQLException {
        ArrayList<String> kararlar = new ArrayList<String>();
        String sql = "SELECT * FROM ALINANKARARLAR";
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            kararlar.add(resultSet.getString("KARAR"));
        }
        return kararlar;
    }


}
