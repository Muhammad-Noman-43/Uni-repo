/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask;

/**
 *
 * @author Muhammad Noman
 */
public class LabTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student("Nothing");
        s.displayName();
        CS s1 = new CS("Naveed");
        s1.displayName();
        SE s2 = new SE("Muhammad");
        s2.displayName();
        PHM s3 = new PHM("Sudeis");
//        System.out.println("Student 1 (Null Const) : ");
//        s1.display();
//        System.out.println("Student 2 (Parameterized Const) : ");
//        s2.display();
//        System.out.println("Student 3 (Null Const) : ");
//        s3.display();
//        System.out.println("Total subjects : "+s1.totalSubjects+" "+s2.totalSubjects+" "+s3.totalSubjects);
        s3.displayName();
    }
    
}
