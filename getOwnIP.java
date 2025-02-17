package Lab.Unit1n2;

import java.lang.*;

import java.net.*;

public class getOwnIP{

    public static void main (String args[]) throws UnknownHostException{
        try{
            InetAddress IPO = InetAddress.getLocalHost();
            System.out.println("IP of my system is := "+IPO.getHostAddress());
        InetAddress ownIP = InetAddress.getLocalHost();
        }catch (Exception e){
            System.out.println("Exception caught = "+e.getMessage());
        }
    }
}