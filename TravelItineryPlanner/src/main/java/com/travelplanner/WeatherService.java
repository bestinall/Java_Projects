package com.travelplanner;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherService {
    private static final String API_KEY = "8245136097a050df2ca91e89cef67fc0";

    public String getWeather(String location) {
        String endpoint = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + API_KEY + "&units=metric";
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();
            String weather = jsonResponse.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();
            double temperature = jsonResponse.getAsJsonObject("main").get("temp").getAsDouble();

            return weather + ", " + temperature + "°C";
        } catch (Exception e) {
            e.printStackTrace();
            return "Unable to fetch weather.";
        }
    }
}

