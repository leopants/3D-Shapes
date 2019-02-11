package shapes3d;

/**
 * Class for creating a midpoint in 3D space.
 */
public class Point3D {

    private int x;  //initializes all three axes
    private int y;
    private int z;
    
    /**
     * Method that creates a midpoint.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     */
    Point3D(int x, int y, int z) {  //point3D constructor for making an object with a midpoint
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    /**
     * Method that returns the coordinates of the midpoint.
     * @return the coordinates as a string
     */
    public String toString() {  //returns the coordinates of the midpoint
        return "(" + x + "," + y + "," + z + ")";
    }
    
    /**
     * Method that gets the x coordinate.
     * @return the x coordinate
     */
    public int getX() { //returns the x axis
        return x;
    }
    
    /**
     * Method that gets the y coordinate.
     * @return the y coordinate
     */
    public int getY() { //returns the y axis
        return y;
    }
    
    /**
     * Method that gets the z coordinate.
     * @return the z coordinate
     */
    public int getZ() { //returns the z axis
        return z;
    }

}
