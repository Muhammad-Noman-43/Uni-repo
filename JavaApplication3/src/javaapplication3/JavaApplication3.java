/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Muhammad Noman
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Muhammad Noman", 19, 84, 3.8, 64, 63, 62);
        Student s2 = new Student("Muhammad Naveed", 20, 90, 3.2, 60, 71, 73);
        s1.sum();
        s2.sum();
        if(s1.sum()>s2.sum())
            s1.display();
        else
            s2.display();
    }
    
}
