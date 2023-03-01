package array;

public class Myclass {
    public static void main(String args[]) {
        String s = "ABCBAE";
        String s2="";


        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            s2=s2+ch;
        }
        System.out.println(s);
        System.out.println(s2);

        if (s.equals(s2.trim())){
            System.out.print("Palindrome");

        }else {
            System.out.print(" Not Palindrome");
        }


    }

}
