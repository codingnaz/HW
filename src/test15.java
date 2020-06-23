import java.util.Scanner;

public class test15 {
    //Write a Java program to detect key presses.If the user pressed number keys( from 0 to 9),
    // the program will tell the number that is pressed, otherwise, program will show "Not allowed".
    public static void main(String a[]){

        System.out.print("Press a number key:");
        try{
            Scanner myObj = new Scanner(System.in);
            String key = myObj.next();
            int x= Integer.parseInt(key);
            if(x<10 && x>-1)
            System.out.println("You pressed "+x+". ");
            else  System.out.println("Not allowed!");
        }catch(Exception e){
            System.out.println("Not allowed!");
        }


    }
}
