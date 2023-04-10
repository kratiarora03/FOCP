public class slidestarpattern {
    public static void main(String[] args)
    {
        int a, b, c=0, rows=6;
        for(a=1 ; a<=rows ; a++, c=0)
        {
            for(b=1 ; b<=a ; b++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
