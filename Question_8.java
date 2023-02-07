import java.util.*;
public class Question_8 {
    //CHECK WHETHER GIVEN NUMBSER IS PRIME OR NOT
    public static void variant_1(int[] nums)
    {
        int flag = 0;
        for(int i=2;(i*i)<=nums[0];i++)
        {
            if(nums[0]%i==0)
            {
                flag++;
                System.out.println("Not a Prime Number");
                break;
            }
        }
        if(flag==0) {
            System.out.println("Prime Number");
        }

    }
    //PRINT PRIME NUMBERS FROM 1 TO GIVEN NUMBER
    public static void variant_2(int[] nums)
    {
        for(int i=2;i<=nums[0];i++)
        {
            int flag = 0;
            for(int j =2;(j*j)<=i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i+" ");

        }
    }
   //PRINT PRIME NUMBERS BETWEEN TWO NUMBERS
    public static void variant_3(int[] nums)
    {
        for(int i=nums[0];i<=nums[1];i++)
        {
            int flag = 0;
            for(int j =2;(j*j)<=i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
                System.out.print(i+" ");

        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0,i = 0,choice=0;
        int nums[] = new int[2];
        System.out.println("Input: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            nums[i] = Integer.parseInt(st.nextToken());
            count++;
            i++;
        }
        if(count == 1) {
            System.out.println("Choose the choice");
            System.out.println("1.Check whether Given number is Prime or not");
            System.out.println("2.Print Prime Numbers from 1 to Given Number");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    variant_1(nums);
                case 2:
                    variant_2(nums);
            }
        }
        if(count == 2)
        {
            variant_3(nums);
        }

    }
}
