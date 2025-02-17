package Lab.Unit1n2;

import java.io.IOException;

import java.net.InetAddress;

public class Reachability{
    public static void main(String args[]) throws IOException{
        try{
            InetAddress IPO = InetAddress.getByName("www.google.com");
            System.out.println(IPO.isReachable(5000));
        }catch (Exception e){
            System.out.println("Exception caught = "+e.getMessage());
        }
    }
}