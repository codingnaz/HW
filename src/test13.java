import java.util.Scanner;

public class test13 {
    //Write a program to remove White Spaces from string in Java?
    // ”Enter input string to be cleaned from white spaces...!”
    // INPUT :OneSpace TwoSpaces ThreeSpaces FourSpaces Tab End
    public static void main(String args[]){
        System.out.println("Enter input string to be cleaned from white spaces...!");
        Scanner myObj = new Scanner(System.in);
        String x = myObj.nextLine().replace(" ","");
        System.out.println(x);

    }
}
