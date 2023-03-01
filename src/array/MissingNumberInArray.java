package array;//Find Missing Number In Array In Java

//1+2+3+4+5+6=21 //1+2+3+4+6=16//here 5 is missing

//if we subtract  then we will get missing number



public class MissingNumberInArray {
    public  static void main(String args[]){

        int arr[]=new int[]{1,2,3,4,6};
        int expectedNoOfElements=arr.length+1;
        int totalSum=expectedNoOfElements*(expectedNoOfElements+1)/2;
        int sum=0;
        int result=0;

        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        result=totalSum-sum;
        System.out.print("Missing No is"+result);

    }

}
