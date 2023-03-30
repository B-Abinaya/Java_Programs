import java.util.*;
public class Largest_Palindrome {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int pal_Arr[] = new int[n];
        int pal_i = 0;
        System.out.println("Enter the elements:");
        for(int i = 0;i < n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0 ;i < n;i++)
        {

            int sum = 0;
            int val1 = a[i];
            int val2 = a[i];
            int count = 0;
            while(val1  > 0)
            {
                val1 = val1 / 10;
                count++;
            }
            //System.out.println("Count="+count);
            while(val2 > 0)
            {
                int rem = val2 % 10 ;
                sum = sum + (int)Math.pow(10,--count) * rem;
                val2 = val2 / 10;

            }
           // System.out.println("Sum="+sum);

            if(a[i] == sum)
            {
                pal_Arr[pal_i] = a[i];
                pal_i++;
            }
        }
        int large = pal_Arr[0];
        for(int i = 1;i<pal_Arr.length;i++)
        {
            if(pal_Arr[i]>large)
            {
                large = pal_Arr[i];
            }
        }
        System.out.println("Largest Palindrome:"+large);

    }
}
