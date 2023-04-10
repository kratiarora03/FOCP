import java.util.Scanner;
class Vehicle{
    void display(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("THIS VEHICLE IS A CAR ");
    }
}
class Bike extends Vehicle{
    void display(){
        System.out.println("THE VEHICLE IS A BIKE ");
    }
}
public class prgm5q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TYRES - ");
        int N = sc.nextInt();
        switch(N){
            case 2:
                Bike ob = new Bike();
                ob.display();
            case 4:
                Car ob1 = new Car();
                ob1.display();
            default:
                Vehicle ob2 = new Vehicle();
                ob2.display();
        }
    }
}
