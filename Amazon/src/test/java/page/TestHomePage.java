package page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 12/31/2016.
 */
public class TestHomePage extends CommonAPI {

    @Test
    public void testHome(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath("//*[@id='nav-xshop']/a[2]");
    }
}
