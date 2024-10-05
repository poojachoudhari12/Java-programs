import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypkg.Util;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;

class Book implements Serializable, Comparable<Book>, Comparator<Book> {
    int bno;
    String bnm;
    int bprice;
    boolean bstate;

    Book() {
        bno = 0;
        bnm = new String();
        bprice = 0;
        bstate = true;
    }

    Book(int no, String nm, int price, boolean state) {
        bno = no;
        bnm = nm;
        bprice = price;
        bstate = state;
    }

    public String toString() {
        String s = "\nBook Data\nNo.:" + bno + "\nName:" + bnm + "\nPrice:" + bprice + "\nState:" + bstate;
        return s;
    }

    void display() {
        Util.display(toString());
    }

    public int compareTo(Book b) {
        return (bno - b.bno);
    }

    public int compare(Book a, Book b) {
        return (a.bnm).compareTo(b.bnm);
    }
}

class BAdd extends JDialog implements FocusListener, ActionListener {
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BAdd(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Add");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            t1.requestFocus();
            ;
            return;
        }
        b1.setEnabled(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            try {
                no = Integer.parseInt(t1.getText());
                nm = t2.getText();
                price = Integer.parseInt(t3.getText());
                obj = new Book(no, nm, price, true);
                ls.add(obj);
            } catch (Exception e2) {
                setVisible(false);
            }
        }
    }
}

class BMod extends JDialog implements FocusListener, ActionListener {
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BMod(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Modify");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no && obj.bstate == true)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            b1.setEnabled(true);
        } else {
            t1.requestFocus();
            return;
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            try {
                no = Integer.parseInt(t1.getText());
                nm = t2.getText();
                price = Integer.parseInt(t3.getText());
                nm = obj.bnm;
                price = obj.bprice;
            } catch (Exception e2) {
            }
            setVisible(false);
        }
    }
}

class BDel extends JDialog implements FocusListener, ActionListener {
    JPanel p1, p2;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2;
    LinkedList<Book> ls;
    int no, price;
    String nm;
    boolean state;
    Book obj;

    BDel(JFrame f, String t, LinkedList<Book> l, boolean state) {
        super(f, t, state);
        ls = l;
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(10);
        t1.addFocusListener(this);
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        add(p1, BorderLayout.CENTER);
        b1 = new JButton("Delete");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        b1.setEnabled(false);
    }

    public void focusLost(FocusEvent e) {
        try {
            no = Integer.parseInt(t1.getText());
        } catch (Exception e1) {
            t1.requestFocus();
            return;
        }
        int i = 0, n = ls.size();
        while (i < n) {
            obj = ls.get(i);
            if (obj.bno == no && obj.bstate == true)
                break;
            i++;
        }
        if (i != n) {
            t2.setText(obj.bnm);
            t3.setText("" + obj.bprice);
            b1.setEnabled(true);
        } else {
            t1.requestFocus();
            return;
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b2)
            setVisible(false);
        else {
            obj.bstate = false;
            setVisible(false);
        }
    }
}

class BDisplay extends JDialog implements ActionListener {
    int i, n;
    LinkedList<Book> ls;
    JButton b1, b2;
    Book[] barr = null;
    JTable jt;
    JScrollPane jsp;
    DefaultTableModel dtm;
    String[][] arr;
    String[] chead = { "No", "Name", "Price", " State" };

    BDisplay(JFrame f, String t, LinkedList<Book> ls, boolean state) {
        super(f, t, state);
        i = 0;
        this.ls = ls;
        barr = new Book[ls.size()];
        ls.toArray(barr);
        Arrays.sort(barr);
        b1 = new JButton("Print");
        b2 = new JButton("Back");
        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        
        dtm = new DefaultTableModel(arr, chead);
        jt = new JTable(dtm);
        jsp = new JScrollPane(jt);
        jsp.setBounds(20,20,350,280);
        p1.add(jsp);
        add(p1, BorderLayout.CENTER);
        i = 0;
        n = barr.length;
        while (i < n) {
            Book b = barr[i];
            dtm.insertRow(i, new String[] { "" + b.bno, b.bnm, "" + b.bprice, "" + b.bstate });
            i++;
        }
        JPanel p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b1)

