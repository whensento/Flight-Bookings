/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vincent Tat (501109713)
 */
public class FlightTest {
    
    private Flight Flight;
    
    public FlightTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Flight = new Flight(1030, "Toronto", "Kolkata","03/02/99 7:50 pm", 10, 1000.0);
    }
    
    @After
    public void tearDown() {
        Flight = null;
    }
    
    @Test
    public void testConstructor(){
    System.out.println("Constructor Test");
    Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
    assertEquals(1030, Flight.getFlightNumber());
    assertEquals("Toronto", Flight.getOrigin());
    assertEquals("Kolkata", Flight.getDestination());
    assertEquals("03/02/99 7:50 pm", Flight.getDepartureTime());
    assertEquals(10, Flight.getCapacity());
    assertEquals(10, Flight.getNumberOfSeatsLeft());
    assertEquals(1000.00, Flight.getOriginalPrice(), 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
    System.out.println("Invalid Constructr Test");
    Flight = new Flight(200, "Toronto", "Toronto", "05/10/24 2:30 pm", 100, 200.00);
    }
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber Test");
        Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        int expResult = 1030;
        int result = Flight.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination Test");
        Flight = new Flight(1030, "Toronto","Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        String expResult = "Kolkata";
        String result = Flight.getDestination();
        assertEquals(expResult, result);
    }
    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin Test");
        Flight = new Flight(1030, "Toronto","Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        String expResult = "Toronto";
        String result = Flight.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime Test");
        Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        String expResult = "03/02/99 7:50 pm";
        String result = Flight.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity Test");
        Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        int expResult = 10;
        int result = Flight.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft Test");
        Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        int expResult = 10;
        int result = Flight.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice Test");
        Flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        double expResult = 1000.00;
        double result = Flight.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber Test");
        int flightNumber = 1030;
        Flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, Flight.getFlightNumber());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination Test");
        String destination = "Kolkata";
        Flight.setDestination(destination);
        assertEquals(destination, Flight.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime Test");
        String departureTime = "03/02/99 7:50 pm";
        Flight.setDepartureTime(departureTime);
        assertEquals(departureTime, Flight.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity Test");
        int capacity = 10;
        Flight.setCapacity(capacity);
        assertEquals(capacity, Flight.getCapacity());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 10;
        Flight.setNumberOfSeatsLeft(numberOfSeatsLeft);
        assertEquals(numberOfSeatsLeft, Flight.getNumberOfSeatsLeft());
    }
    
    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin Test");
        String origin = "Toronto";
        Flight.setOrigin(origin);
        assertEquals(origin, Flight.getOrigin());
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice Test");
        double originalPrice = 1000.00;
        Flight.setOriginalPrice(originalPrice);
        assertEquals(originalPrice, Flight.getOriginalPrice(), 0.0);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat Test");
        Flight.setNumberOfSeatsLeft(1);
        assertTrue(Flight.bookASeat());
        assertFalse(Flight.bookASeat());
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString Test");
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 10, 1000.00);
        String expResult = "1030, Toronto to Kolkata, 03/02/99 7:50 pm, 1000.00";
        String result = flight.toString();
        assertEquals(expResult, result);
}
    
}
