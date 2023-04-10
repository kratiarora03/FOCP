import java.util.Scanner;
public class q3 {
        public static void main(String[] args) {
                int n;
                int i;
                System.out.println("Enter the size of array");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                System.out.println("Enter the numbers that are needed to be stored in the array");
                int arr[] = new int[n];
                for (i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }
                int even = 0;
                int odd = 0;
                for (i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                                even++;
                        }
                        if (arr[i] % 2 != 0) {
                                odd++;
                        }
                }
                System.out.println("Total even numbers in the array are " + even);
                System.out.println("Total odd numbers in the array are " + odd);
        }
}