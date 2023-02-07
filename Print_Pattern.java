public class Print_Pattern {
    public static void main(String[]args)
    {

        for(int i=1;i<=5;i++)
        {

            int k = i;
            int j = i;
            k = k + k - 1;
            while(5-j>0)
            {
                System.out.print(" ");
                j++;
            }

            while(k>0)
            {
                System.out.print("*");
                k--;

            }


            System.out.println("");

        }
    }
}
