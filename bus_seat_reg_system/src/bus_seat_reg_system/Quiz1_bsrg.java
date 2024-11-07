/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bus_seat_reg_system;
import java.util.Scanner;

/**
 *
 * @author Muhammad Noman
 */
public class Quiz1_bsrg {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    int [] pastRes = {1,1,1,2,1};
    BSRS c1 = new BSRS();
    c1.setPastRes(pastRes);
    c1.resCutomerSeat("Muhammad Noman", 3);
    c1.display();
    }
}
