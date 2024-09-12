package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target CATEGORY_PRODUCT = Target.the("Category product").located(By.xpath("/html/body/div[2]/div[6]/section/div/div/main/div[1]/div/div/div[1]/div/div/div/div/div/ul/li[1]/a"));
    public static final Target HOME = Target.the("Home page").located(By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[1]/a"));
}
