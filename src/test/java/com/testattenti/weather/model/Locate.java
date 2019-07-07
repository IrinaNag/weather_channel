package com.testattenti.weather.model;

public class Locate {
    private String locale1;
    private String locale2;
    private String locale3;
    private String locale4;

    public Locate() {
    }

    public Locate(String locale1, String locale2, String locale3, String locale4) {
        this.locale1 = locale1;
        this.locale2 = locale2;
        this.locale3 = locale3;
        this.locale4 = locale4;
    }

    public String getLocale1() {
        return locale1;
    }

    public void setLocale1(String locale1) {
        this.locale1 = locale1;
    }

    public String getLocale2() {
        return locale2;
    }

    public void setLocale2(String locale2) {
        this.locale2 = locale2;
    }

    public String getLocale3() {
        return locale3;
    }

    public void setLocale3(String locale3) {
        this.locale3 = locale3;
    }

    public String getLocale4() {
        return locale4;
    }

    public void setLocale4(String locale4) {
        this.locale4 = locale4;
    }

    @Override
    public String toString() {
        return "Locate{" +
                "locale1='" + locale1 + '\'' +
                ", locale2='" + locale2 + '\'' +
                ", locale3='" + locale3 + '\'' +
                ", locale4='" + locale4 + '\'' +
                '}';
    }
}
