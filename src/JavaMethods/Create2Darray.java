package JavaMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Create2Darray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the row");

        int row =Integer.parseInt(br.readLine());

        System.out.println("enter a col");

        int col=Integer.parseInt(br.readLine());

        int [][]arr=new int [row][col];

        System.out.println("enter a arrey");

        for (int i=0;i<row ; i++){

            for (int j=0;j<col;j++){

                arr [i][j] =Integer.parseInt(br.readLine());

            }
        }

        for (int i=0;i<row ; i++){

            for (int j=0;j<col;j++){

                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }
}
