abstract class shapes {
    abstract public void Rectangle(float l, float b);

    abstract public void Square(float s);

    abstract public void Circle(double r);
}

  class Area extends shapes{
    public void Rectangle(float l, float b)
    {
    float A = l*b;
    System.out.println("the area of rectangle is " + A);
}
      public void Square(float s){

      float B =s*s ;
    System.out.println("the area of square is " + B);
            }


      public void Circle (double r ){

        double C = 3.14*r*r;
        System.out.println("the area of cicle is " + C);
        }
  }
  class abstract1 {
      public static void main(String[] args) {
          float l = 15,b = 20;
          float s = 13;
          double r = 21;
          Area a = new Area();
          a.Rectangle(l, b);
          a.Square(s);
          a.Circle(r);
      }
  }