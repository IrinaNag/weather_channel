package com.testattenti.weather.model;

public class ResponseSite {
    private Location location;

    public ResponseSite() {
    }

    public ResponseSite(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ResponseSite{" +
                "location=" + location +
                '}';
    }
}
