/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Muhammad Noman
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;
    public CircleFromSimpleGeometricObject (double radius,String color) {
        this.radius = radius;
        setColor(color);
    }
}
