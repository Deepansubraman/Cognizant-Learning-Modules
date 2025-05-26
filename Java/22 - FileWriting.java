import java.io.*;
import java.util.*;

class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text to write to file: ");
            String text = sc.nextLine();
            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }
}
