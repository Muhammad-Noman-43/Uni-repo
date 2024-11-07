/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_case_study_plus_exceptions;

/**
 *
 * @author Muhammad Noman
 */
public class exp {
    double[] indGPAs=new double[5];
    String name;
    int age;
    int rollNo;
    double GPA;
    double marks[]=new double[5];
    
    exp(){
    }
    
    exp(String n, int rn, int age, double[] m){
        name = n;
        rollNo = rn;
        this.age = age;
        for(int i=0;i<m.length;i++){
            this.marks[i]=m[i];
        }
    }
    
    double extractGPA(){
        double CGPA=0;
        for(int i=0;i<marks.length;i++){
            double temp=(marks[i]/50)*100;
            if(temp>=85)
                indGPAs[i]=4.0;
            else if(temp>=80)
                indGPAs[i]=3.66;
            else if(temp>=75)
                indGPAs[i]=3.33;
            else if(temp>=71)
                indGPAs[i]=3.0;
            else if(temp>=68)
                indGPAs[i]=2.66;
            else if(temp>=60)
                indGPAs[i]=2.33;
            else if(temp>=50)
                indGPAs[i]=2.00;
            else if(temp>=45)
                indGPAs[i]=1.66;
            else if(temp>=40)
                indGPAs[i]=1.33;
            else
                indGPAs[i]=1;
            CGPA+=indGPAs[i];
        }
        return CGPA/5;
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
        
        System.out.println("Your GPA is " + extractGPA());
    }
    
    void modMarks(int idx, double[] m, double marks){
        m[idx] = marks;
    }
}
