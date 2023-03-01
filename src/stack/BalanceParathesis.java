package stack;

import java.util.Stack;

public class BalanceParathesis {
    public static void main(String args[]){
        String str= "[()]";

        Stack<Character> st=new Stack<Character>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='['||ch=='('||ch=='{'){
                st.push(ch);

            }else if (ch==']'){
                boolean result=handleClosing(st,'[');
                if (!result){
                    System.out.print(result);
                    return;
                }

                break;
            }else if (ch==')'){
                boolean result= handleClosing(st,'(');
                if (!result){
                    System.out.print(result);
                    return;
                }

            }else if (ch=='}'){
                boolean result=  handleClosing(st,'{');
                if (!result){
                    System.out.print(result);
                    return;
                }


            }
        }
        if (st.size()==0){
            System.out.print(true);
        }else {
            System.out.print(false);
        }


    }

    private static boolean handleClosing(Stack<Character> st, char c) {
        if (st.size()==0){
            return false;
        }else if (st.peek()!=c){
            return false;
        }else {
            st.pop();
            return true;
        }



    }
}
