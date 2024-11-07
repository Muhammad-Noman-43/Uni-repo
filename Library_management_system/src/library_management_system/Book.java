/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_management_system;

/**
 *
 * @author Muhammad Noman
 */
public class Book {
    String title;
    String author;
    int bookID;
    boolean isAvailable;
    
    Book(String title, String author, int bookID, boolean isAvailable){
        this.title=title;
        this.author=author;
        this.bookID=bookID;
        this.isAvailable=isAvailable;
    }
    
    boolean isAvailable(){
        
    }
}
