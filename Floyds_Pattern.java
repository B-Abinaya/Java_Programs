import java.util.*;
public class Floyds_Pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int no=1;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
    }
}
