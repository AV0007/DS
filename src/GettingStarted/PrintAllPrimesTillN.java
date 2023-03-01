package GettingStarted;

import java.util.Scanner;
public class PrintAllPrimesTillN {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();

        for (int i=low;i<=high;i++){
            int count=0;

            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i+ "is Prime");
            }else {
                System.out.println(i+ "is Not Prime");
            }


        }

    }
}
