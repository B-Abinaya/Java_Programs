import java.util.*;
public class Armstrong_No {
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt();
       int n1 = n;
       int n2 = n;
       int count = 0;
       int sum =0;
       while(n1 > 0)
       {
           count++;
           n1 = n1 / 10;
       }

       while(n > 0)
       {
           int rem = n % 10;
           sum = sum + (int)Math.pow(rem,count);
           n = n / 10;
       }

       if(n2 == sum)
       {
           System.out.println("Given no is Armstrong Number");
       }
       else{
           System.out.println("Given no is not a Armstrong number");
       }
    }
}
