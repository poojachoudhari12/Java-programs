// Source code is decompiled from a .class file using FernFlower decompiler.
class Thrd5 extends Thread {
   long cnt;
   volatile boolean flg;

   Thrd5(String var1, int var2) {
      super(var1);
      this.setPriority(var2);
      this.cnt = 0L;
   }

   void tStrart() {
      this.flg = true;
      this.start();
   }

   public void run() {
      while(this.flg) {
         ++this.cnt;
      }

   }

   void tStop() {
      this.flg = false;
   }
}
