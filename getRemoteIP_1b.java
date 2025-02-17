package Lab.Unit1n2;

import java.lang.*; 
import java.net.*;  

public class getRemoteIP_1b{
    public static void main(String args[]){
    try{
        InetAddress IPO = InetAddress.getByName("www.onlinekhabar.com");
        System.out.println("IP of onlinekhabar.com is := "+IPO);
    }catch (Exception e){
        System.out.println("Exception caught = "+e.getMessage());
    }
}
}