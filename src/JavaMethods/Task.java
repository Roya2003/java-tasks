package JavaMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;


public class Task {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the arrey length ");
        int arr = Integer.parseInt(br.readLine());

        String [] st = new String[arr];

        for (int i=0; i< st.length ; i++){
            System.out.println("enter strings ");
            st[i] = br.readLine();

        }
        System.out.println("enter searchstring ");
        String Str = br.readLine();

        int index = Arrays.asList(st).indexOf(Str);

        if (index != -1){
            System.out.println("index number is  "+index);
            
        } else {
            System.out.println("wrong string");
        }

    }
}
