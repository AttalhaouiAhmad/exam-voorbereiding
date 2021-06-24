package be.ehb.examvoorbereiding.tests;

public class Calculator {


    public static double add(double een, double twee){

        return een + twee;
    }

    public static double power(double een, double twee){
        return Math.pow(een, twee);
    }

    public static double minus(double een, double twee){
        return een - twee;
    }

    public static double deeling(double een, double twee) throws Exception {
        if (twee == 0){
            throw new Exception("Het is onmogelijk om door 0 te delen");
        }
        return een/ twee;
    }

    public static double sqrt(double een){
        return Math.sqrt(een);
    }


}
