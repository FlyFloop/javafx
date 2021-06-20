package sample.fonksiyonlar;


import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class GirisKontrol {
    static String id = "admin";
    static String password = "1234";
    public static boolean login(TextField idText, PasswordField passwordText){
        if (idText.getText().equals(id) && passwordText.getText().equals(password)){
            return true;
        }
        else {
            return  false;
        }
    }
}
