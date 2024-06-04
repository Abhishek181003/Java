import java.util.*;
class Gcd {
    public static int hcf(int a,int b){
       for(int i=Math.min(a,b); i>=1; i--)
       if(a%i == 0 && b%i ==0) return i;
       return 1; // it doesn't matter
       // T.C. O(min(a,b)) which is very bad
    }
    public static int gcd(int a, int b){
        if (b%a==0) return a;
        return gcd(b%a,a);
        // T.C. O(log n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the a : ");
        int a = sc.nextInt();
        System.out.println("Enter the b : ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        
    }
}
