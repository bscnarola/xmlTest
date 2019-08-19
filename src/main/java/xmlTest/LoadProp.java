package xmlTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    FileInputStream fileInputStream;
    Properties prop;
    public String getProperty(String key)
    {
        try{
            fileInputStream=new FileInputStream("src\\test\\Resources\\config.properties");
            prop.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e){e.printStackTrace();}
        return prop.getProperty(key);
    }
}
