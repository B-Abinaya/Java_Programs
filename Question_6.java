import java.util.*;
public class Question_6 {
  public static int getInput(Scanner sc)
  {
      System.out.println("Input ");
      int n = sc.nextInt();
      return n;
  }
   public static void variant_3(Scanner sc)
   {
      int n = getInput(sc);
       int flag = 0;
       for(int i=2;i*i<=n;i++)
       {
           if(i*i==n)
           {
               flag++;
           }
       }
       if(flag==0)
           System.out.print("Not a Square");
       else
           System.out.println("Perfect Square");
   }
   public static void variant_4(Scanner sc)
   {
       int n  = getInput(sc);
       for(int i=1;i*i<=n;i++)
       {

               System.out.print((i*i)+" ");
       }
   }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
      variant_3(sc);
      variant_4(sc);
    }
}
