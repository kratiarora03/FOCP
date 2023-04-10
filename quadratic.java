import java.util.Scanner;

public class quadratic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coeff. of x^2");
        double a = sc.nextDouble();
        System.out.println("Enter the coeff of x");
        double b = sc.nextDouble();
        System.out.println("Enter the value of constant");
        double c = sc.nextDouble();
        double d = (b * b) - (4.0 * a * c);
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.03 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are" + r1 + "and" + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("the root is" + r1);
        } else {
            System.out.println("The roots are not real");
            System.out.println((-b) / (2.0 * a) + "+i" + Math.sqrt(Math.abs(d)) / (2.0 * a) + "/n" + (-b) / (2.0   * a) + "-i" + Math.sqrt(Math.abs(d)) / (2.0 * a));
        }
    }

}
