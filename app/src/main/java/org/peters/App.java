/*
 * This source file was generated by the Gradle 'init' task
 */
package org.peters;

import java.io.*;
import java.net.*;
import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class App {


    public String getIP(String hostName) throws UnknownHostException{
        InetAddress address = InetAddress.getByName(hostName);
        System.out.println("InetAddress of Named Host : " + address);
        return address.getHostAddress();

    }

    public static void main(String[] args) {
    }


}


