package xmlTest;

public class BrowserSelector {

    public static void selectBrowser()
    {
        if(new LoadProp().getProperty("browser").equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");

        }
    }
}
