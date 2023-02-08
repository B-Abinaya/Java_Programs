import java.util.*;
public class Quesiton_13 {
    public static void variant_1(int num_1,int num_2)
    {

        if(num_1>num_2)
            System.out.print(num_1);
        else
            System.out.print(num_2);
    }
    public static void variant_2(int num_1,int num_2)
    {

        if(num_1<num_2)
            System.out.print(num_1);
        else
            System.out.print(num_2);
    }
    public static void variant_3(int num_1,int num_2,int option)
    {
        if(option==1) {
            int greater_num = (num_1 > num_2) ? num_1 : num_2;
            System.out.print(greater_num);
        }
        else if(option==2) {
            int smaller_num = (num_1 < num_2) ? num_1 : num_2;
            System.out.print(smaller_num);
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("Choose any choice:(1 or 2 or 3)");
        System.out.println("1.Find the greater of two numbers");
        System.out.println("2.Find smaller of two numbers");
        System.out.println("3.Find smaller and greater  of two numbers using ternary operator");
        int choice = sc.nextInt();
        System.out.println("Output: ");
        switch(choice)
        {
            case 1:
                variant_1(num_1,num_2);
                break;
            case 2:
                variant_2(num_1,num_2);
                break;
            case 3:
                System.out.println("Choose Option 1 or 2");
                System.out.println("1.Find the greater of two numbers");
                System.out.println("2.Find smaller of two numbers");
                int option = sc.nextInt();
                variant_3(num_1,num_2,option);
                break;
        }
    }
}
