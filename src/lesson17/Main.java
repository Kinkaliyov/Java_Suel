package lesson17;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\Suel Garabagli\\Documents\\Demo\\demo");
        File folder1 = new File("C:\\Users\\Suel Garabagli\\Documents\\Demo\\folder1");
        File txtfile = new File("C:\\Users\\Suel Garabagli\\Documents\\Demo\\folder1\\file1.txt");
        File folder2 = new File("C:\\Users\\Suel Garabagli\\Documents\\Demo\\folder2");

        myfile.createNewFile();
        folder1.mkdir();
        txtfile.createNewFile();
        folder2.mkdir();

        System.out.println("<==========================>");

        System.out.println("Directory of myfile: " + myfile.isDirectory());
        System.out.println("Directory of folder1: " + folder1.isDirectory());
        System.out.println("Directory of txtfile: " + txtfile.isDirectory());
        System.out.println("Directory of folder2: " + folder2.isDirectory());

        System.out.println("<==========================>");

        System.out.println("Absolute path: " + myfile.getAbsolutePath());
        System.out.println("File name: " + txtfile.getName());
        System.out.println("Last Modified: " + txtfile.lastModified());
        System.out.println("Folder 2 exists: " + folder2.exists());
        System.out.println("Folder 2 delete: " + folder2.delete());
        System.out.println("Folder 2 exists: " + folder2.exists());


    }
}