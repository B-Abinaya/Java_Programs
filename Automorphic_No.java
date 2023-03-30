import java.util.*;
public class Automorphic_No {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input:");
        int n = sc.nextInt();
        if(n == n*n%10)
        {
            System.out.println("Automorphic No");
        }
        else {
            System.out.println("Not a Automorphic number");
        }
    }
}
