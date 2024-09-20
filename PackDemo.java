import MyMath.Trig;
import MyMath.Arithmetic;
import MyMath.Stat;

public class PackDemo 
{
    public static void main(String[] args)
     {
        Trig trig = new Trig(45); 
        System.out.println("Sine: " + trig.sine());
        System.out.println("Cosine: " + trig.cosine());
        System.out.println("Tangent: " + trig.tangent());
        System.out.println("Secant: " + trig.secant());
        System.out.println("Cosecant: " + trig.cosecant());
        System.out.println("Cotangent: " + trig.cotangent());
        
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition: " + arithmetic.add(10.5f, 5.5f));
        System.out.println("Subtraction: " + arithmetic.subtract(10.5f, 5.5f));
        System.out.println("Multiplication: " + arithmetic.multiply(10.5f, 5.5f));
        System.out.println("Division: " + arithmetic.divide(10.5f, 5.5f));
        
        float[] data = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        Stat stat = new Stat(data);
        System.out.println("Minimum: " + stat.min());
        System.out.println("Maximum: " + stat.max());
        System.out.println("Count: " + stat.count());
        System.out.println("Sum: " + stat.sum());
        System.out.println("Average: " + stat.average());
    }
}
