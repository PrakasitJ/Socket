import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketHandler {
private PrintWriter pw;
private BufferedReader br;

public SocketHandler(Socket cs) throws IOException {
        this.pw = new PrintWriter(cs.getOutputStream());
        this.br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        }

public void sendMsg(String msg) {
        this.pw.println(msg);
        this.pw.flush();
        }

public String receiveMsg() throws IOException {
        return this.br.readLine();
        }
    }