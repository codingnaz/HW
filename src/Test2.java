import java.util.Scanner;

public class Test2 {
    //Take a number from user and Print if the number is less than 200 and
    // even number otherwise print invalid number using Logical Operator

    public static void main(String[] args) {

        // write your code here

        checkFor200();


    }

    public static void checkFor200(){
        try{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter a number");
           int x= Integer.parseInt(myObj.nextLine());
           String output= x<200 ? "Number is less then 200 ": "Number is not less then 200 ";
           output = output + (x%2==0 ? " and  Number is ever ": " Number is odd");
            System.out.println(output);
        }catch (Exception e){
            System.out.println("Please enter Good Number");
        }
    }
}
