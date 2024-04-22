package org.peters;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class Host {

    String hostName;
    String IP;
    String expectedIP;

    Host(String hostName, String expectedIP ) {
        this.hostName = hostName;
        this.expectedIP = expectedIP;
        try {
            InetAddress address = InetAddress.getByName(hostName);
            IP = address.getHostAddress();
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public String getHostName(){ return this.hostName; }
    public String getIP(){ return this.IP; }
    public String getExpectedIP(){ return this.expectedIP; }
}
