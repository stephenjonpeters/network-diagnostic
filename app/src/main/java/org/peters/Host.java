package org.peters;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class Host {

    String hostName;
    String ip;
    String lookupIP;
    Host() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/config.json");
        try {
            Config config = objectMapper.readValue(file, Config.class);
            this.hostName = config.getHostName();
            this.ip = config.getIP();
            InetAddress address = InetAddress.getByName(hostName);
            lookupIP = address.getHostAddress();
        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public String getHostName(){ return this.hostName; }
    public String getIP(){ return this.ip; }
    public String getLookupIP(){ return this.lookupIP; }
}
