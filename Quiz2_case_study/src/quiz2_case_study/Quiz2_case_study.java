/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2_case_study;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class Quiz2_case_study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Student arrOfSt[] = new Student[3];
        for(int i=0;i<arrOfSt.length;i++){
            String name;
            System.out.print("Enter your name : ");
            name = in.nextLine();
            
            int age;
            System.out.print("Enter your age : ");
            age = in.nextInt();
            
            System.out.print("Enter your roll no. (1-100): ");
            int rollNo = in.nextInt();
            
            System.out.print("Enter your GPA : ");
            double gpa = in.nextDouble();
            
            double marks[]= new double[5];
            System.out.println("Enter the marks of each subject below (out of 50) : ");
            for(int j=0;j<marks.length;j++){
                System.out.print("Subject "+(j+1)+" : ");
                marks[j] = in.nextDouble();
            }
            in.nextLine();
            
            arrOfSt[i]=new Student(name, rollNo, age, gpa, marks);
            System.out.println("==============================");
            System.out.println("Data of Student "+(i+1)+" : ");
            arrOfSt[i].show();
            System.out.println("==============================");
        }
        
        Student high=new Student();
        for(int i=0;i<arrOfSt.length;i++){
            if(arrOfSt[i].GPA>high.GPA && arrOfSt[i].sumOfMarks()>high.sumOfMarks()){
                high = arrOfSt[i];
            }
        }
        if(high.GPA==0){
            System.out.println("None of the students have highest GPA along with highest marks");
        } else {
            System.out.println("The student with the highest GPA and Marks is : ");
            high.show();
        }
    }
}
