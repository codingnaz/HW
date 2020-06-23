import java.util.Scanner;

public class test8 {
    //Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ?
    public static void  main(String args[]) {
        System.out.println("How Many Rows You Want to Print ? ");
        Scanner myObj = new Scanner(System.in);
        int x = Integer.parseInt(myObj.nextLine());
        System.out.println(" ");
        for(int i=1; i<=x;i++){
            for (int j=x-i; j>0;j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++ ){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
