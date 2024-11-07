/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
/**
 *
 * @author Muhammad Noman
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Object 1 (Student 1)");
        regSys s1 = new regSys();
        //Scanner input = new Scanner(System.in);
//        s1.setData();
//        s1.display();
        System.out.println("Object 2 (Student 2)");
        regSys s2 = new regSys();
        s2.setData();
        s2.display();
        regSys s3 = new regSys(s2);
        s3.display();
    }
    
}
