package string;

public class ReverseString {
    public static void main(String args[]){
        String str="Hello How are you";
        String word="";

        String [] strArr=str.split(" ");
        for (int i= strArr.length-1;i>=0;i--){
            word=word+" "+strArr[i];


        }
        System.out.print(word);
    }
}
