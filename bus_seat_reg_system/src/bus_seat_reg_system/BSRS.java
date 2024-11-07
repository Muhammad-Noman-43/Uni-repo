/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus_seat_reg_system;

/**
 *
 * @author Muhammad Noman
 */
public class BSRS {
//    static int [] busNo = {1,2,3,4,5};
    String name;
    int busNo = 331;
    double pricePerSeat = 1300;
    double totalPrice;
    int seatsReq;
    static int totalSeats = 30;
    static int resSeats = 19;
    int[] pastRes;
    
    void setPastRes(int [] pr){
        pastRes = pr;
    }
    
    void resCutomerSeat(String name, int reqSeats){
        this.name = name;
        seatsReq = reqSeats;
        if(calTotalPastRes()){
            System.out.println("Congrats!!! You got 50% discount based on your past reservations!");
        } else {
            System.out.println("You got no discount");
        }
    }
    
    boolean calTotalPastRes(){
        int totalRes=0;
        for(int i=0;i<pastRes.length;i++){
            totalRes+=pastRes[i];
        }
        if(totalRes>7){
            applyDisc();
            return true;
        } else {
            totalPrice = pricePerSeat*seatsReq;
            return false;
        }
    }
    
    void applyDisc(){
        totalPrice = (0.5)*pricePerSeat*seatsReq;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Bus number : "+busNo);
        System.out.println("Seats Requested : "+seatsReq);
        System.out.println("Price per Seat : "+pricePerSeat);
        System.out.println("Total amount :"+totalPrice);
    }
}