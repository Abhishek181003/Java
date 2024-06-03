import java.util.*;
class powerReccursion {
    // Method 1
    
    public static int pow(int a , int b){
        if(b==0) return 1;
        return a * pow(a,b-1);
        // T.C O(b)
        // Formula 
        // a^b = a^b * a^b-1 * ...... * a^1 * a^0 if(b is even)
    } 
    // Method 2
    
    public static int pow2(int a , int b){
        if(b==0) return 1;
        int ans = pow2(a,b/2);
        if (b%2 == 0 ) return ans * ans;
        else return ans * ans * a;
        // T.C O(log b)
        // Formula 
        // a^b = a^b/2 * a^b/2 if(b is even)
        // a^b = a^b/2 * a^b/2 * a if(b is odd)
    } 
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the base : ");
       int a = sc.nextInt();
       System.out.println("Enter the power : ");
       int b = sc.nextInt();
       System.out.println(a+"^"+b+" = "+pow(a,b));
       System.out.println(a+"^"+b+" = "+pow2(a,b));
    }
}
