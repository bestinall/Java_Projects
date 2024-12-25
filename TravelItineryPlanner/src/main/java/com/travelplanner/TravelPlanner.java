package com.travelplanner;

import java.util.Scanner;

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itinerary Planner!");

        System.out.println("Enter destination: ");
        String destination = scanner.nextLine();

        // After collecting user input for budget
        System.out.print("Enter your total budget: ");
        double totalBudget = scanner.nextDouble();

        BudgetCalculator budgetCalculator = new BudgetCalculator(totalBudget);
        budgetCalculator.calculateBudgetAllocation();


        System.out.println("Fetching weather details...");
        WeatherService weatherService = new WeatherService();
        String weather = weatherService.getWeather(destination);
        System.out.println("Weather in " + destination + ": " + weather);

        System.out.println("Generating map link...");
        MapService mapService = new MapService();
        String mapLink = mapService.getMapLink(destination);
        System.out.println("Map link for " + destination + ": " + mapLink);



        scanner.close();
    }
}

