import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args)
    {
        try {
            Socket soc = new Socket("localhost", 6666);
            SocketHandler socketHandler = new SocketHandler(soc);
            Scanner myObj = new Scanner(System.in);
            String message = "";
            while(!message.equals("exit")){
                System.out.print("Enter Message : ");
                message = myObj.nextLine();
                socketHandler.sendMsg(message);
            }
            soc.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}