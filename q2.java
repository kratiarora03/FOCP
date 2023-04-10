import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter elements for Array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("The element = " + arr[i] + " with index " + i);
        }
        System.out.println("Enter number to search: ");
        int s = sc.nextInt();
        boolean j = true;
        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == s) {
                j = true;
                k = i;
                break;
            } else {
                j = false;
            }
        }
        if (j == true) {
            System.out.println("The element index = " + k);
        } else {
            System.out.println("The element index = -1");
        }
    }
}

