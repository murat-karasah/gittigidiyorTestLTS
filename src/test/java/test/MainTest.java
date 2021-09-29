package test;

import org.junit.Test;

public class MainTest extends TestClass {
    @Test
    public void testRun() {

        // gittigidiyor.com Login sayfası bot
        // girişlerini devre dışı bıraktığı için
        // login başarısız olmuştur. Bu yüzden login
        // işlemi yorum satırı ile geçilmiştir.

        // login();
        searchAndSelectProduct();
        addOrderCard();
        viewCard();
        checkCardControl();
        checkCardAndPrice();


    }
}
