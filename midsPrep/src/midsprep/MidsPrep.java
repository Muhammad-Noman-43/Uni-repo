/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midsprep;
import java.util.*;
/**
 *
 * @author Muhammad Noman
 */
public class MidsPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Products
        int tPieces1=10,tPieces2=20, q1=2, q2=4, id1 = 1123, id2 = 4231;
        boolean available1 = true, available2 = true;
        String name1 = "Soap", name2 = "Shampoo";
        double price1 = 1200, price2 = 1000;
        
        Product p1 = new Product(true, id1, name1, price1, q1, tPieces1);
        Product p2 = new Product(true, id2, name2, price2, q2, tPieces2);
        
        //Cart
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of customers : ");
        int totalCustomers = in.nextInt();
        Cart[] customers = new Cart[totalCustomers];
        for(int i=0;i<totalCustomers;i++){
            System.out.println("Enter the name of the customer : ");
            
        }
    }
    
}
