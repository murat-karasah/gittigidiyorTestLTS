package driver;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;

import static consValue.ConsValue.*;


public class Driver {

    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(Driver.class);
    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(TARGET_URL);
        Assert.assertEquals(TARGET_TITLE, driver.getTitle());

    }
    @After
    public void closeDriver(){
     //   driver.close();
        System.exit(0);
    }
}


