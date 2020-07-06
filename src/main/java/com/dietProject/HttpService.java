package com.dietProject;

import org.apache.catalina.filters.ExpiresFilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HttpService {

    public String connect(String url) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();


        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
        }
        in.close();

        return stringBuilder.toString();

    }
}
