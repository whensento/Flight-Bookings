/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Vincent Tat (501109713)
 */
public class Flight {
    int flightNumber;
    String origin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    // Constructor
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
    if (origin.equals(destination)){
    throw new IllegalArgumentException("Error: The origin and destination cannot be the same.");
    }
    else{
        this.origin = origin;
        this.destination = destination;
    }
    this.capacity = capacity;
    this.flightNumber = flightNumber;
    this.departureTime = departureTime;
    this.originalPrice = originalPrice; 
    this.numberOfSeatsLeft = capacity;
    }
    // Getter Methods
    public int getFlightNumber(){
        return flightNumber;
    }
    public String getDestination(){
        return destination;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    public double getOriginalPrice(){
        return originalPrice;
    }
    // Setter Methods
    void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    void setDestination(String destination){
        this.destination = destination;
    }
    void setOrigin(String origin){
        this.origin = origin;
    }
    void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    void setCapacity(int capacity){
        this.capacity = capacity;
    }
    void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    // Book a Seat Method
    public boolean bookASeat(){
        if (numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
        }
        else{
            return false;
        }
    }
    // ToString Method
    @Override
    public String toString() {
        return String.format("%d, %s to %s, %s, %.2f", flightNumber, origin, destination, departureTime, originalPrice);
}
    
}


