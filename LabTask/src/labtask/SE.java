/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**
 *
 * @author Muhammad Noman
 */
public class SE extends Student{
    SE(){
        super.n--;
    };
    SE(String n){
        super.name = n;
        super.n--;
    }
    
    @Override void displayName(){
        System.out.println("Name (SE class) : "+name+" "+n);
    }
}
