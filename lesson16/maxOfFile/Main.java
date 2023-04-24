package lesson16.maxOfFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFIle("src/lesson16/maxOfFile/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/lesson16/maxOfFile/result.txt", maxValue);


    }
}
