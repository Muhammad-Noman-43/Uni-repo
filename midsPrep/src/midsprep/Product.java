/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midsprep;

/**
 *
 * @author Muhammad Noman
 */
public class Product {
    int totalPieces;
    boolean isAvailable;
    int p_id;
    String p_name;
    double price;
    int quantity;
    
    Product(boolean ia, int pid, String name, double price, int quantity, int total){
        this.p_id = pid;
        this.isAvailable = ia;
        this.p_name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPieces = total;
    }
    
    void setPID(int id){
        this.p_id = id;
    }
    
    void setPName(String name){
        this.p_name = name;
    }
    void setQuantity(int q){
        this.quantity = q;
    }
    void setAvailability(boolean ia){
        this.isAvailable = ia;
    }
    void setPrice(double price){
        this.price = price;
    }
    
    int getPID(){
        return this.p_id;
    }
    
    String getPName(){
        return this.p_name;
    }
    int getQuantity(){
        return this.quantity;
    }
    boolean getAvailability(){
        return this.isAvailable;
    }
    double getPrice(){
        return  this.price;
    }
    
    void dataToString(){
        System.out.println("Product Name : "+this.p_name);
        System.out.println("Poduct id : "+this.p_id);
        System.out.println("Poduct price : "+this.price);
        System.out.println("Poduct Quantity : "+this.quantity);
        System.out.println("Are more of this product available? "+((totalPieces!=0)? "YES! Only "+totalPieces+" left":"NO! We ran out of it"));
    }
    
    
}
