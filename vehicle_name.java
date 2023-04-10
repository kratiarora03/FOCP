import java.util.Scanner;

class vehicle {
    public void calling(){
        System.out.println("this is a vehicle");
    }
}

    class car extends vehicle{
    public void calling(){
        System.out.println("this is a car");
    }
    }
 class bike extends vehicle{
    public void calling(){
        System.out.println("this is a bike");
    }
 }
        public class vehicle_name{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the number of tyres- ");
                int N = sc.nextInt();
                switch (N){
                    case 2:
                        bike ob1=new bike();
                    ob1.calling();
                    return;

                    case 4:
                        car ob2=new car();
                        ob2.calling();
                        return;

                    default:
                        vehicle ob3=new vehicle();
                        ob3.calling();
                }

            }
        }
