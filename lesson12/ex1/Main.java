package lesson12.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 25);
        hashMap.put("Z", 22);
        hashMap.put("D", 27);
        hashMap.put("E", 21);
        System.out.println("Dislay entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    }
}
