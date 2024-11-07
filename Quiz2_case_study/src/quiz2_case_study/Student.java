/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_case_study;

/**
 *
 * @author Muhammad Noman
 */
public class Student {
    String name;
    int age;
    int rollNo;
    double GPA;
    double marks[];
    
    Student(){
    }
    
    Student(String n, int rn, int age, double gpa, double[] m){
        name = n;
        rollNo = rn;
        GPA = gpa;
        this.age = age;
        for(int i=0;i<m.length;i++){
            marks[i]=m[i];
        }
    }
    
    double sumOfMarks(){
        double sum = marks[0];
        for(int i=1;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }
    
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("GPA : "+GPA);
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks of subject "+(i+1)+" is "+marks[i]);
        }
    }
    
    void modMarks(int idx, double[] m, double marks){
        m[idx] = marks;
    }
    
    
}
