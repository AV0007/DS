package array;

import java.util.HashSet;

public class CommonElementFromTwoArray {
    public static void main(String args[]){
        int a[]=new int[]{1,3,5,6,22,34,55};
        int b[]=new int[]{1,9,7,8,22,34,55};


        HashSet<Integer> hs=new HashSet<>();

        for (int i:a){
            hs.add(i);

        }
        for (int j:b){
          boolean z=hs.add(j);
          if (!z){
              System.out.print(j+" ");
          }

        }
    }
}
