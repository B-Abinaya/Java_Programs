import java.util.*;
public class Question_20 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int fact = 1;
        int sum = 1;
        System.out.print("Input:");
        String input = sc.nextLine();
        int len = input.length();
        for(int i = 0;i < len;i++)
        {
            for(int j = i+1;j<len;j++)
            {
                if(input.charAt(i) == input.charAt(j))
                {
                    count++;
                }
            }

        }
        if(count == 0)
        {
            while(len > 0)
            {
                fact = fact * len;
                len--;
            }
        }
        else
        {
            while(len > 0)
            {
                fact = fact * len;
                len--;
            }
            while(count > 0)
            {
                sum = sum * 2;
                count--;
            }
            fact = fact / sum;
        }
        System.out.println("Output: "+fact);
    }
}
