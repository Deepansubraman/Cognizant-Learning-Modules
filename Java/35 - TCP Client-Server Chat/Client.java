import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = input.readLine()).equals("exit")) {
            out.println(str);
            System.out.println("Server: " + in.readLine());
        }
        s.close();
    }
}
