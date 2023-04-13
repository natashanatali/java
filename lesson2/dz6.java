package Homework.lesson_2;

import java.io.File;

public class ThreeTask {
    public static void main(String[] args) {
        File file = new File("/Users/prologistic/java.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        file = new File("/Users/prologistic/temp");
        System.out.println("Расширение файла: " + getFileExtension(file));
        file = new File("/Users/prologistic/java.util.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        file = new File("/Users/prologistic/.htaccess");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
    }
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}