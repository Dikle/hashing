package sample;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
    public static void write(String username, String password, String pathToFolder) throws IOException {
        FileWriter tempWrite = new FileWriter(pathToFolder + username, true);
        String line = System.getProperty("line.separator");
        tempWrite.write(password + line);
        tempWrite.close();
    }
}
