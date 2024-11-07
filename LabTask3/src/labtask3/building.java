/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask3;
import java.util.Scanner;
/**
 *
 * @author Muhammad Noman
 */
public class building {
    int floors;
    double area;
    int occupants;
    
    Scanner in = new Scanner(System.in);
    void getData(){
        System.out.print("Enter the area of the floor : ");
        area = in.nextDouble();
        System.out.print("Enter the total number of occupants : ");
        occupants = in.nextInt();
    }
    
    void areaPerPerson(){
        System.out.println("The area per person of the floor is "+area/occupants+" meter-per-person");
    }
}
