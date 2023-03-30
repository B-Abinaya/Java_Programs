import java.util.*;
public class Strong_No {
    static int fact(int n)
    {

        if(n == 1)
            return 1;
        else
            return fact(n-1)*n;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int n1 = n;
        int fact = 1;
        while(n > 0)
        {

            int rem = n % 10;
            fact = fact(rem);
            sum = sum + fact;
            n = n / 10;
        }
        if(n1 == sum)
        {
            System.out.println("Output: "+n1+"is a Strong no");
        }
        else
        {
            System.out.println("Output: "+n1+"is not a Strong no");
        }
    }
}
