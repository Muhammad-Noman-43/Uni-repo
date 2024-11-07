/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_man_sys;

/**
 *
 * @author Muhammad Noman
 */
public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;
    int countBorrow=0;
    
    Book(String t, String a, String isbn, boolean IA){
        title = t;
        author = a;
        this.isbn = isbn;
        isAvailable = IA;
        Library.addBook(this);
    }
    
    
    void setTitle(String t){
        this.title = t;
    }
    void setAuthor(String au){
        this.author = au;
    }
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setIsAvailable(boolean ia){
        this.isAvailable = ia;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    String getIsbn(){
        return isbn;
    }
    boolean getAvailability(){
        return isAvailable;
    }
    
    void markAsBorrowed(){
        isAvailable = false;
        countBorrow++;
    }
    
    void markAsReturned(){
        isAvailable = true;
    }
    
    void showBookDetails(){
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book ISBN : "+isbn);
    }
}