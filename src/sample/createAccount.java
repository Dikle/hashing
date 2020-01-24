package sample;

import java.io.File;
import java.io.IOException;

public class createAccount {
    public static void create(String username, String password) throws IOException {
        if (file.exists(username)){
            System.out.println("Account already exists");
        }else{
            createFile.create(username,constants.getPathToFolder());
            writeToFile.write(username, password, constants.getPathToFolder());
            System.out.println("Account created!");
        }

    }
}
