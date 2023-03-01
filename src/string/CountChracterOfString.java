package string;

import java.util.HashMap;
import java.util.Map;

public class CountChracterOfString {

    public static void main(String args[]){
        String str="PARROT";

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<=str.length()-1;i++){
            char c=str.charAt(i);

            if (hm.containsKey(c)){
                hm.put(c,(hm.get(c)+1));

            }else {
                hm.put(c,1);

            }

        }

        for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");

        }

    }


}
