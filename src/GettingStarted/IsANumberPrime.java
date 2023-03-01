package GettingStarted;

import java.util.Scanner;
public class IsANumberPrime {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=0;i<t;i++){
            int count =0;
            int no= sc.nextInt();
            for (int j=1;j<=no;j++){
                if (no%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }

        }





    }
}
