package com.example.brom.listviewjsonapp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Emiko on 4/11/2018.
 */

//klassen för att hämta url för JSON
public class Connector {
    public static Object connect(String jsonURL){
        try
        {
            URL url = new URL(jsonURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(15000);
            con.setReadTimeout(15000);
            con.setDoInput(true);
            return con;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "Error"+e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error"+e.getMessage();
        }
    }
}
