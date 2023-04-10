 class triangle {
     int s1;
     int s2;
     int s3;
     int a;
     int per;

     void perimeter() {
         per = s1 + s2 + s3;

     }

     void area() {
         a = s1 * s2 * s3;


     }
 }


    class triangledemo {
        public static void main(String[] args) {
            triangle t= new triangle();
            t.s1=3;
            t.s2=4;
            t.s3=5;
            t.perimeter();
            t.area();

            System.out.println("the perimeter of triangle is" + t.per);
            System.out.println("the area of triangle is" + t.a);


        }
}

