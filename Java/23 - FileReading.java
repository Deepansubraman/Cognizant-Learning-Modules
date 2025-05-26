import java.io.*;

class FileReading {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File read error");
        }
    }
}
