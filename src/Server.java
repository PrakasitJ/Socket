import java.awt.*;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args)
    {

        try {
            ServerSocket ss = new ServerSocket(6666);
            SocketHandler socketHandler = new SocketHandler(ss.accept());
            String message = "";
            while(!message.equals("exit")) {
                message = socketHandler.receiveMsg();
                System.out.println("Message = " + message);
            }
            ss.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}