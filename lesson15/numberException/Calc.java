package lesson15.numberException;

public class Calc {
    public static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum = " + a);
            System.out.println("Sub = " + b);
            System.out.println("Multi = " + c);
            System.out.println("Div = " + d);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }
}
