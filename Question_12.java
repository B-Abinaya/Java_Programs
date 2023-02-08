import java.util.*;
public class Question_12 {
    public static void variant_1(String str)
    {

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
            {
                char c = (char)(str.charAt(i) + 32);
                if(c == 'a' || c == 'e' || c== 'i' || c=='o' || c=='u')
                {
                    System.out.print(str.charAt(i));
                }
            }
            else{
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) =='u')
                {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }

    public static void variant_2(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
            {
                char c = (char)(str.charAt(i) + 32);
                if(c == 'a' || c == 'e' || c== 'i' || c=='o' || c=='u')
                {
                    count++;
                }
            }
            else{
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) =='u')
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String str = sc.nextLine();
        System.out.println("Choose the choice:(1 or 2)");
        System.out.println("1.Print the Vowels in the String");
        System.out.println("2.Print the Number of vowels in a given String");
        int choice = sc.nextInt();
        System.out.println("Output: ");
        switch(choice)
        {
            case 1:
                variant_1(str);
                break;
            case 2:
                variant_2(str);
                break;
        }
    }
}
