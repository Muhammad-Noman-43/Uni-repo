/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package case_study_lab;
import java.util.Scanner;
/**
 * @author Muhammad Noman
 */
public class Case_study_lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your strength : ");
        int numberOfSt = in.nextInt();
        in.nextLine();
        
        Student[] st = new Student[numberOfSt];
        
        for(int i=0;i<numberOfSt;i++){
            System.out.println("Enter your name : ");
            String name = in.nextLine();
            
            System.out.println("Enter your age : ");
            int  age = in.nextInt();
            
            System.out.println("Enter your Roll Number : ");
            int rollNo = in.nextInt();
            
            System.out.println("Enter your GPA : ");
            double gpa = in.nextDouble();
            
            double[] marks=new double[5];
            System.out.println("Enter the subject marks below : ");
            for (int j=0;j<5;j++){
                System.out.print("Subject "+(j+1)+" : ");
                marks[j]=in.nextDouble();
            }
            in.nextLine();
            
            st[i] = new Student(name, age, rollNo, gpa, marks);
            System.out.println("Student "+(i+1)+" data entered successfully!");
        }
        int stIdxGPA=0, stIdxMaxMarks=0;
        System.out.println("Displaying the input data");
        for(int i=0;i<st.length;i++){
            System.out.println("Student "+(i+1));
            st[i].showStDetails();
            System.out.println("==========");
            //Here we are checking highest GPA also...
            double highGPA=0;
            if(st[i].gpa>highGPA){
                highGPA=st[i].gpa;
                //We should store the students index with highest GPA for future processing
                stIdxGPA=i;
            }
            double maximum=0;
            if(st[i].maxMarks()>maximum){
                maximum=st[i].maxMarks();
                stIdxMaxMarks=i;
            }
        }
        System.out.println("The highest GPA is of student "+stIdxGPA+1);
        st[stIdxGPA].showStDetails();
        
        System.out.println("The highest Total marks is of student "+stIdxMaxMarks+1);
        st[stIdxMaxMarks].showStDetails();
    }
    
}
