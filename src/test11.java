import java.util.Scanner;

public class test11 {
    //Write a program to print year from 1 to 4000 except leap years using Continue statement.
    public static void  main(String args[]) {
        System.out.print("Years : ");
        for(int i=1;i<=4000; i++){
            if(i%4!=0){
                System.out.print(i +"  ");
            }
        }



    }
}
