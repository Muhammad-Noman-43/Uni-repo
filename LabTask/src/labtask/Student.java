/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**
 *
 * @author Muhammad Noman
 */
public class Student {
    static int n=30;
    String name;
    Student(){};
    
    Student(String n){
        name = n;
    }
    
    void display(){
        System.out.println("Name : "+name);
    }
    
    void displayName(){
        System.out.println("Name (parent class) : "+name+" "+n);
    }
}
