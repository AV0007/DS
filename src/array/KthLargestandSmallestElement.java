package array;

public class KthLargestandSmallestElement {

    public static void main(String args[]){
        int arr[]=new int[]{10,15,22,44,45,66,1,1,0};
        int temp=0;
        int t=4;

        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
            if (i==t-1){
                break;
            }
        }
        System.out.println(arr[t]+"");
        for (int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }



}

}
