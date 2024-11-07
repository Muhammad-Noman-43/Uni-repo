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
public class CS {
    static ArrayList<Student> arrCS = new ArrayList<>();
    
    static void addSt(Student s){
        System.out.println("Added to CS");
        arrCS.add(s);
    }
    
    static void displaySt(){
        for(Student st : arrCS){
            System.out.println("Name : "+st.name);
            System.out.println("GPA : "+st.gpa);
        }
    }
    
    static Student getSt(int i){
        return arrCS.get(i);
    }
    
        static void highGPA(){
            Student s = new Student();
            for(Student st:arrCS){
                if(st.gpa>s.gpa)
                    s=st;
            }
            s.showDetails();
        }
    
}
