package testA;

public class SquareRoot {

    public static void main(String args[]){
        int no=4;
        System.out.print(findSquareRoot(no));

    }


  static int findSquareRoot(int no){
        int sr=(int)Math.sqrt(no);
        return  (int)sr;
    }
}
