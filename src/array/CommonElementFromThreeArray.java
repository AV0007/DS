package array;

import java.util.ArrayList;

public class CommonElementFromThreeArray {

    public static void main(String args[]){
        int a1[]=new int[]{1,3,6,9};
        int a2[]=new int[]{1,3,8,9};
        int a3[]=new int[]{1,7,6,3};
        int x=0;
        int y=0;
        int z=0;
        ArrayList<Integer> al=new ArrayList<>();


        while (x<a1.length&&y<a2.length&&z<a3.length){

            if (a1[x]==a2[y]&&a2[y]==a3[z]){
                al.add(a1[x]);
               x++;
               y++;
               z++;
            }else if(a1[x]<a2[y]){
                x++;

            }else if (a2[y]==a3[z]){
                y++;
            }else {
                z++;
            }

        }
        System.out.print(al);
    }






}
