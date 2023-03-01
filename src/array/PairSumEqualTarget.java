package array;

import java.util.HashMap;

public class PairSumEqualTarget {

    public static void main(String args[]) {
//Approach1
        int arr[] = new int[]{2, 7, 11, 15};
        int target = 17;
        //APPROSACH ! BRuteforce
       /* int target=9;
        for (int i=0;i<arr.length-1;i++){
            int index=i;
            int no=arr[i];
            for(int j=i=1;j<arr.length;j++){
                if (no+arr[j]==target){
                    System.out.print(index+" "+j);


                }

            }

        }*/


        //Approach2
        // int arr[]=new int[]{2,7,11,15};

        int[] a = getNo(arr, target);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);

        }

    }
    // int arr[]=new int[]{2,7,11,15};
    public static int[] getNo(int[] arr, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
            int no = arr[i];
            int rem = target - no;
            if (hm.containsKey(rem)) {
                int index = hm.get(rem);
                return new int[]{index,i};
            }


        }
        return new int[]{};
    }
}
