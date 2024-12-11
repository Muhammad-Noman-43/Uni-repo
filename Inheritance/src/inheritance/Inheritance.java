/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;
import Package2.*;
import ptopinheritancetest.TestClass;
/**
 *
 * @author Muhammad Noman
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircleFromSimpleGeometricObject circle= new CircleFromSimpleGeometricObject (2.0,"Red");
        System.out.println(circle.getcolor());
        
        RectangleFromSimpleGeometricObject newObject = new RectangleFromSimpleGeometricObject("Blue");
        System.out.println(newObject.getcolor());
        
        TriangleFromSimpleGeometricObject triangleObj = new TriangleFromSimpleGeometricObject();
        triangleObj.setColor("Brown");
        System.out.println(triangleObj.getcolor());
        
        TestClass test = new TestClass();
        test.testMsg() ;
    }
}
