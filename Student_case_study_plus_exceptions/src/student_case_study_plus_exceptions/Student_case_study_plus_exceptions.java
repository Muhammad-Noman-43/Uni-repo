/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_case_study_plus_exceptions;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class Student_case_study_plus_exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    // TODO code application logic here
        Scanner in = new Scanner(System.in);
        exp arrOfSt[] = new exp[1];
        for(int i=0;i<arrOfSt.length;i++){
            String name;
            System.out.print("Enter your name : ");
            name = in.nextLine();
            
            int age;
            System.out.print("Enter your age : ");
            age = in.nextInt();
            
            System.out.print("Enter your roll no. (1-100): ");
            int rollNo = in.nextInt();
            while(rollNo<1 || rollNo>100){
                System.out.println("Please enter a valid Roll Number! \n Your Roll Number : ");
                rollNo = in.nextInt();
            }
            
//            System.out.print("Enter your GPA : ");
//            double gpa = in.nextDouble();
//            while(gpa<=0 || rollNo>4){
//                System.out.println("Please enter a valid GPA!");
//                gpa = in.nextDouble();
//            }
            double marks[]= new double[5];
            System.out.println("Enter the marks of each subject below (out of 50) : ");
            for(int j=0;j<marks.length;j++){
                System.out.print("Subject "+(j+1)+" : ");
                marks[j] = in.nextDouble();
                while(marks[j]<0 || marks[j]>50){
                    System.out.println("Please enter marks out of 50! \n Marks of Subject "+(j+1)+" : ");
                    marks[j] = in.nextDouble();
                }
            }
            in.nextLine();
            
            arrOfSt[i]=new exp(name, rollNo, age, marks);
            System.out.println("==============================");
            System.out.println("Data of Student "+(i+1)+" : ");
            arrOfSt[i].show();
            System.out.println("==============================");
        }
        
        exp high=new exp();
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
