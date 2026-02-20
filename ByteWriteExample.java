// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteExample {
   public ByteWriteExample() {
   }

   public static void main(String[] var0) {
      try {
         FileOutputStream var1 = new FileOutputStream("bytefile.txt");
         String var2 = "Hello Aryan!";
         var1.write(var2.getBytes());
         var1.close();
         System.out.println("Data written successfully.");
      } catch (IOException var3) {
         System.out.println(var3);
      }

   }
}