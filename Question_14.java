import java.util.*;
public class Question_14 {
   public static void variant_1(int num_1,int num_2)
   {
       System.out.println("Output: ");
       int temp = num_1;
       num_1 =num_2;
       num_2 = temp;
       System.out.print(num_1+" "+num_2);

   }
    public static void variant_2(int num_1,int num_2)
    {
        System.out.println("Output: ");
        num_1 = num_1 + num_2;
        num_2 = num_1 - num_2;
        num_1 = num_1 - num_2;
        System.out.print(num_1+" "+num_2);

    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input: ");
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        System.out.println("Choose any choice:(1 or 2 )");
        System.out.println("1.Swap Given two Numbers using temporary variable");
        System.out.println("2.Swap Given two Numbers Without using temporary variable");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                variant_1(first_num,second_num);
                break;
            case 2:
                variant_2(first_num,second_num);
                break;
        }
    }
}
