package array;

import java.util.HashSet;

public class FirstDuplicateElementInArray {
    public static void main(String args[]){
        int arr[]=new int[]{1,3,4,2,12,2,7,9};

        HashSet<Integer> hs=new HashSet();
        int temp=-1;

        for (int i=arr.length-1;i>=0;i--){

            if (hs.contains(arr[i])){
                temp=i;

            }else {
                hs.add(arr[i]);
            }

        }
        if (temp==-1){
            System.out.print("No Duplicate found");

        }else {
            System.out.print(arr[temp]);
        }


    }
}
