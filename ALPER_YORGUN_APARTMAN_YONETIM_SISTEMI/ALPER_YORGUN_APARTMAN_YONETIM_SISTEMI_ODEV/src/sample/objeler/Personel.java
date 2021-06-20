package sample.objeler;

public class Personel {
    String ad;
    String soyad;
    String gorev;
    String no;
   public Personel(String ad,String soyad,String gorev,String no){
       this.ad = ad;
       this.soyad = soyad;
       this.gorev = gorev;
       this.no = no;
   }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
