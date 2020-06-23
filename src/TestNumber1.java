import java.util.Scanner;

public class TestNumber1 {
    //Take input from the user and Print if the number is less than or greater than 100 using Ternary Operator

    public static void main(String[] args) {

        // write your code here

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = Integer.parseInt(myObj.nextLine());
        String output= (input>100)? " The number you entered is greater then 100": " The number you entered is less then 100";

        System.out.println(output);

    }


}
