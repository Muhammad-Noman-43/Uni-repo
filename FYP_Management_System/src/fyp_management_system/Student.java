/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;
import java.util.Scanner;

/**
 * @author Muhammad Noman
 */
public class Student {
    Scanner in = new Scanner(System.in);
    String name;
    String regNo;
    String Department;
    String Project_status;
    int semester;
    private String password;
    String dateOfPresentation;
    Supervisor supervisor;
    
    
    Student(String n, String r, String d, int s, String ps, String p){
        name = n;
        regNo = r;
        Department = d;
        semester = s;
        Project_status = ps;
        password = p;
    }
    
    void setProjectDate(String d){
        this.dateOfPresentation = d;
    }
    
    String getStudentPassword(){
        return this.password;
    }
    
    void setStudentPassword(String p){
        this.password = p;
    }
    
    void displayStudentDetails(){
        System.out.println("Name : "+name+"\nRegistration Number : "+regNo);
        System.out.println("Department : "+Department+"\nSemester : "+semester+"\nProject Status : "+Project_status);
    }
    
    void showStudentsNameToBeGroupedWith(){
        System.out.println("Here are the names of students you may group with : ");
        for(int i=0;i<FYP_management_system.registeredStudents.size();i++){
            System.out.println(FYP_management_system.registeredStudents.get(i).name);
            System.out.println(FYP_management_system.registeredStudents.get(i).regNo);
        }
    }
    
    void groupProjectWith(String id1, String id2){
        
    }
    
    void groupProjectWith(String id1){
        
    }
    
}
