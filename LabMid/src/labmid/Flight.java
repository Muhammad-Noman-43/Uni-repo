/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author Muhammad Noman
 */
public class Flight {
    String flightNo;
    String destination;
    int availableSeats;
    
    Flight(String fn, String d, int avSeats){
        flightNo=fn;
        destination = d;
        availableSeats=avSeats;
    }
    
    void displayFlightDetails(){
        System.out.println("Flight Number : "+flightNo);
        System.out.println("Flight Destination : "+destination);
        System.out.println("Available seats on this flight : "+availableSeats);
    }
    
    void bookSeats(int seats){
        if(this.availableSeats-seats>=0){
            System.out.println("Your seats are reserved.");
            this.availableSeats-=seats;
        }
        else
            System.out.println("Sorry! There are no available seats on the flight!");
    }
    
    void cancelSeats(int seats){
        this.availableSeats+=seats;
    }
}
