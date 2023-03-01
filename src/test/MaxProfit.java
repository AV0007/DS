package test;

public class MaxProfit {

    public static void main(String args[]){
        int arr[]=new int[]{2,3,10,6,4,8,1};
        int max=0;

        for (int i=0;i<arr.length;i++){
            int priceBought=arr[i];
            for (int j=i+1;j<arr.length-1;j++){
                int profit =arr[j]-priceBought;
                if (profit>max){
                    max=profit;
                }

            }
        }
        System.out.print(max);
    }
}
