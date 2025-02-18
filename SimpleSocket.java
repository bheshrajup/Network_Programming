import java.io.*;
import java.net.*;

public class SimpleSocket {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("www.onlinekhabar.com",80);
            System.out.println("Connected to example.com");
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}