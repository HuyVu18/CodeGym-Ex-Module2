package lesson15.indexOutArr;

import java.util.Random;

public class createRandom {


    public static Integer[] random() {;
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}
