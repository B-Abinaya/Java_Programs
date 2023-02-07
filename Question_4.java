import java.util.*;
public class Question_4 {

    public static void variant_1(Scanner sc,int year[])
   {
       if(year[0]%4==0)
       {
           if(year[0]%100==0)
           {
               if(year[0]%400==0)
               {
                   System.out.println("Output: Leap year");
               }
               else
               {
                   System.out.println("Output: Not a Leap Year");
               }
           }
           else{
               System.out.println("Output: Leap Year");
           }

       }
       else
           System.out.println("Output: Not a Leap Year");
   }
   public static void variant_2(Scanner sc,int years[])
   {

       System.out.print("Output: ");
       for(int i=years[0];i<=years[1];i++)
       {
           if(( (i%4)==0) && ((i%100)!=0) || ((i%400)==0))
           {
               System.out.println(i+" ");
           }
       }
   }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0,i = 0;
        int years[] = new int[2];
        System.out.println("Input: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            years[i] = Integer.parseInt(st.nextToken());
            count++;
            i++;
        }
        if(count == 1)
            variant_1(sc,years);
        if(count == 2)
            variant_2(sc,years);


    }
}
