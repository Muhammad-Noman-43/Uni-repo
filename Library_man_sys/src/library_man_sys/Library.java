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
public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Member> members = new ArrayList<>();
    
    static void addMember(Member m){
        members.add(m);
    }
    
    static void addBook(Book b){
        books.add(b);
    }
    
    static void lendBook(String mId, String isbn){
        int i=0;
        while(mId!=members.get(i).memberId){
            i++;
        }
        int j=0;
        while(isbn!=books.get(j).isbn){
            j++;
        }
        if(members.get(i).borrowBook(books.get(j)))
            books.get(j).markAsBorrowed();
        System.out.println("Book with title "+books.get(i).title+" is borrowed");
    }
    
    static void returnBook(String mId, String isbn){
        int i=0;
        while(mId!=members.get(i).memberId){
            i++;
        }
        int j=0;
        while(isbn!=books.get(j).isbn){
            j++;
        }
        members.get(i).returnBook(books.get(j));;
        books.get(j).markAsReturned();
        System.out.println("Book with title "+books.get(i).title+" is returned");
    }
    
    static void showAvailableBooks(){
        System.out.println("The following books are available only!");
        for(Book b: books){
            if(b.isAvailable)
                b.showBookDetails();
        }
    }
    
    static void mostBorrow(){
        Book ex = books.get(0);
        for(int i=1;i<books.size();i++){
            if(books.get(i).countBorrow>ex.countBorrow){
                ex=books.get(i);
            }
        }
        System.out.println("The most borrowed book is : ");
        ex.showBookDetails();
    }
}
