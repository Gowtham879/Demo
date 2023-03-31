package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

public class DemoCommands {
    public static WebDriver driver;
    public void openBrowser() {
//		WebDriverManager.edgedriver().setup();
        EdgeOptions option=new EdgeOptions();
        option.addArguments("disable-notifications");
        option.addArguments("start-maximized");
        driver=new EdgeDriver(option);
        driver.get("https://rahulshettyacademy.com/client");
    }
    public WebElement Xpath(String xpath) {
        WebElement	ele =DemoCommands.driver.findElement(By.xpath(xpath));
        return ele;
    }
    public WebElement click(String xpath) {
        WebElement	ele= this.Xpath(xpath);
        if(ele.isEnabled()) {
            ele.click();}
        else {
            System.out.println("Element is disable");

        }
        return ele;
    }
    public WebElement sendkeys(String xpath,String data) {
        WebElement ele=this.Xpath(xpath);
        if(ele.isEnabled()) {
            ele.sendKeys(data);
        }
        else {
            System.out.println("Element is disable");

        }
        return ele;
    }
    public void delayTime(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
    public String gettext(String xpath) {
        WebElement ele=this.Xpath(xpath);
        String str=ele.getText();
        Assert.assertEquals(str, "Samsung galaxy s6");
        return str;
    }
}
