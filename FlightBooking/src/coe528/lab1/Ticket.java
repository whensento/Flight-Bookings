/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author vince
 */
public class Ticket {
    private double price;
    private int number;
    private Passenger passenger;
    private Flight flight;
    private static int ticketCounter = 0;
 // Constructor
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.number= ++ticketCounter;
    }
    // Getters and Setters
    public Passenger getPassenger(){
        return passenger;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }
    
    public void setFlight(Flight flight){
        this.flight = flight;
    }
    
    public void getPrice(double price){
        this.price = price;
    }
    
    // ToString Method
    
    @Override
    public String toString(){
        return String.format("%s, %s, Original Price: $%.2f, Ticket Price: $%.2f", passenger.toString(), flight.toString(), price, price);
    }
}
