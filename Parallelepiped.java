package shapes3d;

/**
 * Class for making parallelepiped objects that extends the Shape3D class.
 */
public class Parallelepiped extends Shape3D {

    private int x;  //initializes all instance variables 
    private int y;
    private int z;
    private int length;
    private int width;
    private int height;

    /**
     * Creates an object of a parallelepiped.
     * @param x the x coordinate of the midpoint
     * @param y the y coordinate of the midpoint
     * @param z the z coordinate of the midpoint
     * @param length the length of the parallelepiped
     * @param width the width of the parallelepiped
     * @param height the height of the parallelepiped
     */
    Parallelepiped(int x, int y, int z, int length, int width, int height) {    //class constructor that makes a midpoint with the super class 
        super(x,y,z);
        this.length = length;   //shape has a length, width and height
        this.width = width;
        this.height = height;
    }

    /**
     * Method that gets the volume of a parallelepiped.
     * @return the volume as a double
     */
    @Override
    public double computeVolume() { //volume computation for the parallelepiped 
        return length * width * height;
    }

    /**
     * Method that gets the surface area of parallelepiped.
     * @return the surface area as a double
     */
    @Override
    public double computeArea() {   //area computation for a parallelepiped
        return 2 * (width * length + width * height + length * height) ;
    }

    /**
     * Method that returns a parallelepiped object as a string
     * @return variables of the parallelepiped object
     */
    @Override
    public String toString() {  //a to string method for this shape
        return "Parallelepiped: Center at " + super.toString() + ", "
                + "length of " + length + ", width of " + width + 
                " and height of " + height;
    }

}


