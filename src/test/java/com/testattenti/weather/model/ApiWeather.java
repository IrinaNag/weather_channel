package com.testattenti.weather.model;

public class ApiWeather {
    private String id;
    private Vt1observation vt1observation;

    public ApiWeather() {
    }

    public ApiWeather(String id, Vt1observation vt1observation) {
        this.id = id;
        this.vt1observation = vt1observation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vt1observation getVt1observation() {
        return vt1observation;
    }

    public void setVt1observation(Vt1observation vt1observation) {
        this.vt1observation = vt1observation;
    }

    @Override
    public String toString() {
        return "ApiWeather{" +
                "id='" + id + '\'' +
                ", vt1observation=" + vt1observation +
                '}';
    }
}
