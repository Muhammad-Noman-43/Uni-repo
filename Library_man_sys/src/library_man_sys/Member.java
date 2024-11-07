/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_man_sys;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Noman
 */
public class Member {
    String name;
    String memberId;
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    
    Member(String n, String mId, Book b){
        name = n;
        memberId = mId;
        if(b.isAvailable){
            borrowedBooks.add(b);
            b.isAvailable = false;
        }
        Library.addMember(this);
    }
    
    boolean borrowBook(Book b){
        if(b.isAvailable){
            borrowedBooks.add(b);
            b.isAvailable = false;
            return true;
        } else {
            System.out.println("Your book is not available currently.");
            return false;
        }
    }
    
    void returnBook(Book b){
        borrowedBooks.remove(b);
        b.isAvailable = true;
    }
    
    void showBorrowedBooks(){
        int i=1;
        for(Book b : borrowedBooks){
            System.out.println("Book "+i);
            b.showBookDetails();
            System.out.println("----------------------");
            i++;
        }
    }
}
