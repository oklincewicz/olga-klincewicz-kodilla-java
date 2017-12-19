package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"large_form\")]/div[6]/div[2]/span/span/select";
    public static final String XPATH_MONTH = "//div[contains(@class, \"large_form\")]/div[6]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"large_form\")]/div[6]/div[2]/span/span/select[3]";


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
