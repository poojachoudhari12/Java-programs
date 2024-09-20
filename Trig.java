/*Create a package named MyMath.
 Create a class named Trig having data member representing angle in degree.
o Define method to get sine of angle given in degrees.
o Define method to get cosine of angle given in degrees.
o Define method to get tangent of angle given in degrees.
o Define method to get secant of angle given in degrees.
o Define method to get cosecant of angle given in degrees.
o Define method to get cotangent of angle given in degrees.
*/

import java.util.*;
package MyMath;

public class Trig {
    private double angleInDegrees;

    public Trig(double angleInDegrees)
    {
        this.angleInDegrees=angleIndegrees;
    }
   
    private double toRadians() 
    {
        return Math.toRadians(angleInDegrees);
    }

    public double sine()
    {
        return Math.sin(toRadians());
    }
     
    public double cosine() {
        return Math.cos(toRadians());
    }

    public double tangent()
    {
        return Math.tan(toRadians());
    }
    
    public double secant()
    {
        return 1/cosine();
    }

    public double cosecant()
    {
        return 1/sine();
    }
    
    public double cotangent()
    {
        return 1/tangent();
    }
   
}

