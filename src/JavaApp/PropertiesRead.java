package JavaApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


class PropertiesRead {
    public String getPropertyValue(String propertyName){
        String propertyValue="";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/info/info.properties"));
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            System.out.println(e);
        }
        return propertyValue;
    }
}
