import java.util.*;
public class Question_18 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String input =sc.nextLine();
        int sum =0;
        for(int i = 0;i<input.length();i++)
        {
            sum = sum + (int)input.charAt(i);
        }
        System.out.println("Output: "+sum);
    }
}
