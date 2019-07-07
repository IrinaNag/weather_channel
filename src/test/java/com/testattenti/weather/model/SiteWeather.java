package com.testattenti.weather.model;

public class SiteWeather {
    private Integer temperature;
    private Integer feelsLike;
    private Integer uvIndex;
    private Integer windSpeed;
    private Integer humidity;
    private Integer dewPoint;
    private Double pressure;
    private Double visibility;

    public SiteWeather() {
    }

    public SiteWeather(Integer temperature, Integer feelsLike, Integer uvIndex, Integer windSpeed, Integer humidity, Integer dewPoint, Double pressure, Double visibility) {
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.uvIndex = uvIndex;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.pressure = pressure;
        this.visibility = visibility;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Integer dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "SiteWeather{" +
                "temperature=" + temperature +
                ", feelsLike=" + feelsLike +
                ", uvIndex=" + uvIndex +
                ", windSpeed=" + windSpeed +
                ", humidity=" + humidity +
                ", dewPoint=" + dewPoint +
                ", pressure=" + pressure +
                ", visibility=" + visibility +
                '}';
    }
}
