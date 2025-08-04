package th.mfu;

import java.io.*;
import java.net.*;

// call mockup server at port 8080
public class MockWebClient {
    public static void main(String[] args) {
        try{

        // TODO: Create a socket to connect to the web server on port 8080
        Socket socket = new Socket("localhost", 8080);

        // :TODO Create input and output streams for the socket
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // TODO: send an HTTP GET request to the web server
        
        String request = "GET / HTTP/1.1\r\nHost: localhost\r\n\r\n";
        out.println(request);
        // out.flush();
        

        // Read the response from the web server and print out to console
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        System.out.println(in.readLine());

        // Close the socket
        socket.close();
        }
        catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }

}