        {
            try {
                jt.print();
            } catch (Exception e1) {
            }
        } else
            setVisible(false);
    }
}

class BDisplayName extends JDialog implements ActionListener {
    int i, n;
    LinkedList<Book> ls;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;
    Book[] barr = null;

    BDisplayName(JFrame f, String t, LinkedList<Book> ls, boolean state) {
        super(f, t, state);
        i = 0;
        this.ls = ls;
        barr = new Book[ls.size()];
        ls.toArray(barr);
        Arrays.sort(barr, new Book());
        l1 = new JLabel("Book No.");
        l2 = new JLabel("Name");
        l3 = new JLabel("Price");
        l4 = new JLabel("State");
        t1 = new JTextField(10);
        t2 = new JTextField(40);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        b1 = new JButton("|<");
        b2 = new JButton("<<");
        b3 = new JButton(">>");
        b4 = new JButton(">|");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2, 5, 5));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        JPanel p2 = new JPanel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        n = barr.length;
        if (b == b1)
            i = 0;
        if (b == b4)
            i = n - 1;
        if (b == b2) {
            if (--i < 0)
                i = 0;
        }
        if (b == b3) {
            if (++i >= n)
                i = n - 1;
        }
        Book obj = barr[i];
        t1.setText("" + obj.bno);
        t2.setText(obj.bnm);
        t3.setText("" + obj.bprice);
        if (obj.bstate == false)
            t4.setForeground(Color.RED);
        else
            t4.setForeground(Color.BLACK);
        t4.setText("" + obj.bstate);
    }
}

public class JFrm16 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1, m2, m3, m4;
    JMenuItem m11, m12, m13;
    JMenuItem m21, m22;
    JMenuItem m31, m32;
    JMenuItem m41, m42;
    BAdd ba;
    BMod bm;
    BDel bd;
    BDisplay bdisp;
    BDisplayName bdispNm;
    LinkedList<Book> ls;

    JFrm16() {
        super("JMenu");
        mb = new JMenuBar();
        m1 = new JMenu("Book");
        m11 = new JMenuItem("Add");
        m12 = new JMenuItem("Modify");
        m13 = new JMenuItem("Delete");
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        mb.add(m1);
        m2 = new JMenu("Record");
        m21 = new JMenuItem("Display Number");
        m22 = new JMenuItem("Display Name");
        m21.addActionListener(this);
        m22.addActionListener(this);
        m2.add(m21);
        m2.add(m22);
        mb.add(m2);
        m3 = new JMenu("File");
        m31 = new JMenuItem("Open");
        m32 = new JMenuItem("Save");
        m31.addActionListener(this);
        m32.addActionListener(this);
        m3.add(m31);
        m3.add(m32);
        mb.add(m3);
        m4 = new JMenu("Exit");
        m41 = new JMenuItem("No");
        m42 = new JMenuItem("Yes");
        m42.addActionListener(this);
        m4.add(m41);
        m4.add(m42);
        mb.add(m4);
        setJMenuBar(mb);
        setSize(400, 400);
        ls = new LinkedList<Book>();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem a = (JMenuItem) e.getSource();
        if (a == m42)
            System.exit(0);
        if (a == m11)
            ba = new BAdd((JFrame) null, "Add", ls, true);
        if (a == m12)
            bm = new BMod((JFrame) null, "Modify", ls, true);
        if (a == m13)
            bd = new BDel((JFrame) null, "Delete", ls, true);
        if (a == m21)
            bdisp = new BDisplay((JFrame) null, "Display Number", ls, true);
        if (a == m22)
            bdispNm = new BDisplayName((JFrame) null, "Display Name", ls, true);
        if (a == m31)
            open();
        if (a == m32)
            save();
    }

    void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("book.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }

    void open() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("book.dat");
            ois = new ObjectInputStream(fis);
            ls = (LinkedList<Book>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        JFrm16 a = new JFrm16();
    }
}
