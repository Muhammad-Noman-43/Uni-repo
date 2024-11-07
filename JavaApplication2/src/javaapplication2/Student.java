/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Muhammad Noman
 */
public class Student{
    String name;
    int age;
    int id;
    double gpa;
    public Student(String name, int age, int id, double gpa){
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("ID : " + id);
        System.out.println("GPA : " + gpa);
    }
}
