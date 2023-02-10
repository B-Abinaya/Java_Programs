import java.util.*;
public class Question_35 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int input = sc.nextInt();
        int sum = 0;
        while(input>0)
        {
            int rem = input % 10;
            sum = sum +rem;
            input =input / 10;
        }
        System.out.println("Output:"+sum);
    }
}
