package lesson16.copyFile;

import java.io.*;

public class ReadAndWriteFile {
    public String readFile(File file) {
        String text = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine()) != null) {
                text += (line + "\n");
            }
            br.close();
        } catch (Exception e) {
            System.err.println("FileNotFoundException!!!");
        }
        return text;
    }

    public void writeFile(File file, int count) {
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\n" + "Quantily of word: " + count);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
