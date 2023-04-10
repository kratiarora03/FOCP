class Supermarket {
    String name;
    String type;
    int amt;

    public void material_info() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.amt);
    }
}

    public class Shopping_complex{
        public static void main(String[] args) {

            Supermarket m1 = new Supermarket();
            m1.name = "shoes";
            m1.type = "converse";
            m1.amt = 2500;

            Supermarket m2 = new Supermarket();
            m2.name = "clothes";
            m2.type = "jacket";
            m2.amt = 1000;

            m1.material_info();
            m2.material_info();
        }



    }
