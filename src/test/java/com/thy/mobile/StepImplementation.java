package com.thy.mobile;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class StepImplementation extends BaseTest{
    @Step("<key> id li elemente tıkla")
    public void clickBYid(String key){
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("<key> xpath li elemente tıkla")
    public void clickBYxpath(String key){
        appiumDriver.findElement(By.xpath(key)).click();
    }

    @Step("<key> css li elemente tıkla")
    public void clickBYcss(String key){
        appiumDriver.findElement(By.cssSelector(key)).click();
    }

    @Step("<key> id li elementi kontrol et")
    public void CheckElement(String key){
        Assert.assertNotNull("Element bulunamadı!", appiumDriver.findElement(By.id(key)));
    }

    @Step("<number> saniye bekle")
    public void waitForSeceond(int number) throws InterruptedException {
        Thread.sleep(number*1000);
    }

    @Step("<key> id li elemente <text> değerini yaz")
    public void sendkeyBYid(String key, String text){
        appiumDriver.findElement(By.id(key)).sendKeys(text);
    }
}
