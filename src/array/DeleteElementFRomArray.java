package array;

public class DeleteElementFRomArray {

    public static void main(String args[]){
        int arr[]=new int[]{1,3,5,6,22,34,55};
        int delete=22;

        for (int i=0;i<arr.length;i++){
            if (delete==arr[i]){

                for (int j=0;j<arr.length;j++){
                    arr[i]=arr[i+1];
                    break;

                }
            }

        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }




    }
}
