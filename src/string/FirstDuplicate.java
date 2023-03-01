package string;


import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

    public static void main(String args[]){
        int arr[]=new int[]{2,7,11,15};
        int target=9;

      /*  for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");

        }
      int [] a= twoSum(arr,target);
      for (int i=0;i<a.length;i++){
          System.out.print(a[i]);
      }*/


      //  [2,7,11,15], target = 9


        for (int i=0;i<arr.length-1;i++){
            int no=arr[i];
            for (int j=i+1;j<arr.length;j++){
                int noSum=no+arr[j];
                if (noSum==target){
                    System.out.print(no+" "+arr[j]);
                }

            }

        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }




}

