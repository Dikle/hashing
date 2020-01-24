package sample;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void create(String username, String pathToFolder) {
        File file = new File(pathToFolder + username);
    }
}
