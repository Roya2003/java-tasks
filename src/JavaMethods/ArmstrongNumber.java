package JavaMethods;

public class ArmstrongNumber {
    public static void main(String[] args) {

        long n =153;
        long r=0;
        long s=0;
        long v=n;

        while (n>0){
            r=n%10;
            s=r*r*r+s;
            n=n/10;
        }
        if (s==v){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }


    }
}
