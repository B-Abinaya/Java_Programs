import java.util.*;
public class Left_Rot_Array {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int  a[] ={1,2,3,4,5};
        int  b[] = a.clone();
        System.out.println("Enter how many digits you want to shift");
        int d = sc.nextInt();
        int count  = 0;
        int ii=0;
        for(int i = 0;i<a.length;i++)
        {
            count++;
            if(i == d-1 || i==a.length-1)
            {

                int j = i;
                while (count>0)
                {
                    a[ii] = b[j];
                    ii++;
                    count--;
                    j--;
                }
            }
        }

        b=a.clone();

        for(int i=a.length-1;i>=0;i--)
        {
            a[count] = b[i];
            count++;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }



    }
}