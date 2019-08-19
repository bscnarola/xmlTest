package xmlTest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class BrowserSelector extends Utils {

    public void selectBrowser()
    {
        System.out.printf(new LoadProp().getProperty("browser"));
        if(new LoadProp().getProperty("browser").equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver= new ChromeDriver();
        }
    }
}
