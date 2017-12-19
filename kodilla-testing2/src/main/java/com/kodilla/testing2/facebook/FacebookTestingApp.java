package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//html/body/div/div[4]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/form/div/div[6]/div[2]/span/span/select";
    public static final String XPATH_MONTH = "//html/body/div/div[4]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/form/div/div[6]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR = "//html/body/div/div[4]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/form/div/div[6]/div[2]/span/span/select[3]";


    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.pl/");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayCombo = new Select(selectDay);
        selectDayCombo.selectByValue("13");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthCombo = new Select(selectMonth);
        selectMonthCombo.selectByValue("10");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearCombo = new Select(selectYear);
        selectYearCombo.selectByValue("1985");


    }
}
