package string;

import java.util.HashSet;

public class FirstDuplicateStringChracter {
    public static void main(String args[]){
         String arr[]=new String[]{"a","b","c","r","d","e","b","a","c"};
        HashSet<String> hs=new HashSet<>();
        int temp=-1;
        for (int i=0;i<arr.length;i++){
            if (hs.contains(arr[i])){
                temp=i;
                break;

            }else {
                hs.add(arr[i]);
            }
        }
        if (temp==-1){
            System.out.print("No Duplicate");
        }else {
            System.out.print(arr[temp]);

        }
    }
}
