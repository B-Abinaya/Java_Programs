import java.util.*;
public class Abundant_No {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 2;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Not a abundant No");
    }
}
