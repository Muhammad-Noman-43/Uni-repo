/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask3;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class result {
    int rollNo;
    String name;
    double[] marks = new double[3];
    double totalMarks=0;
    
    Scanner in = new Scanner(System.in);
    void input(){
        System.out.print("Enter your name : ");
        name = in.nextLine();
        System.out.print("Enter your roll number : ");
        rollNo = in.nextInt();
        System.out.print("Enter your marks of 3 subjects : ");
        for(int i=0;i<3;i++){
            marks[i]=in.nextDouble();
        }
    }
    
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Roll number : "+rollNo);
        for(int i=0;i<3;i++){
            System.out.println("Marks of subject "+i+" : "+marks[i]);
        }
    }
    
    double total(){
        for(int i=0;i<3;i++){
            totalMarks+=marks[i];
        }
        return totalMarks;
    }
    
    double avg(){
        return totalMarks/3;
    }
    
}
