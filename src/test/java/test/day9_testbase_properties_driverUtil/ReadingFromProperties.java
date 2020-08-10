package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void reading_properties_file() throws IOException {  // FileInputStream ve load error verdi.o yuzden boyle yaptik

        //Properties class object allows us
        // to read from configuration.properties
        Properties properties = new Properties();

        //1.We need to show where the file is stored.
        //2.We need the path of the file
        //choose the one Path from Content Root //
        String path = "configuration.properties"; //bunu yapmak icin soldan "configuration.properties" file a ge right click for mac: copy path as relative path, for windows: copy+copy path+choose the one Path from Content Root

        //3.We need to open this configuration.properties file in java memory
        FileInputStream file = new FileInputStream(path);

        //4.We need to load the opened file into the properties object
        properties.load(file);

        //5.we can read the configuration.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        //this is coming from ==Properties properties = new Properties();
        //properties.getProperty("browser").soutv

        //properties.getProperty("username").soutv
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        //properties.getProperty("password").soutv
        System.out.println("System.getProperty(\"password\") = " + properties.getProperty("password")); //configuration.properties deki password u getirir


    }
    
    @Test
    public void using_configuration_reader_utility(){
        
        String browser = ConfigurationReader.getProperty("browser"); //bu bizim olusturdugumuz getProperty() method
        System.out.println("browser = " + browser);

        String username = ConfigurationReader.getProperty("username");
        System.out.println("username = " + username);
    }
}

/*
Gurhan'in Kodlari:

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void reading_properties_file() throws IOException {
        //Properties class object allows us
        // to read from configuration.properties
        Properties properties = new Properties();

        //We need to show where the file is stored.
        //We need the path of the file
        String path = "configuration.properties";
        //Users/cybertekchicago-1/Desktop/seleniumprojectb18/configuration.properties

        //We need to open this configuration.properties file in java memory
        FileInputStream file = new FileInputStream(path);

        //We need to load the opened file into the properties object
        properties.load(file);


        //we can read the configuration.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }


    @Test
    public void using_configuration_reader_utility(){
        String browser = ConfigurationReader.getProperty("browser");
        System.out.println("browser = " + browser);

        String username = ConfigurationReader.getProperty("username");
        System.out.println("username = " + username);
    }

}
 */
