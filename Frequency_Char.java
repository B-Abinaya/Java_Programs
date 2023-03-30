import java.util.*;
public class Frequency_Char {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input String:");
        String s = sc.nextLine();
        System.out.print("Enter a character to find a frequency:");
        char c = sc.next().charAt(0);
       int freq = 0;
       for(int i = 0 ; i<s.length();i++)
       {

           if(s.charAt(i) == c)
           {
               freq++;
           }
       }
       System.out.println("Frequency of "+c+" = "+freq);


    }
}
