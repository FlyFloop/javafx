package sample.fonksiyonlar;



public class Get {
    private static final Double DOLAR_TO_TL = 8.74;
    private static final Double EURO_TO_TL = 10.37;
    private static final Double POUND_TO_TL = 12.07;
    public static String flightID(){
        int temp = (int)(Math.random()*99999)+ 1;
        return String.valueOf(temp);
    }
    public static String paid(String currency,int totaldays,int customerSize){
        double temp;
        if(currency.equals("Euro")){
            temp = (customerSize*totaldays*20)/EURO_TO_TL;
        }
        else if (currency.equals("Dolar")){
            temp = (customerSize*totaldays*20)/DOLAR_TO_TL;
        }
        else if (currency.equals("Pound")){
            temp = (customerSize*totaldays*20)/POUND_TO_TL;
        }
        else {
            temp = (customerSize*totaldays*20);
        }
        return String.valueOf(temp);
    }
}
