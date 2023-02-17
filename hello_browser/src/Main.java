import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //helloBrowser();
        helloServer();
    }

    public static void helloBrowser() throws IOException {
        // Hello Browser
        Scanner scanner = new Scanner(System.in);
        System.out.println("================ THE INTERNETS! ================ Where to? ");
        // Get user input for address
        String dst = scanner.nextLine();
        int port = 80;

        Socket socket = new Socket(dst, port);
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("GET / HTTP/1.1");
        writer.println("Host: " + dst);
        writer.println();
        writer.flush();

        System.out.println("========== RESPONSE ========== ");
        scanner = new Scanner(socket.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void helloServer() throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket socket = server.accept();

            // Open scanner
            Scanner scanner = new Scanner(socket.getInputStream());

            String request = scanner.nextLine();

            if (request.contains("quit")) {
                System.out.println("Quitting with request: " + request);
                break;
            }

            // Open writer
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String res = "HTTP/1.1 200 OK";
            System.out.println(res);
            writer.println(res);
            writer.println();
            writer.flush();


            scanner.close();
            writer.close();
            socket.close();
        }
        server.close();
    }
}