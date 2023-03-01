package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsinanArray {
    public static void main(String args[]){
        int arr[]=new int[]{1,4,1,3,2,5,6,2,11};

        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int a:arr){
            if (hm.containsKey(a)){
                hm.put(a,(hm.get(a)+1));
            }else {
                hm.put(a,1);
            }

        }

        Set<Map.Entry<Integer,Integer>> set=hm.entrySet();

        for (var s:set){
            if (s.getValue()>1){
                System.out.println(s.getKey()+"="+s.getValue());

            }
        }



    }
}
