import java.util.*;
public class Duplicate_Ele_Array {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Removing Duplicate Elements");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i =0;i<n-1;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    for(int k=j+1;k<n;k++)
                    {
                        arr[k-1] = arr[k];
                    }
                    n--;
                }

            }
        }
        System.out.println();
        System.out.println("Array After Removig Duplicate Elements");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
