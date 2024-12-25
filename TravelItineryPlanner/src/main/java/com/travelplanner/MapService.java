package com.travelplanner;

public class MapService {
    private static final String API_KEY = "AIzaSyBWmbG0eoCAwMsUqdQ9lymqLYzwQF1wwl8";

    public String getMapLink(String location) {
        return "https://www.google.com/maps/search/?api=1&query=" + location.replace(" ", "+");
    }
}
