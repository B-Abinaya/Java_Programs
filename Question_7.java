import java.util.*;
public class Question_7 {
    public static void variant_1(Scanner sc,int n)
    {
        if(n%2==0)
            System.out.print("Even");
        else
            System.out.print("Odd");

    }
   public static void variant_2(Scanner sc,int n)
   {
       for(int i=1;i<=n;i++)
       {
           if(i%2==1)
               System.out.print(i+" ");
       }
   }

    public static void variant_3(Scanner sc,int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
    public static void variant_4(Scanner sc)
    {
        System.out.println("Choose Choice:");
        System.out.println("1.Check Given number is odd or even");
        System.out.println("2.Print Odd Numbers");
        System.out.println("3.Print Even Numbers");
        int choice = sc.nextInt();
        System.out.println("Input: ");
        int n = sc.nextInt();
        System.out.print("Output: ");
        switch(choice)
        {
            case 1:
                variant_1(sc,n);
                break;
            case 2:
                variant_2(sc,n);
                break;
            case 3:
                variant_3(sc,n);
                break;
        }



    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        variant_4(sc);
    }
}
