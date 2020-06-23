import java.util.Scanner;

public class test3 {
    //3.Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        // write your code here

        System.out.println("Please length of the Fibonoci’s series (zero not include)");
        Scanner myObj = new Scanner(System.in);
        int x= Integer.parseInt(myObj.nextLine());
        System.out.println();
        for (int i=0; i<=x; i++){
            System.out.print(fib( i)+ "  ");
        }


    }
}
