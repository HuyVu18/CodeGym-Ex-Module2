package lesson16.copyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void copyFile(File source, File target) throws IOException {
        Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static int countWord(String text) {
        if (text == null) {
            return -1;
        }
        int count = 0;
        int size = text.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (text.charAt(i) != ' ' && text.charAt(i) != '\n') {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        File sourFile = new File("src/lesson16/copyFile/sourceFile.txt");
        File tarFile = new File("src/lesson16/copyFile/targetFile.txt");
        ReadAndWriteFile copyFile = new ReadAndWriteFile();
        String text = copyFile.readFile(sourFile);
        int count = countWord(text);
        try {
            System.out.println(copyFile.readFile(sourFile));
            copyFile(sourFile, tarFile);
            copyFile.writeFile(tarFile, count);
            System.out.println("Copy completed.");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file!!");
            System.out.println(ioe.getMessage());
        }


    }
}
