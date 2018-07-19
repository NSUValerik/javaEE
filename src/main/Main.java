package main;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Main implements Runnable
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new Main());
            thread.start();
        }
    }

    @Override
    public void run() {
        try {
            URLConnection urlConnection = new URL( "http://localhost:8080/javaEE/synchServlet" ).openConnection();
            urlConnection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
