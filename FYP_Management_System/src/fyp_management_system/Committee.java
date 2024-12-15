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
public class Committee {
    ArrayList<Faculty> facultyList = new ArrayList<>();
    ArrayList<Project> projectsUnderSupervision = new ArrayList<>();
    int committeeNumber;
    
    Committee(int cn, Project p){
        this.committeeNumber = cn;
        this.projectsUnderSupervision.add(p);
    }
    
    void showCommitteeDetails(){
        System.out.println("Committee Number : "+committeeNumber);
        
        System.out.println("Details of faculties/supervisors");
        for(int i=0;i<facultyList.size();i++){
            System.out.println("Faculty " + i + 1 + " : ");
            this.facultyList.get(i).displayFacultyDetails();
        }
        
        
        System.out.println("Details of Projects assigned");
        for(int i=0;i<facultyList.size();i++){
            System.out.println("Project " + i + 1 + " : ");
            this.projectsUnderSupervision.get(i).showProjectDetails();
        }
    }
}
