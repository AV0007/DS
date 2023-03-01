package array;//
//Print the Number of Odd and Even Numbers | Sum & Count of Even or Odd Numbers in an Array in Java

import java.util.ArrayList;

public class PrintNoOddEvenNo {
    public static void main(String args[]){

        int arr[]=new int[]{1,3,5,56,7,7,4};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        int evenTotal=0;
        int oddTotal=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                evenTotal=evenTotal+arr[i];
                al1.add(arr[i]);
            }else {
                oddTotal=oddTotal+arr[i];
                al2.add(arr[i]);
            }
        }

        System.out.println("EVEN"+al1);
        System.out.println("ODD"+al2);
        System.out.println("EVEN_TOTAL"+evenTotal);
        System.out.println("ODD_TOTAL"+oddTotal);


    }
}
