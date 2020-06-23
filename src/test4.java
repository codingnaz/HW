import java.util.Scanner;

public class test4 {
    //4.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
    public static void main(String[] args) {
        // write your code here
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the amount ");
        double amount= Double.parseDouble( myObj.next());
        System.out.println("Please enter the rate (0-1)");
        double rate= Double.parseDouble( myObj.next());
        double tips= TipCalculator(rate, amount);
        System.out.println("tips is "+tips+ ". So, total amount="+(amount+tips));
    }
    public static double TipCalculator(double zeroToOneTipRate, double amount){
        return (double) zeroToOneTipRate * amount;
    }
    public static double TipCalculator( double amount){ //overloaded methods
        return .04 * amount;
    }
}
