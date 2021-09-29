package methods;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Methods extends  Driver {

   // public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static void elementHover(By by) {
        Actions action = new Actions(driver);
        WebElement  element = driver.findElement(by);
        action.moveToElement(element).build().perform();
        logger.info("✓"+by+" elementine hover oldu! ");
    }

    public static WebElement elementFind(By by) {
        return driver.findElement(by);


    }
    public static void visibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
        logger.info("✓"+by+" algılandı ve elemente tıklandı!");
    }

    public static void elementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement  element =wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
        logger.info("✓"+by+"algılandı ve elemente tıklandı!");

    }

    public static void waitVisibilitySendKey(By by, String key) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(by));
        element.sendKeys(key);
        logger.info("✓"+by+"'lı element algılandı ve elemente "+key+" değeri girildi!");

    }



    public static void waitClicableSubmit(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(by));
        element.submit();
        logger.info("✓"+by+"algılandı ve elemente submit olundu!");
    }
    public static double orderPriceConvertDouble(By element)
    {

        String[] orderPriceList = elementFind(element).getText().trim().split(" ");
        String priceElementString = orderPriceList[0].replaceAll(",", "");
        return Double.parseDouble(priceElementString);

    }



    public static boolean elementVisibleControl(By element,long s) {
        WebDriverWait wait= new WebDriverWait(driver,s);

        logger.info(element + " elementi " + element.toString() + " by değerine sahip");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            logger.info("× false");
            return false;
        }
        logger.info("✓ true");
        return true;

    }




}
