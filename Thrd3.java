// Source code is decompiled from a .class file using FernFlower decompiler.
class Thrd3 extends Thread {
   int cnt;
   String tnm;

   Thrd3(String var1, int var2) {
      super(var1);
      this.cnt = var2;
      this.tnm = var1;
   }

   public void run() {
      for(int var1 = 1; var1 <= this.cnt; ++var1) {
         System.out.println(this.tnm + " " + var1);

         try {
            Thread.sleep(1000L);
         } catch (Exception var3) {
         }
      }

   }
}
