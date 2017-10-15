package JavaApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


class PropertiesRead {
    public String getPropertyValue(String propertyName){
        String propertyValue="";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/main/resources/info.properties"));
            propertyValue = properties.getProperty(propertyName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } return propertyValue;
    }
}
