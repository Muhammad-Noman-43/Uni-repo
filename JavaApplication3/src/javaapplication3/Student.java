/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Muhammad Noman
 */
public class Student {
    String name;
    int age;
    int id;
    double gpa;
    int csMarks;
    int seMarks;
    int oopMarks;
    
    public Student(String n, int age, int id, double gpa, int cs, int se, int oop){
        name = n;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        csMarks = cs;
        seMarks = se;
        oopMarks = oop;
    }
    
    int sum(){
        return (csMarks+seMarks+oopMarks);
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("ID : "+id);
        System.out.println("GPA : "+gpa);
        System.out.println("CS Marks : "+csMarks);
        System.out.println("SE Marks : "+seMarks);
        System.out.println("OOP Marks : "+oopMarks);
        System.out.println("Total marks : "+this.sum());
    }
}
