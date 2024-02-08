package JavaMethods;

public class SortArray2 {
    public static void main(String[] args) {
        int [] arr={12,4,2,6,4,12,54,};
        int num=0;
        for (int i=0;i<arr.length;i++){
         if (arr[i]>arr[i+1]){
             num=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=num;
             i=-1;
         }
            System.out.print(arr[i]+" ");

        }

    }
}
