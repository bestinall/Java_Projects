package com.travelplanner;
public class BudgetCalculator {

    private double totalBudget;

    public BudgetCalculator(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public void calculateBudgetAllocation() {
        double accommodationBudget = totalBudget * 0.5; // 50% for accommodation
        double foodBudget = totalBudget * 0.3;          // 30% for food
        double travelBudget = totalBudget * 0.2;        // 20% for travel

        System.out.println("\n--- Budget Allocation ---");
        System.out.println("Total Budget: $" + totalBudget);
        System.out.println("Accommodation: $" + accommodationBudget);
        System.out.println("Food: $" + foodBudget);
        System.out.println("Travel: $" + travelBudget);
    }
}


