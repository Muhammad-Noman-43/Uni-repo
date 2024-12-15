/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class Coordinator {
    
    String username, password;
    Scanner in = new Scanner(System.in);
    private int noOfFaculties, committeeNumber;
    
    Coordinator(String name, String password){
        this.username = name;
        this.password = password;
    }
    
    void setDateOfPresentation(Student s){
        if(s.Project_status == "Selected" || s.Project_status == "Completed"){
            System.out.println("Enter the date for the presentation of this student's project : ");
            s.dateOfPresentation = in.nextLine();
        } else {
            System.out.println("Please approve your project first from the Committee");
        }
    }
    
    void composeCommittee(){
        
        System.out.println("Enter the number of the committee : ");
        committeeNumber = in.nextInt();
        in.nextLine();
        
        System.out.println("Enter the total number of faculties/supervisor : ");
        noOfFaculties = in.nextInt();
        if(!(noOfFaculties>3) || !(noOfFaculties<6)){
            System.out.println("Please enter the number within the specified length (i.e. 3-5)");
            System.out.println("Enter the total number of faculties : ");
            noOfFaculties = in.nextInt();
        }
        
        System.out.println("Enter the total number of projects under supervision of this committee : ");
        int noOfProjectsForCommittee = in.nextInt();
        
        addFacultyToCommittee(searchCommittee(committeeNumber));
        
        assignProjects(noOfProjectsForCommittee, committeeNumber);
    }
    
    private void addFacultyToCommittee(Committee c){
        for(int i=0;i<noOfFaculties;i++){
            System.out.println("Enter the faculty id of faculty "+i+1+" (Don't ignore alphabet cases) : ");
            String enteredFacultyId = in.nextLine();
            int j;
            for(j=0;j<FYP_management_system.registeredFaculties.size();j++){
                if(FYP_management_system.registeredFaculties.get(j).facultyID.equals(enteredFacultyId)){
                    c.facultyList.add(FYP_management_system.registeredFaculties.get(j));
                    break;
                }
                else if(j==FYP_management_system.registeredFaculties.size()-1){
                    System.out.println("Please enter the correct Faculty id of faculty : ");
                }
            }
        }
    }
    
    private void assignProjects(int nop, int cn){
        for(int i=0;i<nop;i++){
            System.out.println("Enter the title of project "+i+1);
            String title = in.nextLine();
            searchCommittee(cn).projectsUnderSupervision.add(searchProject(title));
        }
    }
    
    private Project searchProject(String title){
        int j;
        for(j=0;j<FYP_management_system.registeredProjects.size();j++){
            if(FYP_management_system.registeredProjects.get(j).title.equals(title)){
                break;
            }
            else if(j==FYP_management_system.registeredProjects.size()-1){
                System.out.println("Please enter the correct title of the Project : ");
            }
        }
        return FYP_management_system.registeredProjects.get(j);
    }
    
    private Committee searchCommittee(int committeeNo){
        int j;
        for(j=0;j<FYP_management_system.registeredCommittees.size();j++){
            if(FYP_management_system.registeredCommittees.get(j).committeeNumber == committeeNo){
                break;
            }
            else if(j==FYP_management_system.registeredProjects.size()-1){
                System.out.println("Please enter the correct title of the Project : ");
            }
        }
        return FYP_management_system.registeredCommittees.get(j);
    }
    
    void displayCoordinatorDetails(){
        System.out.println("Co-ordinator Name : " + username);
    }
}
