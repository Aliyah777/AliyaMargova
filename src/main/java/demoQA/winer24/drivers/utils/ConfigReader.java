package demoQA.winer24.drivers.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    private ConfigReader(){

    }

    static {
        try {
            String path = "src/main/resources/app.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getValue(String key){
        return properties.getProperty(key).trim();

    }

    public static void main(String[] args) {

        System.out.println(getValue("browser"));

    }
}
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//
//    private static Properties properties;
//
//    private ConfigReader() { // приватный конструктор, который не дает создавать обьекты все этого пакета
//        //Singleton pattern
//    }
//
//    static {    // статичный блоk
//        try {
//            String path = "src\\main\\resources\\app.properties";
//            FileInputStream fileInputStream = new FileInputStream(path);
//            properties = new Properties();
//            properties.load(fileInputStream);
//            fileInputStream.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static String getValue(String key) {
//        return properties.getProperty(key).trim();
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getValue("browser"));
//        System.out.println(getValue("userName"));
//        System.out.println(getValue("password"));
//
//
//    }
//
//}
