import java.util.*;
public class Array_Right_Rotation {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,5,3,6,7};
        int temp = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
           arr[i+1] = arr[i];
        }
        arr[0] = temp;
        System.out.println("The Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
