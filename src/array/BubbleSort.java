package array;

public class BubbleSort {

    public static void main(String[] args){


        int[] arr =new int[]{36,19,29,12,5,1,100,36,19,29,12,5,1,100,34,3,2,1,2,36,5,4,3,5,6,6,77,66,5,4,43455,55,4};
        int temp=0;

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }


        for (int k:arr){
            System.out.print(k+" ");
        }

    }




}
