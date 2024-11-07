/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package case_study_lab;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class Student {
    Scanner in=new Scanner(System.in);
    
    String name;
    int age;
    int rollNo;
    double gpa;
    double[] marks;
    
    
    Student(String name, int age, int rn, double gpa, double[] marks){
        this.name=name;
        this.rollNo=rn;;
        this.gpa=gpa;
        this.age=age;
        this.marks=marks;
    }
//    void input(){
//        System.out.println("Enter your name : ");
//        this.name = 
//    }
    
    void showStDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Age : "+age);
        System.out.println("GPA : "+gpa);
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks of subject "+(i+1)+" are "+marks[i]);
        }
        System.out.println("The greatest marks you acheived among 5 subjects is "+maxMarks());
        System.out.println("The lowest marks you acheived among 5 subjects is "+minMarks());

    }
    
    double sumMarks(){
        double sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }
    
    double maxMarks(){
        double greater=marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]>greater)
                greater = marks[i];
        }
        return greater;
    }
    
    double minMarks(){
        double less=marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i]<less)
                less = marks[i];
        }
        return less;
    }
}
