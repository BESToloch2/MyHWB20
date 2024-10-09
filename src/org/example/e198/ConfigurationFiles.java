package org.example.e198;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class ConfigurationFiles {
    public static void main(String[] args) throws IOException {
        String path="src/config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println("Browser: "+prop.getProperty("browser")+" URL: "+prop.getProperty("url")+" Implicity Wait: "+prop.getProperty("implicitWait"));
    }

}
