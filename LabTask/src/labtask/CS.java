/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**
 *
 * @author Muhammad Noman
 */
public class CS extends Student{
    CS(){
        super.n--;
    };
    CS(String n){
        super(n);
        super.n--;
    }
    
    @Override void displayName(){
        System.out.println("Name (CS class) : "+name+" "+n);
    }
}
