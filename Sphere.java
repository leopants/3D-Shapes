package shapes3d;

/**
 * Class for making sphere objects that extends the Shape3D class.
 */
public class Sphere extends Shape3D {

    private int x;  //initializes the variables of the sphere
    private int y;
    private int z;
    private int radius;
    
    /**
     * Makes an object of a sphere.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     * @param r the radius of the sphere
     */
    Sphere(int x, int y, int z, int r) {    //creates a sphere with a midpoint created by the super and a radius
        super(x,y,z);
        this.radius = r;
    }
    
    /**
     * Method for getting the volume of a sphere object.
     * @return 
     */
    @Override
    public double computeVolume() { //computes volume of a sphere
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Method for getting the area of a sphere object.
     * @return the area as a double 
     */
    @Override
    public double computeArea() {   //computes surface area of a sphere
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Method for returning a sphere object.
     * @return a string representation of a sphere object
     */
    @Override
    public String toString() {  //returns the center and the radius of the sphere
        return "Sphere: Center at " + super.toString() + ", "
                + "radius of " + radius; 
    }
}
