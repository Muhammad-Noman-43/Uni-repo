/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fyp_management_system;

/**
 *
 * @author Muhammad Noman
 */
public class Faculty {
    
    String name;
    String facultyID;
    String Department;
    private String password;
    
    Faculty(){};
    
    Faculty(String n, String fid, String d, String p){
        name = n;
        facultyID = fid;
        Department = d;
        password = p;
    }
    
    Faculty(String n, String fid, String d){
        name = n;
        facultyID = fid;
        Department = d;
    }
    
    String getFacultyPassword(){
        return this.password;
    }
    
    void setFacultyPassword(String p){
        this.password = p;
    }
    
    void displayFacultyDetails(){
        System.out.println("Name : "+name+"\nFaculty ID : "+facultyID+"\nDepartment : "+Department);
    }
}
