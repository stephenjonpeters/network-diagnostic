package org.peters;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class App {
    static void getMyIP() {

        String systemipaddress = "";
        try {
            URL url_name = new URL("http://checkip.amazonaws.com/");
            BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
            systemipaddress = sc.readLine().trim();
        } catch (Exception e) {
            systemipaddress = "Cannot Execute Properly";
        }
        System.out.println("My Public IP Address: " + systemipaddress + "\n");
    }


    public static void main(String[] args) {
        System.out.println("Command-line arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
        String hostName = args[0];
        String expectedIP = args[1];
        getMyIP();
        Host host = new Host(hostName, expectedIP);
        String IP = host.getIP();
        System.out.println("hostName: " + hostName);
        System.out.println("expectedIP: "+ expectedIP);
        System.out.println("IP: " + IP);
    }

}


