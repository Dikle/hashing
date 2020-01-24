package sample;

public class constants {
    private static final String pathToFolder = (System.getProperty("user.home") + "\\Desktop\\Accounts\\");

    public constants(){
    }

    public static String getPathToFolder(){
        return pathToFolder;
    }
}
