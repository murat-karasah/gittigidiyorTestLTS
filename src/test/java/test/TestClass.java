package test;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;
import static consValue.ConsValue.*;

public class TestClass extends Methods{
    public static double productDetailsPrice;
    public static double productBasketPrice;
    public static int randomNumber;

    public static void login() {
        String ggUrl = driver.getCurrentUrl();
        Assert.assertEquals(ggUrl,"https://www.gittigidiyor.comm/","URL aynı Değil!!");
        Methods.elementHover(LOGIN_BUTTON_HOVER);
        Methods.elementToBeClickable(LOGIN_BUTTON);
        Methods.waitVisibilitySendKey(USER_NAME_AREA, USER_ID);
        Methods.waitVisibilitySendKey(PASS_AREA, USER_PASS);
        Methods.waitClicableSubmit(SUBMINT_BUTTON);
        logger.info("✓ Login işlemi başarılı!");

    }

    public static void searchAndSelectProduct() {
        Methods.waitVisibilitySendKey(SEARCH_AREA,SEARCH_WORD);
        Methods.visibilityOfElementLocated(SEARCH_BUTTON);
        Methods.visibilityOfElementLocated(NEXT_PAGE);
        Boolean pageChecker = Methods.elementVisibleControl(PAGE_CHECK,10);
        if(pageChecker==true){
            logger.info("× Sayfa Hatası");
        } else{
            logger.info("✓ Sayfa Çalışıyor");
        }
        String strUrl = driver.getCurrentUrl();
        Character pageNumber = strUrl.charAt(strUrl.length() - 1);
        if (pageNumber=='2'){
            List<WebElement> products = driver.findElements(ITEM_LIST);
            logger.info("✓boyutu : " + products.size());
            Random productSize = new Random();
            randomNumber = productSize.nextInt(products.size());
            randomNumber=randomNumber++;

        logger.info("✓ Random üretilen Sayı:" + randomNumber);
                }else{}

        Methods.visibilityOfElementLocated(SPAM);


    }


    public static void addOrderCard() {
        Methods.elementToBeClickable(SPAM);
        productDetailsPrice = Methods.orderPriceConvertDouble(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div[3]/ul/li[" + randomNumber + "]/article/div/a/div/div[2]/section[1]/span"));
        Methods.elementHover(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div[3]/ul/li[" + randomNumber + "]/article/div/a/div/div[2]/section[1]/span"));
        Methods.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div[3]/ul/li[" + randomNumber + "]/article/div/footer/button/span"));

    }

    public static void viewCard() {
        Methods.elementHover(CARD_TITLE);
        Methods.elementToBeClickable(CARD_TITLE);
        productBasketPrice = Methods.orderPriceConvertDouble(LAST_CART_PRICE);

    }

    public static void checkCardControl() {
        logger.info(productDetailsPrice+"ilk fiyat");
        logger.info(productBasketPrice+"ikinci fiyat");
        if (productDetailsPrice == productBasketPrice) {
            logger.info("✓ Ürün fiyatı ve sepet fiyatı aynı!");
        } else {
            logger.info("× Ürün fiyatı ve sepetteki ürün fiyatı eşleşmiyor! :(");
        }

    }


    public static void checkCardAndPrice() {
        Methods.elementToBeClickable(AMOUNT);
        Methods.elementToBeClickable(ORDER_VALUE);
        Boolean baskedValueChecker = Methods.elementVisibleControl(CARD_CHECK,30);
        if(baskedValueChecker==true){
            logger.info("✓ Sepette 2 adet aynı ürün var!");
        } else{
            Assert.fail("× Sepette 2 adet aynı ürün yok!");
        }
        Methods.elementToBeClickable(CARD_DELETE);
        Boolean basketClearCheck = Methods.elementVisibleControl(CARD_CLEAN,30);
        if(basketClearCheck==true){
            logger.info("✓ Sepet Temiz!");
        }else{
            Assert.fail("× Sepet içerisinde ürün var!");
        }
        logger.info("✓✓✓The End!✓✓✓");

    }


    }





