package GettingStarted;

import java.util.Scanner;

public class PrintFibonacciNumbersTillN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int a = 0;
        int b = 1;
        for (int k = 0; k <n; k++) {
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;



        }


    }
}
