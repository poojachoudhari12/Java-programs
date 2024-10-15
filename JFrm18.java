// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JFrm18 extends JFrame {
   BAdd ba;
   BMod bm;
   BDel bd;
   BDisplay bdisp;
   BDisplayName bdispNm;
   LinkedList<Book> ls;
   JTree tree;

   JFrm18() {
      super("Book");
      DefaultMutableTreeNode var1 = new DefaultMutableTreeNode("Book");
      DefaultMutableTreeNode var2 = new DefaultMutableTreeNode("Record");
      var1.add(var2);
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode("Add");
      var2.add(var3);
      DefaultMutableTreeNode var4 = new DefaultMutableTreeNode("Mod");
      var2.add(var4);
      DefaultMutableTreeNode var5 = new DefaultMutableTreeNode("Del");
      var2.add(var5);
      DefaultMutableTreeNode var6 = new DefaultMutableTreeNode("Display");
      var1.add(var6);
      DefaultMutableTreeNode var7 = new DefaultMutableTreeNode("Book No");
      var6.add(var7);
      DefaultMutableTreeNode var8 = new DefaultMutableTreeNode("Book Name");
      var6.add(var8);
      DefaultMutableTreeNode var9 = new DefaultMutableTreeNode("File");
      var1.add(var9);
      DefaultMutableTreeNode var10 = new DefaultMutableTreeNode("Open");
      var9.add(var10);
      DefaultMutableTreeNode var11 = new DefaultMutableTreeNode("Save");
      var9.add(var11);
      DefaultMutableTreeNode var12 = new DefaultMutableTreeNode("Exit");
      var1.add(var12);
      DefaultMutableTreeNode var13 = new DefaultMutableTreeNode("Yes");
      var12.add(var13);
      DefaultMutableTreeNode var14 = new DefaultMutableTreeNode("No");
      var12.add(var14);
      this.tree = new JTree(var1);
      this.tree.addTreeSelectionListener(new JFrm18$1(this, var13, var3, var4, var5, var7, var8, var10, var11));
      JScrollPane var15 = new JScrollPane(this.tree);
      this.add(var15);
      this.setSize(400, 400);
      this.ls = new LinkedList();
      this.setVisible(true);
   }

   void save() {
      FileOutputStream var1 = null;
      ObjectOutputStream var2 = null;

      try {
         var1 = new FileOutputStream("book.dat");
         var2 = new ObjectOutputStream(var1);
         var2.writeObject(this.ls);
         var2.close();
         var1.close();
      } catch (Exception var4) {
      }

   }

   void open() {
      FileInputStream var1 = null;
      ObjectInputStream var2 = null;

      try {
         var1 = new FileInputStream("book.dat");
         var2 = new ObjectInputStream(var1);
         this.ls = (LinkedList)var2.readObject();
         var2.close();
         var1.close();
      } catch (Exception var4) {
      }

   }

   public static void main(String[] var0) {
      new JFrm18();
   }
}
