package array;

import java.util.HashSet;

public interface LongestConsecutiveSequenceInAnArray {
    public static void main(String args[]){
        int arr[]=new int[]{3,9,1,10,4,20,2};
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        int longestValue=0;
        for (int i=0;i<arr.length;i++){

            if (!hs.contains(arr[i]-1)){
                 int no=arr[i];
                while (hs.contains(no)){
                    no++;

                }
                if (longestValue<no-arr[i]){
                    longestValue=no-arr[i];

                }

            }




        }
        System.out.print(longestValue);

    }
}
