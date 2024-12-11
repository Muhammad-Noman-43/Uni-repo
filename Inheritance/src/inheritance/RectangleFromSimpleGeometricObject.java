/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Muhammad Noman
 */
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
    RectangleFromSimpleGeometricObject(String Color){
        setColor(Color);
    }
    
    double width, length;
    void setWidth(double width){
        this.width = width;
    }
    
    void setLength(double length){
        this.length = length;
    }
    
    double getWidth(){
        return width;
    }
    
    double getLength(){
        return length;
    }
    
}