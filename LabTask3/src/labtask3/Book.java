/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask3;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class Book {
    Scanner input = new Scanner(System.in);
    int bookId;
    int pages;
    double price;
    
    void get(){
        System.out.print("Enter the book ID : ");
        bookId = input.nextInt();
//        input.nextLine();
        System.out.print("Enter the number of pages : ");
        pages = input.nextInt();
//        input.nextLine();
        System.out.print("Enter the price : ");
        price = input.nextDouble();
    }
    
    void show(){
        System.out.println("Book ID : "+bookId);
        System.out.println("Book Pages : "+pages);
        System.out.println("Book Price : "+price);
    }
    
    void set(int id, int pages, double price){
        bookId = id;
        this.pages = pages;
        this.price = price;
    }
    
    double getPrice(){
        return price;
    }
}
