package lesson11.decimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Decimal Number:");
        int decnum = sc.nextInt();
        int count = 0;

        while (decnum != 0) {
            stk1.push(decnum % 2);
            decnum = decnum / 2;
            count++;
        }

        Stack<Integer> stk2 = new Stack<>();
        for (int i = 0; i < count; i++) {
            stk2.push(stk1.pop());
        }

        System.out.println("Binary of Number:");
        System.out.println(stk2);
    }
}
