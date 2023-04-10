import java.util.Scanner;

public class mmyy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minutes for conversion");
        double a=sc.nextDouble();
        double years,  months, days;
        years=a/525600;
        days=a/1440;
        months=a/43200;
        System.out.println("Y-M-D= "+years+" years "+months+" months "+days+" days ");

    }
}
