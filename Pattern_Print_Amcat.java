import java.util.*;
public class Pattern_Print_Amcat {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int rows = sc.nextInt();
            int no=1;
            for(int i=0;i<rows;i++)
            {

                if(i%2 == 1)
                {
                    int ii = i;
                    while(ii>0)
                    {
                        no++;
                        ii--;
                    }
                    for(int j = 0;j <= i;j++)
                    {

                        if(j == i)
                            System.out.print(no);
                        else
                            System.out.print(no+"*");
                        no--;
                    }
                    no = no + i + 2;
                    System.out.println();
                }
                else {
                    for (int j = 0; j <= i; j++) {
                        if (j == i)
                            System.out.print(no);
                        else
                            System.out.print(no + "*");
                        no++;
                    }
                    System.out.println();
                }
            }
        }


}
