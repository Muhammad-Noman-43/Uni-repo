/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmid;
import java.util.*;
/**
 *
 * @author Muhammad Noman
 */
public class LabMid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalFlights, totalCustomers;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of Flights : ");
        totalFlights = in.nextInt();
        in.nextLine();
        Flight[] flights = new Flight[totalFlights];
        System.out.println("Enter the data of the flights");
        for(int i=0;i<totalFlights;i++){
            System.out.println("Enter the flight number : ");
            String n = in.nextLine();
            System.out.println("Enter the destination of the flight : ");
            String d = in.nextLine();
            System.out.println("Enter available seats : ");
            int avs = in.nextInt();
            in.nextLine();
            
            flights[i] = new Flight(n, d, avs);
            FlightResSys.addFlight(flights[i]);
        }
                
        System.out.println("Enter the total number of Customers : ");
        totalCustomers = in.nextInt();
        Customer[] customers = new Customer[totalCustomers];
        in.nextLine();
        
        System.out.println("Enter the data of the Customers");
        for(int i=0;i<totalCustomers;i++){
            System.out.println("Enter the customer name : ");
            String n = in.nextLine();
            
            customers[i] = new Customer(n);
            FlightResSys.addCustomer(customers[i]);
        }
        
        
        System.out.println("Do you want to book, cancel, or check for flights statuses? Yes=1, No=0");
        int req=in.nextInt();
        in.nextLine();
        while(req!=0){
            String ch ="z";
            System.out.println("For Booking flights, press b. \n For canceling any booked flight, press c. \n To show"
                    + "all flights, press a. \n To show all flights, press f:");
            ch = in.nextLine();
            switch(ch){
                case "a":
                    FlightResSys.printTotalFlights();
                    break;
                case "b":
                    System.out.println("Enter your name : ");
                    String name = in.nextLine();
                    int i=0;
                    while(!(name.equals(FlightResSys.customers.get(i).name))){
                        i++;
                    }
                    System.out.println("Enter the flight number : ");
                    String fno = in.nextLine();
                    int j=0;
                    while(!(fno.equals(FlightResSys.flights.get(j).flightNo))){
                        j++;
                    }
                    FlightResSys.reserveFlight(FlightResSys.flights.get(j), FlightResSys.customers.get(i));
                    break;
                    
                    
                case "c":
                    System.out.println("Enter your name : ");
                    String name2 = in.nextLine();
                    int i2=0;
                    while(!(name2.equals(FlightResSys.customers.get(i2).name))){
                        i2++;
                    }
                    System.out.println("Enter the flight number : ");
                    String fno2 = in.nextLine();
                    int j2=0;
                    while(!(fno2.equals(FlightResSys.flights.get(j2).flightNo))){
                        j2++;
                    }
                    FlightResSys.cancelFlight(FlightResSys.flights.get(j2), FlightResSys.customers.get(i2));
                    break;
                    
                case "f":
                    FlightResSys.showAvailableFlights();
                    break; 
            }
            
            req=0;
            System.out.println("Do you want to book, cancel, or check for flights statuses? Yes=1, No=0");
            
            req=in.nextInt();
            in.nextLine();
        }
        
    }
    
}
