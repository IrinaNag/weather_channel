package com.testattenti.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testattenti.weather.model.SiteWeather;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.util.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;
    private CloseableHttpClient httpClient;
    private ObjectMapper objectMapper;

    /***----------Initialisation & close resources methods---------------***/

    public void start() {
        httpClient = HttpClients.custom().setRedirectStrategy(new LaxRedirectStrategy()).build();
        objectMapper = new ObjectMapper();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void stop() throws IOException {
        httpClient.close();
        driver.quit();
    }

    /***----------UI methods---------------***/

    public void openSite(String uri) {
        driver.get(uri);
    }

    public void enterZipCode(String zipCode) {
        type(By.xpath("//input[@aria-label='Location Search']"), zipCode);
    }

    public void selectFirstElementFromDropDownList() {
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='styles__item__3sdr8 styles__selected__SEH0e']")));
        click(By.xpath("//a[@class='styles__item__3sdr8 styles__selected__SEH0e']"));
    }

    public void type(By locator, String text) {
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(locator));
        click(locator);
        sendKeys(locator, text);
    }

    public void sendKeys(By locator, String text) {
        if (text != null) {
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    /***----------Parsing methods---------------***/

    public SiteWeather gettingResultsToObject() {
        int temperature = parsResulToInt(By.xpath("//div[@class='today_nowcard-temp']//span"));
        int feelsLike= parsResulToInt(By.xpath("//span[@class='deg-feels']"));
        int uvIndex= parsResulToInt(By.xpath("//div[@class='today_nowcard-hilo']//div/span[2]"),6);
        int windSpeed= parsResulToInt(By.xpath("//tr[1]//td[1]/span"));
        int humidity= parsResulToInt(By.xpath("//tr[2]//td[1]/span"));
        int dewPoint= parsResulToInt(By.xpath("//tr[3]//td[1]/span"));
        double pressure= parsResultToDouble(By.xpath("//tr[4]//td[1]/span"));
        double visibility= parsResultToDouble(By.xpath("//tr[5]//td[1]/span"));
        return new SiteWeather(temperature,feelsLike,uvIndex,windSpeed,humidity,dewPoint,pressure,visibility);
    }

    public double parsResultToDouble(By locator) {
        String str = driver.findElement(locator).getText();
        return Double.parseDouble(str.replaceAll("[^.0-9]+",""));
    }

    public int parsResulToInt(By locator, int numberEndSimbolsFofDelete) {
        String str = driver.findElement(locator).getText();
        return Integer.parseInt(str.substring(0, str.length() - numberEndSimbolsFofDelete));
    }

    public int parsResulToInt(By locator) {
        String str = driver.findElement(locator).getText();
        return Integer.parseInt(str.replaceAll("\\D+",""));
    }

    /***----------API methods---------------***/

    public String getResponseBodyAsString(URI uri) throws IOException {
        HttpGet get = new HttpGet(uri);
        CloseableHttpResponse response = httpClient.execute(get);
        return EntityUtils.toString(response.getEntity());
    }

    /***----------Getters---------------***/

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
