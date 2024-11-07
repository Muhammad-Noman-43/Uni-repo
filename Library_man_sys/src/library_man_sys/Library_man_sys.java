/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_man_sys;
import java.util.*;
/**
 *
 * @author Muhammad Noman
 */
public class Library_man_sys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book("Forty rules of love", "Elif Shafak", "1122", true);
        Book book2 = new Book("How to stop drug addiction", "Pablo Escobar", "1123", true);
        Book book3 = new Book("Panels", "Marquess Brownli", "1124", true);
        
        Member m1 = new Member("Muhammad", "112", book2);
        Member m2 = new Member("Afzal", "111", book1);
        
        m2.borrowBook(book2);
        m1.borrowBook(book3);
        m2.borrowBook(book3);
        
        System.out.println("Member 1's borrowed books : ");
        m1.showBorrowedBooks();
        System.out.println("Member 2's borrowed books : ");
        m2.showBorrowedBooks();
        
        Library.returnBook("112", "1123");
        Library.returnBook("111", "1124");
        
        Library.lendBook("112", "1123");
        Library.lendBook("111", "1123");
        Library.lendBook("112", "1124");
        
        Library.mostBorrow();
        Library.showAvailableBooks();

    }    
}
