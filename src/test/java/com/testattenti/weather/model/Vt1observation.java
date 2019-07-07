package com.testattenti.weather.model;

public class Vt1observation {
    private Double altimeter;
    private String barometerTrend;
    private Integer barometerCode;
    private Double barometerChange;
    private Integer dewPoint;
    private Integer feelsLike;
    private String gust;
    private Integer humidity;
    private Integer icon;
    private String observationTime;
    private String obsQualifierCode;
    private String obsQualifierSeverity;
    private String phrase;
    private Integer precip24Hour;
    private Integer snowDepth;
    private Integer temperature;
    private Integer temperatureMaxSince7am;
    private Integer uvIndex;
    private String uvDescription;
    private Integer visibility;
    private Integer windSpeed;
    private String windDirCompass;
    private Integer windDirDegrees;

    public Vt1observation() {
    }

    public Vt1observation(Double altimeter, String barometerTrend, Integer barometerCode, Double barometerChange, Integer dewPoint, Integer feelsLike, String gust, Integer humidity, Integer icon, String observationTime, String obsQualifierCode, String obsQualifierSeverity, String phrase, Integer precip24Hour, Integer snowDepth, Integer temperature, Integer temperatureMaxSince7am, Integer uvIndex, String uvDescription, Integer visibility, Integer windSpeed, String windDirCompass, Integer windDirDegrees) {
        this.altimeter = altimeter;
        this.barometerTrend = barometerTrend;
        this.barometerCode = barometerCode;
        this.barometerChange = barometerChange;
        this.dewPoint = dewPoint;
        this.feelsLike = feelsLike;
        this.gust = gust;
        this.humidity = humidity;
        this.icon = icon;
        this.observationTime = observationTime;
        this.obsQualifierCode = obsQualifierCode;
        this.obsQualifierSeverity = obsQualifierSeverity;
        this.phrase = phrase;
        this.precip24Hour = precip24Hour;
        this.snowDepth = snowDepth;
        this.temperature = temperature;
        this.temperatureMaxSince7am = temperatureMaxSince7am;
        this.uvIndex = uvIndex;
        this.uvDescription = uvDescription;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDirCompass = windDirCompass;
        this.windDirDegrees = windDirDegrees;
    }

    public Double getAltimeter() {
        return altimeter;
    }

    public void setAltimeter(Double altimeter) {
        this.altimeter = altimeter;
    }

    public String getBarometerTrend() {
        return barometerTrend;
    }

    public void setBarometerTrend(String barometerTrend) {
        this.barometerTrend = barometerTrend;
    }

    public Integer getBarometerCode() {
        return barometerCode;
    }

    public void setBarometerCode(Integer barometerCode) {
        this.barometerCode = barometerCode;
    }

    public Double getBarometerChange() {
        return barometerChange;
    }

    public void setBarometerChange(Double barometerChange) {
        this.barometerChange = barometerChange;
    }

    public Integer getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Integer dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getGust() {
        return gust;
    }

    public void setGust(String gust) {
        this.gust = gust;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObsQualifierCode() {
        return obsQualifierCode;
    }

    public void setObsQualifierCode(String obsQualifierCode) {
        this.obsQualifierCode = obsQualifierCode;
    }

    public String getObsQualifierSeverity() {
        return obsQualifierSeverity;
    }

    public void setObsQualifierSeverity(String obsQualifierSeverity) {
        this.obsQualifierSeverity = obsQualifierSeverity;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Integer getPrecip24Hour() {
        return precip24Hour;
    }

    public void setPrecip24Hour(Integer precip24Hour) {
        this.precip24Hour = precip24Hour;
    }

    public Integer getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(Integer snowDepth) {
        this.snowDepth = snowDepth;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getTemperatureMaxSince7am() {
        return temperatureMaxSince7am;
    }

    public void setTemperatureMaxSince7am(Integer temperatureMaxSince7am) {
        this.temperatureMaxSince7am = temperatureMaxSince7am;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getUvDescription() {
        return uvDescription;
    }

    public void setUvDescription(String uvDescription) {
        this.uvDescription = uvDescription;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirCompass() {
        return windDirCompass;
    }

    public void setWindDirCompass(String windDirCompass) {
        this.windDirCompass = windDirCompass;
    }

    public Integer getWindDirDegrees() {
        return windDirDegrees;
    }

    public void setWindDirDegrees(Integer windDirDegrees) {
        this.windDirDegrees = windDirDegrees;
    }

    @Override
    public String toString() {
        return "Vt1observation{" +
                "altimeter=" + altimeter +
                ", barometerTrend='" + barometerTrend + '\'' +
                ", barometerCode=" + barometerCode +
                ", barometerChange=" + barometerChange +
                ", dewPoint=" + dewPoint +
                ", feelsLike=" + feelsLike +
                ", gust='" + gust + '\'' +
                ", humidity=" + humidity +
                ", icon=" + icon +
                ", observationTime='" + observationTime + '\'' +
                ", obsQualifierCode='" + obsQualifierCode + '\'' +
                ", obsQualifierSeverity='" + obsQualifierSeverity + '\'' +
                ", phrase='" + phrase + '\'' +
                ", precip24Hour=" + precip24Hour +
                ", snowDepth=" + snowDepth +
                ", temperature=" + temperature +
                ", temperatureMaxSince7am=" + temperatureMaxSince7am +
                ", uvIndex=" + uvIndex +
                ", uvDescription=" + uvDescription +
                ", visibility=" + visibility +
                ", windSpeed=" + windSpeed +
                ", windDirCompass='" + windDirCompass + '\'' +
                ", windDirDegrees=" + windDirDegrees +
                '}';
    }
}
