package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    public readFile() {

    }

    public static String read(String username, String pathToFolder) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFolder + username));
        return reader.readLine();
    }
}
