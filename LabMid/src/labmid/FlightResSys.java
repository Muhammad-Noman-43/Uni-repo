/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Noman
 */
public class FlightResSys {
    static ArrayList<Flight> flights = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    
    static void addFlight(Flight f){
        flights.add(f);
    }
    
    static void addCustomer(Customer c){
        customers.add(c);
    }
    
    static void reserveFlight(Flight f, Customer c){
        c.reserveFlight(f);
        f.bookSeats(c.seats);
    }
    
    static void cancelFlight(Flight f, Customer c){
        c.cancelFlight(f);
        f.cancelSeats(c.seats);
    }
    
    static void generateTicket(Customer c){
        int i=1;
        System.out.println("Reserved Flights of customer with name "+c.name+" are : ");
        for(Flight f: c.reservedFlights){
            System.out.println("Flight "+i+" details : ");
            f.displayFlightDetails();
            i++;
        }
    }
    
    static void printTotalFlights(){
        System.out.println("Below are all the flights registered");
        for(Flight f:flights){
            f.displayFlightDetails();
            System.out.println("-------------");
        }
    }
    
    static void showAvailableFlights(){
        System.out.println("Fights availabale are below");
        for(Flight f:flights){
            if(f.availableSeats!=0){
                f.displayFlightDetails();
                System.out.println("----------------");
            }
        }
    }
    
}
