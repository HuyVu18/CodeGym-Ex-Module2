package lesson16.copyFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFile(File source, File target) throws IOException {
        Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) {
        File sourFile = new File("src/lesson16/copyFile/sourceFile.txt");
        File tarFile = new File("src/lesson16/copyFile/targetFile.txt");

        try {
            copyFile(sourFile, tarFile);
            System.out.println("Copy completed.");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file!!");
            System.out.println(ioe.getMessage());
        }
    }
}
