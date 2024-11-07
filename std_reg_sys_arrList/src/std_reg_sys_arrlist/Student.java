/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package std_reg_sys_arrlist;

/**
 *
 * @author Muhammad Noman
 */
public class Student {
    String name;
    int age;
    String id;
    double gpa;
    
    Student(){ }
    
    Student(String n, int a, String id, double gpa){
        name = n;
        age = a;
        this.id = id;
        this.gpa = gpa;
    }
    
    void setName(String n){
        this.name = n;
    }
    void setId(String id){
        this.id = id;
    }
    void setGpa(double g){
        this.gpa = g;
    }
    void setAge(int a){
        this.age = a;
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    int getAge(){
        return age;
    }
    double getGpa(){
        return gpa;
    }
    
    static void calTotalGpa(){
        
    }
    
    void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("ID : "+id);
        System.out.println("GPA : "+gpa);
    }
}
