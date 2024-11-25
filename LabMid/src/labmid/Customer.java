/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;
import java.util.*;
/**
 *
 * @author Muhammad Noman
 */
public class Customer {
    String name;
    int seats;
    ArrayList<Flight> reservedFlights = new ArrayList<>();
    
    Customer(String n){
        this.name = n;
    }
    void reserveFlight(Flight F){
        Scanner in = new Scanner(System.in);
        if(F.availableSeats!=0){
            System.out.println("Enter number of seats you want : ");
            seats = in.nextInt();
            if(F.availableSeats-seats<0)
                System.out.println("Sorry! We don't have that much seats in this flight. Try checking other flights.");
            else{
                System.out.println("You "+this.name+" reserved flight successfully");
                this.reservedFlights.add(F);
            }
        } else {
            System.out.println("Sorry! We could not reserve your desired flight!!!");
        }
    }
    
    void cancelFlight(Flight F){
        System.out.println("You cancelled flight successfully");
        this.reservedFlights.remove(F);
    }
}
