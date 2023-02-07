import java.util.*;
public class Question_5 {
    public static void variant_1(Scanner sc)
    {
        System.out.println("Input: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int j = i;
            while((j+1)>0)
            {
                System.out.print("*");
                j--;
            }
            System.out.println("");
        }
    }

    public static void variant_2(Scanner sc)
    {
        System.out.println("Input: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int j = i;
            while((j+1)>0)
            {
                System.out.print("1 ");
                j--;
            }
            System.out.println("");
        }
    }
    public static void variant_3(Scanner sc)
    {
        System.out.println("Input: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            int j = i;
            int k=1;
            while((j+1)>0)
            {
                System.out.print(k+" ");
                j--;
                k++;
            }
            System.out.println("");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
       variant_1(sc);
       variant_2(sc);
       variant_3(sc);
    }
}
