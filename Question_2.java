import java.util.*;
public class Question_2 {

    public static int getInput(Scanner sc)
   {
       int n = sc.nextInt();
       return n;
   }
    public static void print(int a,int b)
    {
        System.out.println(a+" ");
        System.out.println(b+" ");
    }
    public static int add(int a,int b)
    {
        int c = a+b;
        System.out.println(c+" ");
        return c;
    }
    public static void variant_1(Scanner sc,int a,int b)
    {
        System.out.println("Input: ");
        int n = getInput(sc);
        print(a,b);
        while((n-2)>0)
        {
            int c = add(a,b);
            a = b;
            b = c;
            n--;
        }
    }
    public static void variant_2(Scanner sc,int a,int b)
    {
        System.out.println("Input: ");
        int n = getInput(sc);
        print(a,b);
        while((a+b)<=n)
        {
            int c = add(a,b);
            a = b;
            b = c;
        }
    }
    public static int[] fib(int n,int i,int a,int b,int[] fib)
    {

        int c = add(a,b);
        fib[i] = c;
        a = b;
        b = c;
        i++;
        n--;
        if((n-2)>0)
            return fib(n,i,a,b,fib);
        else
            return fib;

    }
    public static int[] fib_2(int n,int i,int a,int b,int[] fib)
    {

        int c = add(a,b);
        fib[i] = c;
        a = b;
        b = c;
        i++;
        if((a+b)<=n)
            return fib_2(n,i,a,b,fib);
        else
            return fib;

    }
    public static void variant_1_recur(Scanner sc,int a,int b)
    {

        System.out.println("Input: ");
        int n = getInput(sc);
        int[] fib = new int[n-2];
        print(a,b);
        int i=0;
        int[] series = fib(n,i,a,b,fib);

    }
    public static void variant_2_recur(Scanner sc,int a,int b)
    {

        System.out.println("Input: ");
        int n = getInput(sc);
        int[] fib = new int[n-2];
        print(a,b);
        int i=0;
        int[] series = fib_2(n,i,a,b,fib);

    }
    public static void variant_4(Scanner sc,int a,int b)
    {

        variant_1_recur(sc,a,b);
        variant_2_recur(sc,a,b);

    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a =1;
        int b =1;
        variant_2(sc,a,b);
        variant_1(sc,a,b);
        variant_4(sc,a,b);
    }
}
