public class Print_No {
    public static void main(String[]args)
    {

        for(int i=0;i<5;i++)
        {
            for(int j =0;j<5*2-1;j++)
            {
                if(j==4)
                    System.out.print("1");
                else if((j==3 || j==5)&&(i>0))
                    System.out.print("2");
                else if((j==2 || j ==6)&& (i>1))
                    System.out.print("3");
                else if((j==1 || j ==7)&& (i>2))
                    System.out.print("4");
                else if((j==0 || j ==8)&& (i>3))
                    System.out.print("5");
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }
    }
}

