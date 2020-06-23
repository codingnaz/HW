import java.util.Scanner;

public class test14 {
    //Write a JAVA program that will generate/output the following numbers. 1, 2, 4, 7, 11, 16, 32, 39, 47, 56, 66
    public static void main(String args[]){
        System.out.println("Enter the length");
        Scanner myObj = new Scanner(System.in);
        int x =Integer.parseInt( myObj.nextLine());
        System.out.println();
        int sum=1;
        String output="";
        for(int i=0; i<=x;i++){
            sum=sum+i;
           output=  output+", "+sum ;
        }
      output=output.substring(1);
        System.out.println(output);
    }
}
