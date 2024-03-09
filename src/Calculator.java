public class Calculator {
    static int i = 100;
    static int j = 20;


    static void addition()
    {
        System.out.println("Addition of " + i + " and " + j + " = " + (i + j));


    }

    static void subtraction()
    {
        System.out.println("subtraction of " + i + " and " + j + " = " + (i - j));
    }

    static void multiplication(int a, int b)
    {
        System.out.println("multiplication of " + a + " and " + b + " = " + (a * b));
    }
 void division(int c, int d)
 {
     System.out.println("Division =" +(c/d));
     System.out.println("value of i "+(i));//static variable is accessible in non-static method and anywhere in same class
 }
    public static void main(String[] args)
    {
        addition();
        subtraction();
        multiplication(10, 20);
        Calculator c = new Calculator ();
        c.division(2500,5);

            }
}

