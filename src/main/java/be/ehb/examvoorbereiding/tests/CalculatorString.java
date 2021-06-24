package be.ehb.examvoorbereiding.tests;

public class CalculatorString {
    private String name;

    public CalculatorString(String name) {
        this.name = name;
    }



    public double Ahmad(double getal1, double getal2){
        if (!this.name.equals("Ahmad") &&(getal1 < 0 ||getal2 < 0)){
            throw new IllegalArgumentException("the only one that can add negative numbers is Ahmad");
        }
       return getal1 + getal2;
    }
}
