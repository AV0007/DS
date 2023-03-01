package test;

public class Sort {

    public static void main(String args[]){

        int arr[]=new int[]{2,2,6,6,2,2,4,4,4,6,6,2,2};
        int i=0;
        int j=0;
        int k=arr.length-1;

        while (i<=k){
            if (arr[i]==2){
                swapElement(arr,i,j);
                i++;
                j++;
            }
            else if (arr[i]==4){
                i++;
            }
            else {
                swapElement(arr,i,k);
                k--;
            }

        }


        for (int m=0;m<arr.length;m++){
            System.out.print(arr[m]+" ");

        }

    }

    private static void swapElement(int[] arr, int i, int j) {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
