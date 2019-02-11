package shapes3d;

/**
 * Class for making cylinder objects that extends the Shape3D class.
 */
public class Cylinder extends Shape3D {
   
    private int x;  //initializes the cylinder variables
    private int y;
    private int z;
    private int radius;
    private int height;
    
    /**
     * Creates an object of a cylinder.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     */
    Cylinder(int x, int y, int z, int r, int h) {   //constructor for making the midpoint and a radius and height
        super(x,y,z);
        this.radius = r;
        this.height = h;
        
    }
    
    /**
     * Method for getting the volume of a cylinder.
     * @return the volume as a double
     */
    @Override
    public double computeVolume() { //formula for computing volume of a cylinder
        return Math.PI * Math.pow(radius,2) * height ;
    }
    
    /**
     * Method for getting the surface area of a cylinder.
     * @return the surface area as a double
     */
    @Override
    public double computeArea() {   //computation of the surface area of a cylinder
        return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height) ;
    }
    
    /**
     * Method that returns a string representation of a cylinder
     * @return 
     */
    @Override
    public String toString() {  //returns the center which is the toString of the shape 3D class and radius and height 
        return "Cylinder: Center at " + super.toString() + ", "
                + "radius of " + radius + " and a height of " + height;
    }
}




