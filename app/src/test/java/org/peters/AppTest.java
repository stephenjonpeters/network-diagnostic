package org.peters;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {


    @Test void getHost() {
        Host host = new Host();
        String hostName = host.getHostName();
        String ip = host.getIP();
        String lookupIP = host.getLookupIP();
        assertEquals(hostName, "www.dnsjava.org");
        assertEquals(ip,lookupIP );
    }
}

