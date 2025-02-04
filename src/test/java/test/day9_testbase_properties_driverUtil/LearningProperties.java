package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_test(){

        //System.getProperty("os.name").soutv bunu yaptik
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        //System.getProperty("user.name").soutv bunu yaptik
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }
}

/*
Gurhan'in Kodlari:

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_test(){

        //String osName = System.getProperty("os.name");
        //System.out.println("osName = " + osName);

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }

}
 */
