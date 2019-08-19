package xmlTest;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    @Test(groups = "test1")
    public void toVerifyUserCanClick()
    {
        System.out.print("abc");
    }

    @Test(groups = "test2")
    public void toVerifyUserNotClick()
    {
        System.out.println("cde");
    }
}
