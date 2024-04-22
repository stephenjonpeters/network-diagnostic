package org.peters;

import java.net.*;
import java.io.*;
//import java.util.*;
//import java.net.InetAddress;

public class App {
   static void getMyIP(){

        String systemipaddress = "";
        try
        {
            URL url_name = new URL("http://checkip.amazonaws.com/");
            BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
            systemipaddress = sc.readLine().trim();
        }
        catch (Exception e)
        {
            systemipaddress = "Cannot Execute Properly";
        }
        System.out.println("Public IP Address: " + systemipaddress +"\n");
    }

   static void getHost(){
       Host host = new Host();
       String hostName = host.getHostName();
       String ip = host.getIP();
       String lookupIP = host.getLookupIP();
       System.out.println(hostName);
       System.out.println(ip);
       System.out.println(lookupIP);
   }


    public static void main(String[] args) {
        getMyIP();
        getHost();
    }


}


