import java.util.*;
public class Factorial {
  static int fact(int n)
  {
      if(n == 1)
          return 1;
      else
          return fact(n-1)*n;
  }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("Factorial of a number is :"+fact);
    }
}
