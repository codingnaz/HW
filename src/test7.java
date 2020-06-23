import java.util.Scanner;

public class test7 {
    //Write a program using nested switch statement.
    // Take input from user in form of “” and print the current running movies at the theater.
    public static void  main(String args[]) {
        System.out.println("Please something");
        Scanner myObj = new Scanner(System.in);
        String x = myObj.nextLine();

        switch (x.charAt(0)) {
            case '1':
                switch (x.toLowerCase().charAt(1)){
                    case 'f':  System.out.println("movie 1 is playing at fairfax"); break;
                    case 'h': System.out.println("movie 1 is playing at Herndon"); break;
                    default:
                        System.out.println("unknown movies ");
                        break;
                }break;

            case '2':
                switch (x.toLowerCase().charAt(1)){
                    case 'f':  System.out.println("movie 2 is playing at fairfax"); break;
                    case 'h': System.out.println("movie 2 is playing at Herndon"); break;
                    default:
                        System.out.println("unknown movies ");
                        break;
                }break;

            default:
                System.out.println("unknown movies ");
                break;
        }
    }
}
