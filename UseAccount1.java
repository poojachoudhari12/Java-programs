import javax.swing.*;
import java.util.*;
class Account1 {    //only one class can be public
    int no;
    String nm;
    int bal;
    Account1()
    {
        no=bal=0;
        nm=new String();
    }

    public String toString() //this method is used to  represent the Account detail in string formate
    {
        String a="\nA/c No:"+no+"\nName:"+nm+"\nBalance:"+bal;
        return a;
    }

    void display()//its purpose is to display informaton in message dialog box,When this method is called on an instance of the Account1 class, it creates a message dialog to display the account information.
    {   //JOptionPane.showMessageDialog(): This is a method provided by the Swing library in Java. It creates a dialog box to display a message or information.
    JOptionPane.showMessageDialog(null,toString());//null indicates that the dialog should be displayed in the center of the screen.
    }//toString() is the message to be displayed in the dialog. Since toString() is called without specifying an object, it implicitly refers to the toString() method of the current Account1 object.
    
    void setData(int n)
    {
        no=n;
        try{
            nm=JOptionPane.showInputDialog(null,"\nName:");
            bal=Integer.parseInt(JOptionPane.showInputDialog(null,"Balance:"));
        }
        catch(Exception e) {}
    }

    int getNo(){
        return no;
    }

    int getBal(){
        return bal;
    }

    String getNm(){
        return nm;
    }
}

 public class UseAccount1      //the class which contain main that class name shouid be assigned to the class while saving i.e UseAccount1.java
    {
        public static void main(String[]args)
        {
            int no=0;                                           //here linklist is named as ls ,ls is now list
            LinkedList<Account1>ls=new LinkedList<Account1>();  //implementation of linkeList to store object of class 
            while(true)                                        //here linkList ls which used to store Account object
            {
                try
                {
                    no=Integer.parseInt(JOptionPane.showInputDialog(null,"Account No:"));
                }
                catch(Exception e){continue;}
                if(no==0)
                break;
                Account1 a=new Account1();
                a.setData(no);
                ls.add(a);
            }
                int i=0,n=ls.size();
                while(i<n)
                {
                    Account1 b=ls.get(i);
                    b.display();
                    i++;
                }

            
        }

    }
/*toString() Method:
Inside the JOptionPane.showMessageDialog() method, toString() is called to get the string representation of the Account1 object.
In Java, every class inherits the toString() method from the Object class. The toString() method returns a string that represents the object.
In the Account1 class, the toString() method is overridden to provide a custom string representation of the account, including the account number (no), name (nm), and balance (bal).
Message Dialog Display:
The message dialog created by JOptionPane.showMessageDialog() displays the string returned by the toString() method.
This dialog will show the account information, including the account number, name, and balance, in a nicely formatted way.

The setData(int n) method in the Account1 class sets the account number (no), prompts the user to enter the name and balance using message dialogs, and sets the nm (name) and bal (balance) accordingly.

Here's how the try-catch block works within this method:

Setting the Account Number:
The parameter n is passed to the method to set the account number (no) of the Account1 object.
no = n;: Assigns the value of n to the no instance variable.
User Input for Name and Balance:
Inside the try block, the program prompts the user to enter the name and balance using message dialogs provided by JOptionPane.showInputDialog().
nm = JOptionPane.showInputDialog(null, "\nName:");: Displays an input dialog box asking the user to enter the name. The entered value is stored in the nm instance variable.
bal = Integer.parseInt(JOptionPane.showInputDialog(null, "Balance:"));: Displays an input dialog box asking the user to enter the balance. The entered value is parsed as an integer using Integer.parseInt() and then stored in the bal instance variable.
Handling Exceptions:
The try block is followed by a catch block that catches any exceptions that might occur during the execution of the code inside the try block.
In this case, the catch block catches any Exception type of exception, denoted by Exception e.
Inside the catch block, there is no code provided. This means that if any exception occurs during the execution of the code inside the try block, it will be caught, but no specific action is taken in response.
Purpose of the Catch Block:
In this specific scenario, the catch block is empty, which means that if any exception occurs (for example, if the user closes the input dialog without entering any value), the program will simply ignore the exception and continue execution.
However, it's generally good practice to provide some error handling or at least log the exception for debugging purposes. In a real-world application, you would typically handle the exception appropriately, such as displaying an error message to the user or logging the error for later analysis.
In summary, the try-catch block in the setData() method is used to handle any exceptions that might occur while prompting the user for input using message dialogs. If an exception occurs, it is caught by the catch block, but no specific action is taken in response in this particular implementation.



*/



