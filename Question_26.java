import java.util.*;
public class Question_26 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.next();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder(input);
        for(int i =0;i<input.length();i++)
        {
            if(input.charAt(i) == a)
            {
                sb.setCharAt(i,b);
            }
        }
        System.out.println("Output:"+sb);
    }
}
