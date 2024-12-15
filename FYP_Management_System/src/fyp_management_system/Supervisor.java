/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;

/**
 *
 * @author Muhammad Noman
 */
public class Supervisor extends Faculty{
    String password;
    int projectsSupervised;
    
    Supervisor(){
        
    }
    
    Supervisor(String n, String fid, String d, String p, int ps){
        projectsSupervised = ps;
        password = p;
        super(n,fid,d);
    }
    
    void showSupervisorDetails(){
        System.out.println("Supervisor name : "+this.name+"\nSupervisor ID : "+this.facultyID+"\nSupervisor Department : "+this.Department+"\nNumber of projects Supervised till now : "+this.projectsSupervised);
    }
    
}
