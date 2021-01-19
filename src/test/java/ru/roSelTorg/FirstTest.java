package ru.roSelTorg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://ya.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        driver.findElement(By.id("text")).sendKeys("АО Росэлторг");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()='Единая электронная торговая площадка (']")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div/div/button[1]")));
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/a[2]/i/img")).click();
        driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[2]/div/div/div/div[2]/a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div/div[2]/div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button")));
        wait.until(ExpectedConditions.urlToBe("https://etp.roseltorg.ru/authentication/register"));
        Assert.assertEquals(ExpectedConditions.urlToBe("https://etp.roseltorg.ru/authentication/register"), driver.getCurrentUrl());

    }

}

