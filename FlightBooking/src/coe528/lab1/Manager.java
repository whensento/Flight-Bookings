/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;
import java.util.ArrayList;

/**
 *
 * @author vince
 */
public class Manager {
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> issuedTickets;
    
    public Manager(){
        this.flights = new ArrayList<>();
        this.issuedTickets = new ArrayList<>();
    }
    
    public void createFlights(){
        Flight flight1 = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.0);
        Flight flight2 = new Flight(420, "Japan", "Egypt", "06/12/88 6:30 am", 150, 250.0);
        flights.add(flight1);
        flights.add(flight2);
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for (Flight flight : flights){
            if(flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0){
                System.out.println(flight.toString());
            }
        }
    }
    
    public Flight getFlight(int flightNumber){
        for(Flight flight : flights){
            if (flight.getFlightNumber() == flightNumber){
                return flight;
            }
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
        Flight flight = getFlight(flightNumber);
        if(flight != null && flight.bookASeat()){
            double originalPrice = flight.getOriginalPrice();
            double discountedPrice;
            
            if(p instanceof Member){
                discountedPrice = ((Member) p).applyDiscount(originalPrice);
            } else if (p instanceof NonMember){
                discountedPrice = ((NonMember)p).applyDiscount(originalPrice);
            } else {
                discountedPrice = originalPrice;
            }
            Ticket ticket = new Ticket(p, flight, discountedPrice);
            issuedTickets.add(ticket);
        } else {
            System.out.println("Booking failed.");
        }
    }
    
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.createFlights();
        System.out.println("Available Flights: ");
        manager.displayAvailableFlights("Toronto", "Kolkata");
        
        Member member = new Member("Jotaro", 30, 6);
        manager.bookSeat(1030, member);
        
        NonMember nonMember = new NonMember("Dio", 80);
        manager.bookSeat(420,nonMember);
        
        System.out.println("\nIssued Tickets: ");
        for(Ticket ticket : manager.issuedTickets){
            System.out.println(ticket.toString());
        }
    }
}
