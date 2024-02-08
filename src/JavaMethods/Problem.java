package JavaMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int []arr = new int[a];
        int [] arr2= new int[a];
        System.out.println("enter the arrey length");
        for (int i =0;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());

        }
        System.out.println("enter the start point");
        int starting = Integer.parseInt(br.readLine());
        System.out.println("enter the end point ");
        int ending = Integer.parseInt(br.readLine());

        int temp;
        while (starting <= ending){

            temp = arr[starting];
            arr[starting] = arr[ending];
            arr[ending]=temp;
            starting++;
            ending--;


        }

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();












    }
}
