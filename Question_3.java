import java.util.*;
public class Question_3 {
   public static int getInput(Scanner sc)
   {
       System.out.print("Input: ");
       int n = sc.nextInt();
       return n;
   }

   //FACTORIAL OF NUMBER USING LOOPS
    public static void variant_2(Scanner sc)
    {
        int n = getInput(sc);
        int fib = 1;
        for(int i =1;i<=n;i++)
        {
            fib = fib * i;
        }
        System.out.println("Output: "+fib);
    }
    public static int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    //FACTORIAL OF NUMBER USING RECURSION
    public static void variant_3(Scanner sc)
    {
        int n=getInput(sc);
        int fact_of_num = fact(n);
        System.out.println("Output: "+fact_of_num);
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of number Using loops");
        variant_2(sc);
        System.out.println("Factorial of number Using Recursion");
        variant_3(sc);
    }

}
