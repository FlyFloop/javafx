package sample.objeler;

public class YonetimKurulu  {
    String ad;
    String soyad;
    String daireNo;

    public String getAd() {
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

    public String getDaireNo() {
        return daireNo;
    }

    public void setDaireNo(String daireNo) {
        this.daireNo = daireNo;
    }

    public YonetimKurulu(String ad, String soyad, String daireNo){
        this.ad = ad;
        this.soyad = soyad;
        this.daireNo = daireNo;
}

}
