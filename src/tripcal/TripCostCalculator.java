package tripcal;

public class TripCostCalculator {
    
    private int daysOfStay;
    private double dailyAccommodationCost;
    private double dailyMealCost;
    private double transportationCost;
    private double discountRate;
    
    // Constructor to initialize the trip details
    public TripCostCalculator(int daysOfStay, double dailyAccommodationCost, double dailyMealCost, double transportationCost, double discountRate) {
        this.daysOfStay = daysOfStay;
        this.dailyAccommodationCost = dailyAccommodationCost;
        this.dailyMealCost = dailyMealCost;
        this.transportationCost = transportationCost;
        this.discountRate = discountRate;
    }
    
   
    public double calculateTotalCostBeforeDiscount() {
        double totalAccommodationCost = daysOfStay * dailyAccommodationCost;
        double totalMealCost = daysOfStay * dailyMealCost;
        return totalAccommodationCost + totalMealCost + transportationCost;
    }
    
   
    public double calculateDiscountAmount(double totalCostBeforeDiscount) {
        return (discountRate / 100) * totalCostBeforeDiscount;
    }
   
    public double calculateTotalCostAfterDiscount(double totalCostBeforeDiscount, double discountAmount) {
        return totalCostBeforeDiscount - discountAmount;
    }
    
   
    public int getDaysOfStay() {
        return daysOfStay;
    }

    public double getDailyAccommodationCost() {
        return dailyAccommodationCost;
    }

    public double getDailyMealCost() {
        return dailyMealCost;
    }

    public double getTransportationCost() {
        return transportationCost;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
