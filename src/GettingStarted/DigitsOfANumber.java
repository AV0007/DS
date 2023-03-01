package GettingStarted;
import java.util.*;

public class DigitsOfANumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while (n!=0){
            int remainder=n%10;
            int quotient=n/10;
            n=quotient;
            System.out.println(remainder);
        }

    }
}
