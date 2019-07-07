package com.testattenti.weather;

import com.testattenti.weather.model.ApiWeather;
import com.testattenti.weather.model.ResponseSite;
import com.testattenti.weather.model.SiteWeather;
import org.apache.http.client.utils.URIBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GettingWeatherForZipTest {

    private static final ApplicationManager app = new ApplicationManager();

    private static final String SITE_URI = "https://weather.com/";
    private static final String SCHEME = "http";
    private static final String HOST = "api.weather.com";
    private static final String ZIP_CODE = "20852";
    private static final String COUNTRY_CODE = "US";
    private static final String API_KEY = "d522aa97197fd864d36b418f39ebb323";
    private static final String FORMAT = "json";
    private static final String LENGUAGE = "en-US";
    private static final String PATH_1 = "/v3/location/point";
    private static final String PATH_2 = "/v2/turbo/vt1observation";
    private static final String UNITS = "e";

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @Test
    public void testGettingWeatherForZip() throws IOException, URISyntaxException, InterruptedException {

        /***----------Getting weather from site---------------***/

        app.openSite(SITE_URI);
        app.enterZipCode(ZIP_CODE);
        app.selectFirstElementFromDropDownList();
        SiteWeather siteWeather = app.gettingResultsToObject();


        /***----------Getting weather via API---------------***/

        /***-------Getting location--------***/
        URI uri_1 = new URIBuilder()
                .setScheme(SCHEME)
                .setHost(HOST)
                .setPath(PATH_1)
                .addParameter("apiKey", API_KEY)
                .addParameter("format", FORMAT)
                .addParameter("language", LENGUAGE)
                .addParameter("postalKey", ZIP_CODE + ":" + COUNTRY_CODE)
                .build();
        String responseBody_1=app.getResponseBodyAsString(uri_1);
        ResponseSite responseSite = app.getObjectMapper().readValue(responseBody_1, ResponseSite.class);

        /***-------Getting weather---------***/
        URI uri_2 = new URIBuilder()
                .setScheme(SCHEME)
                .setHost(HOST)
                .setPath(PATH_2)
                .addParameter("apiKey", API_KEY)
                .addParameter("format", FORMAT)
                .addParameter("geocode", responseSite.getLocation().getLatitude().toString() + "," + responseSite.getLocation().getLongitude().toString())
                .addParameter("language", LENGUAGE)
                .addParameter("units", UNITS)
                .build();
        String responseBody_2=app.getResponseBodyAsString(uri_2);
        ApiWeather apiWeather = app.getObjectMapper().readValue(responseBody_2, ApiWeather.class);


        /***----------Checking results---------------***/

        assertThat(responseSite.getLocation().getPostalCode(), equalTo("20852"));
        assertThat(responseSite.getLocation().getCountryCode(), equalTo("US"));
        assertThat(apiWeather.getVt1observation().getTemperature()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getTemperature() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getTemperature() * 1.1))));
        assertThat(apiWeather.getVt1observation().getFeelsLike()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getFeelsLike() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getFeelsLike() * 1.1))));
        assertThat(apiWeather.getVt1observation().getUvIndex()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getUvIndex() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getUvIndex() * 1.1))));
        assertThat(apiWeather.getVt1observation().getHumidity()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getHumidity() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getHumidity() * 1.1))));
        assertThat(apiWeather.getVt1observation().getDewPoint()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getDewPoint() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getDewPoint() * 1.1))));
        assertThat(apiWeather.getVt1observation().getAltimeter()
                , allOf(greaterThanOrEqualTo(siteWeather.getPressure() * 0.9)
                        , lessThanOrEqualTo(siteWeather.getPressure() * 1.1)));
        assertThat(apiWeather.getVt1observation().getVisibility()
                , allOf(greaterThanOrEqualTo((int) (siteWeather.getVisibility() * 0.9))
                        , lessThanOrEqualTo((int) (siteWeather.getVisibility() * 1.1))));
    }

    @AfterClass
    public void tearDown() throws IOException {
        app.stop();
    }

}
