package util;

public class CurrencyConverter {
    public static double dollarConverter(double dollarPrice, double amount) {
        double convertedDollar = dollarPrice * amount;
        double tax =  convertedDollar * 6/100;
        return convertedDollar + tax;
    }
}
