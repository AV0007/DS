package array;

public class Sort10 {
    public static void main(String args[]){
        int arr[]=new int[]{1,1,0,1,0,0,0,0,1,1,1,0};
        int i=0;
        int j=0;

        for (int k=0;k<arr.length;k++){
            if (arr[k]==1)
            {
                i++;
            }else {
                swap(arr,i,j);
                i++;
                j++;

            }
        }

        for (int a=0;a<arr.length;a++){
            System.out.print(arr[a]);

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
