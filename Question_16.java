import java.util.*;
public class Question_16 {
    public static  void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input: ");
        String str =sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        String reversed_string = "";
        System.out.println("Output: ");
        while(st.hasMoreTokens())
        {
            reversed_string = st.nextToken() + " " + reversed_string;

        }
        System.out.print(reversed_string);
    }
}
