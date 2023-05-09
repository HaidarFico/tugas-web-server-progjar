
// Taro main disini
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(6666);

            while(true){
                Socket client = server.accept();

                ServerThread thread = new ServerThread();
                thread.start();
            }

            
    
            server.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}