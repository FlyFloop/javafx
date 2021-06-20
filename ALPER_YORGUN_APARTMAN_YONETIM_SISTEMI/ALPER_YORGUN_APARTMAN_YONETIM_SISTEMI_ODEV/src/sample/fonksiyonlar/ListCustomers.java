package sample.fonksiyonlar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.dataBase.ApartmanYonetimDB;
import sample.objeler.ApartmanSakini;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListCustomers {
    public static ObservableList<ApartmanSakini> getApartmanSakini() throws SQLException {
        ObservableList<ApartmanSakini> daireList = FXCollections.observableArrayList();
        Statement statement = ApartmanYonetimDB.OpenDB().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CUSTOMER");
        while (resultSet.next()){
            daireList.add(new ApartmanSakini(resultSet.getString("NAME"), resultSet.getString("SURNAME"),
                    resultSet.getString("TCID"),
                    resultSet.getString("PHONENUMBER"),
                    resultSet.getString("AGE"),
                    resultSet.getString("GENDER"),
                    resultSet.getString("APARTMENTNO"),
                    resultSet.getString("CUSTOMERNO"),
                    resultSet.getString("PAYMENTMETHOD"),
                    resultSet.getString("ADDRESS"),
                    resultSet.getString("EMAIL"),
                    resultSet.getString("BLOCKNUMBER"),
                    resultSet.getString("OTURMASEKLİ"),resultSet.getString("ARABAMARKA"),
                    resultSet.getString("ARABAPLAKA")));
        }

        return daireList;
    }
}
/*
/*
public static ObservableList<ApartmanSakini> getApartmanSakini() {
        ObservableList<ApartmanSakini> daireList = FXCollections.observableArrayList();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] apartmanSakiniSatir = satir.split(";");

                ApartmanSakini apartmanSakini = new ApartmanSakini();
                apartmanSakini.setAd(apartmanSakiniSatir[0]);
                apartmanSakini.setSoyad(apartmanSakiniSatir[1]);
                apartmanSakini.setTcNo(apartmanSakiniSatir[2]);
                apartmanSakini.setCep(apartmanSakiniSatir[3]);
                apartmanSakini.setYas(apartmanSakiniSatir[4]);
                apartmanSakini.setCinsiyet(apartmanSakiniSatir[5]);
                apartmanSakini.setDaireNo(apartmanSakiniSatir[6]);
                apartmanSakini.setUyeNo(apartmanSakiniSatir[7]);
                apartmanSakini.setOdemeTipi(apartmanSakiniSatir[8]);
                apartmanSakini.setAdres(apartmanSakiniSatir[9]);
                apartmanSakini.setMailAdresi(apartmanSakiniSatir[10]);
                apartmanSakini.setBlokNo(apartmanSakiniSatir[11]);
                daireList.add(apartmanSakini);
            }
        } catch (IOException e) {
            System.out.println("getapartmanlisthata");
        }
        return daireList;
    }
 */

