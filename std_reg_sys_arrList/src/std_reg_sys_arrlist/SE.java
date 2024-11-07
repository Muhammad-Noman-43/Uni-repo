/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package std_reg_sys_arrlist;
import java.util.ArrayList;

/**
 *
 * @author Muhammad Noman
 */
public class SE {
    static ArrayList<Student> arrSE = new ArrayList<>();
    
    static void addSt(Student s){
        System.out.println("Added to SE");
        arrSE.add(s);
    }
    
    static void displaySt(){
        for(Student st : arrSE){
            System.out.println("Name : "+st.name);
            System.out.println("GPA : "+st.gpa);
        }
    }
    
    static Student getSt(int i){
        return arrSE.get(i);
    }
    
    static void highGPA(){
        Student s = new Student();
        for(Student st:arrSE){
            if(st.gpa>s.gpa)
                s=st;
        }
        s.showDetails();
    }
}
