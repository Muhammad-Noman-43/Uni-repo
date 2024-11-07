/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class regSys {
    Scanner input = new Scanner(System.in);
    String name;
    int id;
    int semester;
    double GPA;
    private String portalPass;
    
    regSys(){}
    regSys (regSys obj){
//        this.name = obj.name;
//        this.id = obj.id;
//        this.semester = obj.semester;
//        this.GPA = obj.GPA;
    }
    
    String getPass(){
        return portalPass;
    }
    
    void setPass(String password){    
        System.out.println("Set password (It will be confidential): ");
        portalPass = password;
    }
    
    void display(){
        System.out.println("NAME : "+name);
        System.out.println("ID : "+id);
        System.out.println("SEMESTER : "+semester);
        System.out.println("GPA : "+GPA);
    }
    
    boolean checkElig(){
        if(GPA>=2 && GPA<=4){
            System.out.println("You are eligible for registration!");
            return true;
        } else {
            System.out.println("Sorry! You are not eligible for registration!");
            return false;
        }
    }
    
    void setData(){
        System.out.print("Enter your GPA : ");
        GPA = input.nextDouble();
        input.nextLine();
        if(checkElig()){
            System.out.print("Enter your name : ");
            name = input.nextLine();
            System.out.print("Enter your ID : ");
            id = input.nextInt();
            System.out.print("Enter your semester : ");
            semester = input.nextInt();
            input.nextLine();
        }
    }
    
}
