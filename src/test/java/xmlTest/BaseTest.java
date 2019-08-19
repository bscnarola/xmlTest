package xmlTest;

import org.apache.commons.io.output.AppendableOutputStream;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends BasePage {

    @BeforeMethod(alwaysRun = true)
    public void openBrowser()
    {
        new BrowserSelector().selectBrowser();
        driver.get("https://www.britsafe.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser()
    {
        driver.quit();
    }
}
