import java.util.*;
public class GCD_LCM {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int  a[] =new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        int numerator = (a[0] > a[1])?a[0]:a[1];
        int denominator = (a[0]<a[1])?a[0]:a[1];
        int remainder = numerator % denominator;
        while(remainder!=0)
        {
            numerator = denominator;
            denominator = remainder;
            remainder = numerator % denominator;
        }
        System.out.println("GCD is = "+denominator);
        System.out.println("LCM is = "+a[0]*a[1]/denominator);
    }
}
