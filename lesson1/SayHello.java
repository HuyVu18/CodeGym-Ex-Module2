package lesson1;

import java.util.Scanner;
public class SayHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String n = input.nextLine();

        System.out.println("Hello: " + n);
    }
}
