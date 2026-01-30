// import java.util.Scanner;
// class static1{
//     static int n;
//     int n;
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         static1 m=new static1();
//         int n;
//         m.x = sc.nextInt();
//         n = sc.nextInt();
//         System.out.println(n);
//         System.out.println(m.x);
//     }
// }
import java.util.Scanner;

class Static_1 {
   int n;


   public static void main(String[] var0) {
      Scanner s = new Scanner(System.in);
      Static_1 m = new Static_1();
      m.n = s.nextInt();
      System.out.println(m.n);
   }
}