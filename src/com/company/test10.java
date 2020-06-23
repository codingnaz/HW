package com.company;

import java.util.Scanner;

public class test10 {
    //Write a program to input indefinite numbers and then calculate the sum of only
    // the positive numbers. The program terminates when negative numbers is input
    public static void  main(String args[]) {
        System.out.println("Enter number");
        int sum= 0;
        while (true){
            Scanner myObj = new Scanner(System.in);
            int x = Integer.parseInt(myObj.nextLine());
            if(x<0){
                System.out.println("sum = "+ sum);
                return;
            }
            if(x%2==0){
                sum=sum+x;
            }
        }



    }
}
