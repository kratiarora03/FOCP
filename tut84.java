import java.util.*;
import java.io.*;

class tut84{
    public static void main(String[] args) {
        int serial_no;
        String first_Name;
        float cgpa;
        char grade;
        try{
            File f = new File("Prac9Q4.txt");
            FileWriter write = new FileWriter(f,true);
            BufferedWriter buff = new BufferedWriter(write);
            Scanner sc = new Scanner(System.in);
            System.out.println("Serial Number :");
            serial_no = sc.nextInt();
            System.out.println("Enter First Name :");
            first_Name = sc.next();
            System.out.println("Enter CGPA :");
            cgpa = sc.nextFloat();
            System.out.println("Enter Grade :");
            grade = sc.next().charAt(0);
            buff.write("\n");
            buff.write("Serial Number \t\t\t\tName \t\t\t\tCGPA \t\t\t\tGrade");
            buff.write("\n");
            buff.write("\t "+ serial_no + "\t\t\t\t" + first_Name + "\t\t\t\t" + cgpa +
                    "\t\t\t\t" + grade);
            buff.close();
            System.out.println("\nAdded");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            File f = new File("Prac9Q4.txt");
            FileReader reader = new FileReader(f);
            BufferedReader btwo = new BufferedReader(reader);
            String string;
            System.out.println("\nThe contents of the file are: ");
            while((string = btwo.readLine()) != null ){
                System.out.println(string);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}










