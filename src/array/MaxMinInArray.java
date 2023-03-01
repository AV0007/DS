package array;

public class MaxMinInArray {



    public static void main(String args[]){
        int arr[]=new int[]{10,15,22,44,45,66,1,1,0};

        int min=arr[0];int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            else if (arr[i]>min){
                max=arr[i];
            }
        }

        System.out.println(min+"MIN");
        System.out.println(max+"MAX");


    }
}
