//implementation of single inheritance
import javax.swing.*;
import java.util.*;

class Number1
{
    int rno;
    Number1()
    {
        rno=0;

    }
    Number1(int a)
    {
        rno=a;
    }
    void setData(int a)
    {
        rno=a;
    }
    void setData()
    {
        try
        {
            rno=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll no:"));
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s="Roll no:"+rno;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
class Marks1 extends Number1
{
    int mrk;
    Marks1()
    {
       
        super();// Calls the superclass constructor
        rno=0;// Initializes rno inherited from Number1
        mrk=0; // Initializes mrk
    }
    
    Marks1(int a,int b)
    {
        super(a);// Calls the superclass constructor with argument a
        mrk=b;// Calls the superclass constructor with argument a
    }
    void setData(int a,int b)
    {
        setData(a);// Calls the setData method of Number1 to set rno
        mrk=b; // Sets the value of mrk
    }
    void setData()
    {
        super.setData(); // Calls the setData method of Number1 to set rno
        try
        {
            mrk=Integer.parseInt(JOptionPane.showInputDialog(null,"Marks:"));
        }
        catch(Exception e){}
    }
    public String toString()
    {
        String s=super.toString()+"\nMarks:"+mrk;
        return s;
    }
    void display()
    {
        JOptionPane.showMessageDialog(null,toString());
    }
}
public class SInh1
{
    public static void main(String[]args)
    {
        Number1 a=new Number1();
        a.setData();
        a.display();
        Marks1 b=new Marks1();
        b.setData();
        b.display();
        Number1 c=new Marks1();
        c.setData();
        c.display();
    }
}

/*
Inheritance in Java is a powerful concept that allows a new class (called a subclass) to inherit properties and behaviors (methods and variables) from an existing class (called a superclass). Think of it as a parent-child relationship.

Here's a simple breakdown:

Superclass (Parent Class):
The superclass is like a parent class that already exists. It contains common attributes and behaviors that can be shared among multiple classes.
It's often more generalized and abstract.
Example: If you have a class called Animal, it might have attributes like name, age, and behaviors like eat(), sleep(). This is your superclass.
Subclass (Child Class):
The subclass is like a child class that inherits from the superclass. It can access all the attributes and behaviors of its superclass and can also have its own unique attributes and behaviors.
It's often more specialized and specific.
Example: If you have a subclass called Dog that inherits from Animal, it will automatically have attributes like name, age, and behaviors like eat(), sleep() from the Animal class. Additionally, it can have its own attributes and behaviors like bark().
How Inheritance Works:
When you create a subclass, you use the extends keyword followed by the name of the superclass. This tells Java that you want your subclass to inherit from the superclass.
The subclass automatically gets all the attributes and behaviors of the superclass.
You can then add new attributes and behaviors or override existing ones in the subclass.
This allows you to create a hierarchy of classes, where each class inherits from the one above it, adding more specific features as you go down the hierarchy.
In simple terms, inheritance allows you to reuse code, organize your classes in a hierarchical manner, and create specialized versions of existing classes without having to duplicate code. It promotes code reusability and makes your code easier to maintain and understand */