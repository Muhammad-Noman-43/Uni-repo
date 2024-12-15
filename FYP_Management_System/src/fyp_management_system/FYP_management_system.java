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
public class FYP_management_system {
    Scanner in = new Scanner(System.in);
    static ArrayList<Faculty> registeredFaculties = new ArrayList<>();
    static ArrayList<Student> registeredStudents = new ArrayList<>();
    static ArrayList<Committee> registeredCommittees = new ArrayList<>();
    static ArrayList<Supervisor> registeredSupervisors = new ArrayList<>();
    static ArrayList<Project> registeredProjects = new ArrayList<>();
    static Coordinator c = new Coordinator("Muhammad", "m123");
    
    int reg;
    
    void registrationForms(){
        do{
            System.out.println("Here are the options. Press:");
            System.out.println("1 for registering student\n2 for regstering faculty\n3 for registering supervisor");
            System.out.println("4 for registering any project\n5 for making group with other students");
            System.out.println("6 for composing committees\n7 for registering as coordinator (you have to be a coordinator first)\n0 for exiting the program");
            reg = in.nextInt();
            in.nextLine();
            switch(reg){
            case 1:
                System.out.println("Now, you are a Student");
                System.out.println("Enter your name : ");
                String stname = in.nextLine();
                System.out.println("Enter your registration number : ");
                String stregNo = in.nextLine();
                System.out.println("Enter your semester : ");
                int stsemester = in.nextInt();
                in.nextLine();
                System.out.println("Enter your your department : ");
                String stDepartment = in.nextLine();
                System.out.println("Enter your projects status (Completed, selected, not selected)");
                String stProject_status = in.nextLine();
                System.out.println("Enter your password : ");
                String stpassword = in.nextLine();
                registeredStudents.add(new Student(stname, stregNo, stDepartment, stsemester, stProject_status, stpassword));
                System.out.println("Students data added successfully");
                break;
            case 2:
                System.out.println("Now, you are a Faculty member");
                System.out.println("Enter your name : ");
                String fname = in.nextLine();
                System.out.println("Enter your registration number : ");
                String fId = in.nextLine();
                System.out.println("Enter your your department : ");
                String fDepartment = in.nextLine();
                System.out.println("Enter your password : ");
                String fpassword = in.nextLine();
                registeredFaculties.add(new Faculty(fname, fId, fDepartment, fpassword));
                System.out.println("Faculty's data added successfully");
                break;
            case 3:
                System.out.println("Now, you are a Supervisor");
                System.out.println("Enter your name : ");
                String spname = in.nextLine();
                System.out.println("Enter your registration number : ");
                String spId = in.nextLine();
                System.out.println("Enter your your department : ");
                String spDepartment = in.nextLine();
                System.out.println("Enter your password : ");
                String spPassword = in.nextLine();
                System.out.println("How many projects have you supervised till now : ");
                int spProjectsSupervised = in.nextInt();
                registeredSupervisors.add(new Supervisor(spname, spId, spDepartment, spPassword, spProjectsSupervised));
                System.out.println("Supervisor's data added successfully");
                break;
            case 4:
                System.out.println("Project insertion by Coordinator");
                System.out.println("Enter the project title : ");
                String projectTitle = in.nextLine();
                System.out.println("Enter the id of the supervisor fo this project to be assigned : ");
                String supervisorId = in.nextLine();
                registeredProjects.add(new Project(projectTitle, searchSupervisor(supervisorId)));
                break;
            case 5:
                System.out.println("Now, you are a student and are selecting student for grouping");
                System.out.println("Enter your ID : ");
                String id = in.nextLine();
                System.out.println("Enter the project title : ");
                String projectTitleForGrouping = in.nextLine();
                System.out.println("Enter the number of students you want to group with (except you) : ");
                int noOfStudents = in.nextInt();
                in.nextLine();
                registeredProjects.get(searchProjectIdx(projectTitleForGrouping)).addStudents(searchStudent(id));
                groupStudents(noOfStudents, projectTitleForGrouping);
                break;
            case 6:
                System.out.println("You have entered coordinator's site");
                System.out.println("Enter username : ");
                String username = in.nextLine();
                System.out.println("Enter password : ");
                String cpassword = in.nextLine();
                if(username!=c.username || cpassword!=c.password){
                    System.out.println("Access Denied");
                } else {
                    System.out.println("Welcome, "+c.username);
                    c.composeCommittee();
                }
            case 0:
                return;
            default:
                System.out.println("Please enter a number out of the provided ones.");
            }
        } while(reg!=0);
    }
    
    private Supervisor searchSupervisor(String id){
        int i=0;
        for(;i<registeredSupervisors.size();i++){
            if(registeredSupervisors.get(i).facultyID.equals(id)){
                break;
            }
        }
        return registeredSupervisors.get(i);
    }
    
    Student searchStudent(String id){
        int j;
        for(j=0;j<registeredStudents.size();j++){
            if(registeredStudents.get(j).regNo.equals(id)){
                break;
            }
            else if(j==registeredStudents.size()-1){
                System.out.println("Please enter the correct registration number of the student : ");
            }
        }
        return registeredStudents.get(j);
    }
    
    int searchProjectIdx(String title){
        int j;
        for(j=0;j<registeredProjects.size();j++){
            if(registeredProjects.get(j).title.equals(title)){
                break;
            }
            else if(j==registeredProjects.size()-1){
                System.out.println("Please enter the correct title of the Project : ");
            }
        }
        return j;
    }
    
    void groupStudents(int nos, String pt){
        for(int i=0;i<nos;i++){
            System.out.println("Enter the registration number of the students you want to group with : ");
            String regNo = in.nextLine();
            registeredProjects.get(searchProjectIdx(pt)).addStudents(searchStudent(regNo));        
        }
    }
}
