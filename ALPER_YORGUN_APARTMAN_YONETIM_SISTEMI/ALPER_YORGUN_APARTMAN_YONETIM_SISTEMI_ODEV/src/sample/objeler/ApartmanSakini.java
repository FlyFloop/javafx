package sample.objeler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ApartmanSakini {


    public static void setDairesayi(double dairesayi) {
        ApartmanSakini.dairesayi = dairesayi;
    }

    static double dairesayi;
    private String ad;
    private String soyad;



    public ApartmanSakini(String ad, String soyad, String tcNo, String cep, String yas, String cinsiyet, String daireNo, String uyeNo, String odemeTipi, String adres, String mailAdresi, String blokNo, String oturmasekli,String arabamarka,String arabaPlaka) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.cep = cep;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.daireNo = daireNo;
        this.uyeNo = uyeNo;
        this.odemeTipi = odemeTipi;
        this.adres = adres;
        this.mailAdresi = mailAdresi;
        this.blokNo = blokNo;
        this.oturmasekli = oturmasekli;
        this.arabaMarka = arabamarka;
        this.arabaPlaka = arabaPlaka;
    }

    private String tcNo;
    private String cep;
    private String yas;
    private String cinsiyet;
    private String daireNo;
    private String uyeNo;
    private String odemeTipi;
    private String adres;
    private String mailAdresi;
    private String blokNo;
    private String arabaMarka;
    private String arabaPlaka;

    public String getArabaMarka() {
        return arabaMarka;
    }

    public void setArabaMarka(String arabaMarka) {
        this.arabaMarka = arabaMarka;
    }

    public String getArabaPlaka() {
        return arabaPlaka;
    }

    public void setArabaPlaka(String arabaPlaka) {
        this.arabaPlaka = arabaPlaka;
    }

    public void setOturmasekli(String oturmasekli) {
        this.oturmasekli = oturmasekli;
    }

    private String oturmasekli;

    public String getOturmasekli() {
        return oturmasekli;
    }

    public   String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDaireNo() {
        return daireNo;
    }

    public void setDaireNo(String daireNo) {
        this.daireNo = daireNo;
    }

    public String getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(String uyeNo) {
        this.uyeNo = uyeNo;
    }

    public String getOdemeTipi() {
        return odemeTipi;
    }

    public void setOdemeTipi(String odemeTipi) {
        this.odemeTipi = odemeTipi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMailAdresi() {
        return mailAdresi;
    }

    public void setMailAdresi(String mailAdresi) {
        this.mailAdresi = mailAdresi;
    }

    public String getBlokNo() {
        return blokNo;
    }

    public void setBlokNo(String blokNo) {
        this.blokNo = blokNo;
    }




}
