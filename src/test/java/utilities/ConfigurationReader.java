package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {  //bu genelde config diye gecer
    //1- we created properties object
    private static final Properties properties = new Properties();  //static black ta kullanacagimiz icin static yaptik.static block runs once before everything else
                                                              //All the important information we store in configuration.properties file must be ready before we star runnig
                                                              // We want to limit the access. So we dit it private

    static { //static block runs once o yuzden satic block olusturduk
        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path);

            //4- we need to load the file
            properties.load(file);

            //5- close.file
            file.close();

        //}catch (FileNotFoundException e) {  //ONCE BOYLEYDI. .load da error verdi o yuzden IOException yaptik cunku IOException parent of FileNotFoundException.
        }catch (IOException e) {
            System.out.println("Properties file not found");
        }

    }

    public static String getProperty(String keyWord){  //static yaptik. get method u class adiyla(ConfigurationReader) cagirabilelim diye //bu da bizim yaptigimiz getProperty() method
        return properties.getProperty(keyWord); //Properties class in getProperty() methodu. yani Properties class tan geliyor
        //the getProperty() method from java is to be used with the object properties that we created as private from Properties class in Java
    }
}
/*
Gurhan'in Kodlari:

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- we created properties object
    private static Properties properties = new Properties();


    static {
        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path);
            //4- we need to load the file to properties object
            properties.load(file);

            //5- close.file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }

    //Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }




}
 */
