package org.peters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {

    @Test void getHost() {
        String hostName = "www.dnsjava.org";
        String expectedIP = "3.33.152.147";
        Host host = new Host(hostName,expectedIP );
        String IP = host.getIP();
        assertEquals(expectedIP,IP);
    }

    @Test
    public void testMainMethod(){
        App.main(new String[]{"www.dnsjava.org", "3.33.152.147"});
    }
}

