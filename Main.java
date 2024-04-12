import java.lang.Math;

public class Main {
    public static void main (String[] args){
        double invest = 2500;
        int counter =0;
        double number = 0;
        for (int i = 0; number < 5001; i++){
            number = invest*Math.pow(1.075, (double)i);
            counter = i;
        }
        invest = number;
        System.out.println("The end amount is " + invest);
        System.out.println("Number of years is: " + counter);
    }
}