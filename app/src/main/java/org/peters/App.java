package org.peters;

public class App {

    public static void main(String[] args) {
        Host host = new Host();
        String hostName = host.getHostName();
        String ip = host.getIP();
        String lookupIP = host.getLookupIP();
    }


}


