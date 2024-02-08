package JavaMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twoarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter row");
        int a = Integer.parseInt(br.readLine());
        System.out.println("enter col");
        int b= Integer.parseInt(br.readLine());
        int[][] arr =new int  [a][b];

        System.out.println("enterarray");
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                 arr [i][j] =Integer.parseInt(br.readLine());
            }

        }

        int rem=0;
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){


       if (arr[i]==arr[j]){
           rem=rem+arr[i][j];
       }
            }
            System.out.println();

        }
        System.out.println(rem);

    }
}
