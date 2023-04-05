package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = {"mm", "nn", "ll", "oo"};
        System.out.println(Arrays.toString(arr));

        List list = Arrays.asList(arr);
        Collections.reverse(list);

        String[] arrs = (String[])list.toArray(new String[3]);
        System.out.println(Arrays.toString(arrs));

    }
}


