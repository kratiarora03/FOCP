import java.util.Scanner;

public class averagemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String name = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3= sc.nextInt();
        int avg = (m1+m2+m3)/2;
        System.out.println(name);
        System.out.println(avg);
    }
}