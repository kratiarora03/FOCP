import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
            int i;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers that are needed to be stored in the array");
            int arr[] = new int[5];
            for (i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (i = 0; i < 5; i++) {
                sum = sum + arr[i];
            }
            System.out.println("The sum of the arrays is " + sum);
        }
    }
