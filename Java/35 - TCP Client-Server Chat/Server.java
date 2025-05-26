import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = in.readLine()).equals("exit")) {
            System.out.println("Client: " + str);
            out.println(input.readLine());
        }
        s.close();
        ss.close();
    }
}
