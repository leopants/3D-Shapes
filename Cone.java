package shapes3d;

/**
 * Class for making cone objects that extends the Shape3D class.
 */
public class Cone extends Shape3D {

    private int x;  //initializes the cone instance variables
    private int y;
    private int z;
    private int radius;
    private int height;
    
    /**
     * Creates an object of a cone.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     * @param r the radius of the cone
     * @param h the height of the cone
     */
    Cone(int x, int y, int z, int r, int h) {   //constructor that makes the midpoint and radius and height of an object
        super(x,y,z);
        this.radius = r;
        this.height = h;
    }

    /**
     * Method for getting the volume of a cone.
     * @return the volume as a double
     */
    @Override
    public double computeVolume() { //computation for the volume of a cone
        return (Math.PI * Math.pow(radius,2) * height) / 3 ;
    }

    /**
     * Method for getting the surface area of a cone.
     * @return the surface area as a double
     */
    @Override
    public double computeArea() {   //computation for the surface area of a cone
        double slant = Math.sqrt(radius * radius + height * height) ;
        double inner = radius + slant;
        return Math.PI * radius * inner ;
    }
    
    /**
     * Method that returns the string representation of a cone.
     * @return a cone object as a string
     */
    @Override
    public String toString() {  //returns the center and radius and height
        return "Cone: Center at " + super.toString() + ", "
                + "radius of " + radius + " and a height of " + height;
    }
}


