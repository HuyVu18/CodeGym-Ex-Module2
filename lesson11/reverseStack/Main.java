package lesson11.reverseStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int input;
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap so thu " + (i + 1));
            stk1.push(input = sc.nextInt());
        }
        System.out.println("Mang da nhap");
        System.out.println(stk1);

        Stack<Integer> stk2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stk2.push(stk1.pop());
        }
        System.out.println("Mang dao nguoc");
        System.out.println(stk2);
    }




}
