import java.util.Scanner;

public class test16 {
    //Write a Java program that allows the user to choose the correct answer of a question. See the example below:
    //
    //What is the correct way to declare a variable to store an integer value in Java?
    //a. int 1x=10;
    //b. int x=10;
    //c. float x=10.0f;
    //d. string x="10";
    //Enter your choice: c

    public static void main(String args[]){
        System.out.println("What is the correct way to declare a variable to store an integer value in\n" +
                " Java?\n" +
                "a. int 1x=10;\n" +
                "b. int x=10;\n" +
                "c. float x=10.0f;\n" +
                "d. string x=\"10\";");
        Scanner myObj = new Scanner(System.in);
        String key = myObj.next();
        while (true){
            switch (key){
                case "c": case"d":
                case"a": System.out.println("invalid. Try again."); break;
                case "b": System.out.println("You got it"); return;
                default: System.out.println(" Try again."); break;

            }
            key = myObj.next();
        }
    }
}
