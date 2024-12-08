/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midsprep;
import java.util.*;

/**
 *
 * @author Muhammad Noman
 */
public class Cart {
    String customerName;
    ArrayList<Product> products = new ArrayList<>();
    
    void addProductToCart(Product p){
        products.add(p);
    }
    
    void removeProductFromCart(Product p){
        products.remove(p);
    }
    
    double calTotal(){
        double total = 0;
        for(Product p : products){
            total += (p.price * p.quantity);
        }
        return total;
    }
    
    void displayCart(){
        int i=1;
        for(Product p : products){
            System.out.println("Product "+i);
            p.dataToString();
        }
    }
    
    void compareCarts(Cart c){
        if(this.products.size() > c.products.size())
            System.out.println(this.customerName + "'s cart contains most products");
        else
            System.out.println(c.customerName + "'s cart contains most products");
    }
}
