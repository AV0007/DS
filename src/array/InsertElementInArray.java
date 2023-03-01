package array;

public class InsertElementInArray {
    public static void main(String args[]){
        int a[]=new int[]{1,3,5,6,22,34,55};
        int pos=3;
        int element=100;

        for (int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;

        for (int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }

    }
}
