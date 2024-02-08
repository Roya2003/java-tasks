package JavaMethods;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int count=0;
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("enter the arrey element ");
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt();

        }
        System.out.println("arrey element");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("search string ");
       int  n=r.nextInt();
       for (int i =0;i< a.length;i++){
           if (a[i]==n){
               count++;
           }
       }
       if (count > 0){
           System.out.println(count);
       }
       else {
           System.out.println("not found");
       }


    }
}
