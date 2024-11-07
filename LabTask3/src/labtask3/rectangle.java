/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask3;

/**
 *
 * @author Muhammad Noman
 */
public class rectangle {
    double length=1;
    double width=1;
    
    void setLen(double l){
        if(l>=0.0 && l<=20.0)
            this.length = l;
    }
    
    double getLen(){
        return length;
    }
    
    void setWid(double w){
        if(w>=0.0 && w<=20.0)
            this.width = w;
    }
    
    double getWid(){
        return width;
    }
    
    double perimeter(){
        return 2*length*width;
    }
    
    double area(){
        return length*width;
    }
}
