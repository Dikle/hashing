package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    private static final String pathToFile = (System.getProperty("user.home") + "\\Desktop\\password.txt");
    //private String pathToFile = (System.getProperty("user.home") + "\\Desktop\\password.txt");

    public static void main() throws Exception{

        String username = input("U");
        String password = input("P");
        newFile();
        writeToFile(encrypt(username), encrypt(password));
    }
    private static String encrypt(String input)throws Exception{
        //String message = input;
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(input.getBytes());

        byte[] digest = md.digest();


        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(Integer.toHexString(0xFF & b));
        }
        return hexString.toString();
    }
    private static void newFile() throws IOException {
        File file = new File(pathToFile);
        file.createNewFile();
    }
    private static void checkFile(){

    }
    private static void writeToFile(String userName, String password) throws IOException {
        String toWrite = (userName + "," + password);
        FileWriter testWrite = new FileWriter(pathToFile);
        String line = System.getProperty("line.separator");
        testWrite.write(toWrite + line);
        testWrite.close();
    }
    private static void readFromFile(){

    }
    private static String input(String n){
        Scanner sc = new Scanner(System.in);
        if(n.equals("U")){
            System.out.println("Enter username");
        }else if(n.equals("P")){
            System.out.println("Enter password");
        }else{
            System.out.println("system error!");
        }
        return sc.nextLine();
    }

}