/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Noman
 */
public class Project {
    String title;
    ArrayList<Student> studentsGroup = new ArrayList<>();
    Supervisor supervisor;
    
    Project(){};
    
    Project(String projectTitle, Supervisor supervisor){
        this.supervisor = supervisor;
        this.title = projectTitle;
    }
    
    void addStudents(Student s){
        this.studentsGroup.add(s);
    }
    
    void showProjectDetails(){
        System.out.println("Project Title : "+title+"\nSupervisor Details : ");
        supervisor.showSupervisorDetails();
    }
}
