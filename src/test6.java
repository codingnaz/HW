import java.util.Scanner;

public class test6 {
    //6.Check whether an alphabet is vowel or consonant using switch statement
    public static void  main(String args[]) {
        System.out.println("Please enter a character (only checks the 1st entry)");
        Scanner myObj = new Scanner(System.in);
        char x = myObj.nextLine().toLowerCase().charAt(0);

        switch (x) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
                break;
        }
    }
}
