package com.mycomp.collections.properties;

import java.io.*;
import java.util.Properties;

public class PropertiesClassExample {

    public static void main(String[] args) throws IOException {
        getPropertyFromFile();
        setPropertyFromFile();
    }

    public static void getPropertyFromFile() throws IOException {
        FileReader reader = new FileReader("config.properties");
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("role"));
    }

    public static void setPropertyFromFile() throws IOException {
        Properties p = new Properties();
        p.setProperty("name", "Tunga");
        p.setProperty("role", "Tester");
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("role"));
        p.store(new FileWriter("info.properties"), "Add Properties Example");
    }
}
