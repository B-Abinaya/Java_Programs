import java.util.*;
public class Prime {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++) {
            int flag = 0;
            for (int j = 2; (j * j) <= i; j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i+",");
            }
        }
    }
}
