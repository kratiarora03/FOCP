import java.util.Scanner;
class complex {
    int real;
    int imag;

    complex add(complex c2) {
        complex c = new complex();
        c.real = this.real + c2.real;
        c.imag = this.imag + c2.imag;
        return c;
    }

    complex sub(complex c2){
        complex a = new complex();
        a.real=this.real-c2.real;
        a.imag=this.imag-c2.imag;
        return a;
    }

    complex m(complex c2){
        complex b= new complex();
        b.real=this.real*c2.real;
        b.imag=this.real*c2.real;
        return b;
    }

    complex d(complex c2){
        complex e= new complex();
        e.real=this.real/c2.real;
        e.imag=this.real/c2.real;
        return e;
    }

}
class complexdemo{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        complex c1=new complex();
        System.out.println("enter the real and imaginary roots of first equation");
        c1.real=s.nextInt();
        c1.imag=s.nextInt();

        complex c2=new complex();
        System.out.println("enter the real and imaginary roots of first equation");
        c2.real=s.nextInt();
        c2.imag=s.nextInt();

        complex c=c1.add(c2);
        System.out.println("the sum is");
        System.out.println(c.real);
        System.out.println(c.imag);

        complex a = c1.sub(c2);
        System.out.println("the difference is");
        System.out.println(a.real);
        System.out.println(a.imag);

        complex b = c1.m(c2);
        System.out.println("the product is");
        System.out.println(b.real);
        System.out.println(b.imag);

        complex e = c1.d(c2);
        System.out.println("the division is");
        System.out.println(e.real);
        System.out.println(e.imag);

    }
}

