/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Muhammad Noman
 */
public class JavaApplication2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Muhammad Noman", 19, 84, 3.89);
        System.out.println("Student 1");
        st1.display();
        Student st2 = new Student("Naveed Ahmed", 20, 83, 2.7);
        System.out.println("Student 2");
        st2.display();
    }
}
