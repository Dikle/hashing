package sample;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 *
 * @author filip.nykaenen
 */

public class Controller {

    public static void main() throws Exception{
        String username = input("U");
        String password = encrypt(input("P"));
        createAccount.create(username, password);
        if (password.equals(readFile.read(username, constants.getPathToFolder()))){
            System.out.println("Welcome " + username);
        }else{
            System.out.println("Wrong username or password");
        }
    }

    private static String encrypt(String input)throws Exception{
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(input.getBytes());
        byte[] digest = md.digest();

        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(Integer.toHexString(0xFF & b));
        }
        return hexString.toString();
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