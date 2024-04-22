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



public static void main(String[] args) {
   String hostName= "www.dnsjava.org";
   String expectedIP = "3.33.152.147";
   getMyIP();
   Host host = new Host(hostName,expectedIP);
   String ip = host.getIP();
   System.out.println(hostName);
   System.out.println(ip);
    }


}


