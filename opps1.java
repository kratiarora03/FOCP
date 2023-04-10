 class Student{
    String name;
    int roll_no ;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
public static class opps1 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name= "krati";
        s1.roll_no=361;

        s1.printInfo();

    }
}
}
