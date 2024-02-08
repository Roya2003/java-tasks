package JavaMethods;

public class SortArray {
    public static void main(String[] args) {


//        bubble sort //


        int []arr={12,1,43,21,7,5,2,87};

        int temp=0;

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }





    }
}
