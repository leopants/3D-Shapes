package shapes3d;

/**
 * Abstract class that has methods for volume and area as well as some .
 */
abstract public class Shape3D implements Comparable {
    
    int x;  //initializes variables 
    int y;
    int z;
    Point3D midPoint;
    
    /**
     * Creates a midpoint shared with the point3D class.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     */
    Shape3D(int x, int y, int z) {
        midPoint = new Point3D(x,y,z);  //declares midpoint
    }
    
    /**
     * Method returns the coordinates of the midpoint from the toString of the Point3D class.
     * @return the coordinates of the midpoint
     */
    @Override
    public String toString() {  //a to string method that returns the midpoint coordinates 
        return midPoint.toString();
    }
    
    /**
     * Abstract method for computing the volume.
     * @return a double of the volume
     */
    public abstract double computeVolume() ;    //abstract method for the volume
    
    /**
     * Abstract method for computing the surface area.
     * @return a double of the surface area
     */
    public abstract double computeArea() ;  //abstract method for the surface area
    
    /**
     * Method that computes the midpoint distance.
     * @return the total distance as a double
     */
    public double midpointDistance() {  //computes the distance from the origin
        return Math.sqrt(Math.pow(midPoint.getX(), 2)   //squares the distance of each coordinate and sums them
                        + Math.pow(midPoint.getY(), 2)  //total distance is the square root of the sum
                        + Math.pow(midPoint.getZ(), 2));
    }
    
    /**
     * Compares the objects by volume.
     * @param otherObject the object that is being compared with
     * @return a possibility of three integers based on the result of the comparison
     */
    @Override
    public int compareTo(Object otherObject) {  //comparable compare 
        Shape3D other = (Shape3D) otherObject;  //other becomes a new object of the spahe3D class
        
        if(this.computeVolume() < other.computeVolume()) {  //if volume of 1 comes before the other
            return -1;
        }
        
        if(this.computeVolume() == other.computeVolume()) { //if they are equal
            return 0;
        }
        
        else{
            return 1;
        }
    }
   
}   
