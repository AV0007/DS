package array;

public class SecondLargestElementInArray
{
    public static void main(String args[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        int arr[]=new int[]{1,4,33,44,55,62};

        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest&&arr[i]!=secondLargest){
                secondLargest=arr[i];

            }


        }

        System.out.println("LARGEST"+largest);
        System.out.println("SECONDLARGEST"+secondLargest);
    }
}
