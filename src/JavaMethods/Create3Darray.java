package JavaMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Create3Darray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the plane");
        int plane = Integer.parseInt(br.readLine());
        System.out.println("enter the row");
        int row = Integer.parseInt(br.readLine());
        System.out.println("enter a col");
        int col = Integer.parseInt(br.readLine());
        int[][][] arr = new int[plane][row][col];
        System.out.println("enter a arrey");

        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr [i][j][k] = Integer.parseInt(br.readLine());
                }
            }
        }

        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println("  ");
            }
            System.out.println(" ");
        }
    }
}