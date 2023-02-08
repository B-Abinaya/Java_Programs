import java.util.*;
public class Question_11 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String str = sc.nextLine();
        String new_String = "";
        System.out.println("Choose the Choice:(1 or 2 or 3)");
        System.out.println("1.Change SmallerCases to UpperCase");
        System.out.println("2.Change UpperCases to Lower Cases");
        System.out.println("3.Change UpperCases to LowerCases and vice versa");
        int choice = sc.nextInt();
        if(choice == 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    new_String = new_String + (char) (str.charAt(i) + 32);
                } else
                    new_String = new_String + str.charAt(i);
            }
            System.out.println("Output: " + new_String);
        }
        else if(choice == 2) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    new_String = new_String + (char) (str.charAt(i) - 32);
                } else
                    new_String = new_String + str.charAt(i);
            }
            System.out.println("Output: " + new_String);
        }
        else if(choice == 3)
        {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    new_String = new_String + (char) (str.charAt(i) - 32);
                }
                else if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
                    new_String = new_String + (char) (str.charAt(i) + 32);
            }
            System.out.println("Output: " + new_String);
        }
    }
}
