package GettingStarted;
import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String args[]){

       // Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int digit=9543;

        int count=0;
        while (digit!=0){
            int remainder=digit%10;
            int quotient=digit/10;
            digit=quotient;
            count++;

        }


        System.out.println(count);









    }
}
