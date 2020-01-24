package sample;

import java.io.File;

public class file {
    public static boolean exists(String username){
        File tmpDir = new File(constants.getPathToFolder() + username);
        return tmpDir.exists();
    }
}
