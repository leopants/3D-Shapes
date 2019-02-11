// I affirm that this program is entirely my own work and none of it is the work of any other person.
//	Leonardo Pantaleon

package shapes3d;

import java.util.Arrays;

/**
 * Class that tests the Shape3D objects and Point3D class.
 */     
public class Tester {

    
    public static void main(String[] args) {
        
        Shape3D[] shapes = {new Sphere(2,-7,5,15),  //creates the objects with the specified dimensions
            new Cone(-5,3,-1,11,14),
            new Cylinder(3,-5,5,10,13),
            new Parallelepiped(7,3,9,37,9,12)} ;
            
        for(Shape3D shape : shapes) {   //runs through the shapes array 
            System.out.println(shape.toString());   //prints the shape
            System.out.println("Volume: " + shape.computeVolume()); //gets the volume of the current shape
            System.out.println("Surface Area: " + shape.computeArea()); //gets the surface area of the current shape
            System.out.println("");
        }
       
        System.out.println("--");
        
        Arrays.sort(shapes);    //sorts the shapes by comparable
        
        for(Shape3D shape : shapes) {   //runs through the shapes array 
            System.out.println(shape.getClass().getSimpleName());   //prints the class name of the current shape
            System.out.println("Volume: " + shape.computeVolume()); //pritns the volume of the current shape
            System.out.println("");
        }
        
        System.out.println("--");
        
        Arrays.sort(shapes, new ThreeDComparator());    //sorts the shapes by comparator 
        
        for(Shape3D shape : shapes) {   //runs through the array of shapes
            System.out.println(shape.getClass().getSimpleName());   //gets the class of the current shape
            System.out.println("Distance from the origin: " + shape.midpointDistance());    //gets the distance from the origin 
            System.out.println("");
        }
        }
    }
    

