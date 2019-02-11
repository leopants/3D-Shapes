
package shapes3d;

import java.util.Comparator;

/**
 * Class made to compare two Shape objects.
 */
public class ThreeDComparator implements Comparator {
    
    @Override
    public int compare(Object firstObject, Object secondObject) {
        Shape3D firstShape = (Shape3D) firstObject;   //downcast the parameter to a first object
        Shape3D secondShape = (Shape3D) secondObject;   //downcast second parameter to a second object
        
        double firstMidpointDist = firstShape.midpointDistance();   //find the first distance from the midpoint to the origin
        double secondMidpointDist = secondShape.midpointDistance(); //find the second distance from the midpoint to the origin
        
        if(firstMidpointDist < secondMidpointDist) {    //the first midpoint distance comes first
            return 1;
        }
        
        else if(firstMidpointDist == secondMidpointDist) {  //both distances are the same
            return 0;
        }
        
        else{   //else
            return -1;
        }
    }
}
