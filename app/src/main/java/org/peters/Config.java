package org.peters;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Config {
    private String url;
    private String host;

    public Config(){
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/config.json");
        try {
            Config config = objectMapper.readValue(file, Config.class);
            this.url = config.getUrl();
            this.host = config.getHost();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public String getHost(){ return this.host; }
    public String getUrl(){return this.url;}
}