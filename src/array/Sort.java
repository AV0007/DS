package array;

public class Sort {

    public static void main(String args[]){

        int arr[]=new int[]{36,19,29,12,5,1,100,36,19,29,12,5,1,100,34,3,2,1,2,36,5,4,3,5,6,6,77,66,5,4,43455,55,4};
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for (int a:arr){
            System.out.print(a+" ");
        }

    }




}
