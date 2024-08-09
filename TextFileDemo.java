import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new FileInputStream("player.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        String name, school, major, number;// number type is string because number of 05220000320 would be equal
                                           // 5220000320 if
                                           // number type is long.
        System.out.println("Text left to read? " + fileIn.hasNextLine());
        number = fileIn.nextLine();
        name = fileIn.nextLine();
        school = fileIn.nextLine();
        major = fileIn.nextLine();
        System.out.println("Name: " + name + "\nNumber: " + number + "\nSchool: " + school + "\nMajor: " + major);
        System.out.println("Text left to read? " + fileIn.hasNextLine());
    }
}