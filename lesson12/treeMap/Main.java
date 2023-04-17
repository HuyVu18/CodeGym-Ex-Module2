package lesson12.treeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }

    }
}
