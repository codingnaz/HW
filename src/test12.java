import java.util.Scanner;

public class test12 {
    //By using do while loop, write Java program to prompt the user to choose
    // the correct answer from a list of answer choices of a question.
    /*
    What is the command keyword to exit a loop in Java?
a.quit
b.continue
c.break
d.exit
Enter your choice:b
Incorrect!
Again? press y to continue:y
Enter your choice:c
Congratulation!
Again? press y to continue:y
Enter your choice:a
Incorrect!
Again? press y to continue:d
     */
    public static void main(String args[]){
        System.out.print("What is the command keyword to exit a loop in Java?\n" +
                "a.quit\n" +
                "b.continue\n" +
                "c.break\n" +
                "d.exit\n Enter your choice: ");
        Scanner myObj = new Scanner(System.in);
        char x = myObj.nextLine().toLowerCase().charAt(0);

        do{
            if(x=='b') System.out.print("\nIncorrect!\n" +
                    "Again? press y to continue:");
            else if(x=='y')System.out.print("\nEnter your choice:");
            else if(x=='c')System.out.print("\nCongratulation!\n Again? press y to continue:");
            else if(x=='a') System.out.print("\nIncorrect!\n" +
                    "Again? press y to continue:");
            else System.out.print("\nIncorrect!\n" +
                        "Again? press y to continue:");
            x= myObj.nextLine().toLowerCase().charAt(0);
        }while (x!='d' );

    }
}
