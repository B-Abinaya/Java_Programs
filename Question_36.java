import java.util.*;
public class Question_36 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        String input = sc.nextLine();
        int odd_Pos_Sum = 0;
        int even_Pos_Sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                even_Pos_Sum = even_Pos_Sum + Integer.parseInt(input.charAt(i)+"");
            } else {
                odd_Pos_Sum = odd_Pos_Sum + Integer.parseInt(input.charAt(i)+"");
            }
        }
        System.out.println("Output:" + (even_Pos_Sum - odd_Pos_Sum));
    }
}
