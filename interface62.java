interface geometricobject{
    public double getperimeter();
    public double getarea();
}
interface resizable{
    public double resize(int percent);
}

class circle implements geometricobject{
    protected double radius=1.0;

    circle(){

    }

    public circle(double radius){
        this.radius=radius;
    }
    public double getperimeter(){
        return 2*3.14*radius;
    }
    public double getarea(){
        return 3.14*radius*radius;
    }
}
class resiizablecircle extends circle implements resizable{

    public resiizablecircle (double radius){
        this.radius=radius;
    }
    public double resize(int percent){
        double change=radius*percent/100;
        double new_radius=radius+change;
        return new_radius;
    }
}
public class interface62{
    public static void main(String[] args) {
        circle c1=new circle();
        System.out.println("AREA OF CIRCLE IS : "+c1.getarea());
        System.out.println("PERIMETER OF CIRCLE IS : "+c1.getperimeter());
        resiizablecircle r1=new resiizablecircle(4);
        System.out.println("CHANGED AREA OF CIRCLE IS : "+r1.resize(3));


    }
}







