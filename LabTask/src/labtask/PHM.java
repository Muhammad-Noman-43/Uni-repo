/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**
 *
 * @author Muhammad Noman
 */
public class PHM extends Student{
    PHM(){
        super.n--;
    };
    PHM(String n){
        super.name = n;
        super.n--;
    }
    
    @Override void displayName(){
        System.out.println("Name (PHM class) : "+name+" "+n);
    }
}
