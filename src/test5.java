import java.util.Scanner;

public class test5 {
    //5.Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement

    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a year");
        int x= Integer.parseInt(myObj.nextLine());
        if(x%4==0){
            System.out.println("it is Leap year");
        }else{
            System.out.println("it is not a Leap year");
        }
    }
}
