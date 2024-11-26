package  app;

public class Main {

    private static final double CONV_K = 2.20462;
    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for measures converting.");
        System.out.println("Version 1.0");
        double pnds = 12;
        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + " pounds and kilos is " + kilos);

    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pounds) {
        return pounds / CONV_K;
    }



}