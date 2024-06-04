import java.util.*;
class Pattern {
   public static void pip(int n){
       if(n==0) return;
       System.out.print(n+" "); // pre
       pip(n-1);
       System.out.print(n+" "); // in
       pip(n-1);
       System.out.print(n+" "); // post
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       pip(1);
       System.out.println();
       pip(2);
       System.out.println();
       pip(3);
       System.out.println();
       pip(4);
       System.out.println();
    }
}
