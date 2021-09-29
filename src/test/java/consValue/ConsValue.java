package consValue;

import org.openqa.selenium.By;

public class ConsValue {

    public static final String TARGET_URL = "http://www.gittigidiyor.com";
    public static final String TARGET_TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static final By LOGIN_BUTTON_HOVER = By.xpath("//div[@data-cy='header-user-menu']");
    public static final By LOGIN_BUTTON = By.xpath("//a[@data-cy='header-login-button']");
    public static final By USER_NAME_AREA = By.id("L-UserNameField");
    public static final String USER_ID = "plaguefilms@gmail.com";
    public static final By PASS_AREA = By.id("L-PasswordField");
    public static final String USER_PASS = "**********";
    public static final By SUBMINT_BUTTON = By.xpath("//input[@id='gg-login-enter']");
    public static final By SEARCH_AREA = By.cssSelector("input[name='k']");
    public static final String SEARCH_WORD = "Bilgisayar";
    public static final By SEARCH_BUTTON = By.xpath("//button[@data-cy='search-find-button']");
    public static final By NEXT_PAGE = By.xpath("//span[text()='Sonraki']");
    public static final By ITEM_LIST = By.xpath("//div//ul/li/article//div//a");
    public static final By CARD_TITLE = By.cssSelector("div[title='Sepetim']");
    public static final By LAST_CART_PRICE = By.xpath("//p[@class='new-price']");
    public static final By AMOUNT = By.xpath("//select[@class='amount']");
    public static final By CARD_CHECK=By.cssSelector("select[data-value='2']");
    public static final By CARD_DELETE=By.cssSelector("a[title='Sil']");
    public static final By CARD_CLEAN=By.cssSelector("//h2[text()='Sepetinizde ürün bulunmamaktadır.']");
    public static final By ORDER_VALUE=By.cssSelector("option[value='2']");
    public static final By SPAM = By.xpath("//span[text()='Kapat']");
    public static final By PAGE_CHECK=By.cssSelector("h1[text='Sayfa Bulunamadı.']");

}
