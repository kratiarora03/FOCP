import java.util.Scanner;
import java.lang.Exception;
public class prgm8q1
{
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of arrays = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        int k=1;

        if(arr.length>5)
        {
            throw new Exception("check argument exception");
        }

        else
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.println("enter the " + k +" element of the array");
                arr[i]=sc.nextInt();
                k++;
            }
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("The sum of the all elements of array is = " + sum);
        }
    }
}
