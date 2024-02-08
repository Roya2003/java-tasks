package JavaMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {

        int count = 0;

        int a[] = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length arrey  ");



        for (int i =0;i<a.length;i++) {
            System.out.println("enter the string ");
            a[i]= Integer.parseInt(br.readLine());

        }

        System.out.println("enter the search string ");

//        System.out.println("arrey element");
//        for (int i=0;i<a.length;i++) {
//            System.out.println(a[i]+" ");
//        }
        System.out.println("enter search element ");
        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<a.length;i++) {
            if (a[i]==n)
            {
                count++;
            }

        }if (count>0){
            System.out.println("item found"+ count);
        }
        else {
            System.out.println("item not found");
        }


    }

}
