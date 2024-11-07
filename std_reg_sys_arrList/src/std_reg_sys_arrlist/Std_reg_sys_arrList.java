/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package std_reg_sys_arrlist;
import java.util.*;
/**
 *
 * @author Muhammad Noman
 */
public class Std_reg_sys_arrList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("How many students data you want to enter : ");
        Scanner in = new Scanner(System.in);
        int nOfSt = in.nextInt();
        Student[] stArr = new Student[nOfSt];
        in.nextLine();
        
        for(int i =0;i<stArr.length;i++){
            System.out.print("Name : ");
            String name = in.nextLine();
            System.out.print("Age : ");
            int age = in.nextInt(); in.nextLine();
            System.out.print("ID : ");
            String id = in.nextLine();
            System.out.print("GPA : ");
            double gpa = in.nextDouble(); in.nextLine();
            stArr[i] = new Student(name, age, id, gpa);
            
            if(stArr[i].gpa>3.0)
                CS.addSt(stArr[i]);
            else
                SE.addSt(stArr[i]);
        }
        
        System.out.println("=========================");
        System.out.println("CS Students : ");
        CS.displaySt();
        System.out.println("=========================");
        System.out.println("SE Students : ");
        SE.displaySt();
        System.out.println("=========================");
        
        System.out.println("Student with the highest GPA in CS department : ");
        CS.highGPA();
        System.out.println("=========================");
        
        System.out.println("Student with the highest GPA in SE department : ");
        SE.highGPA();
        System.out.println("=========================");
    }
    
}
