import java.util.*;
class climbingStairs {
    public static int stairPath(int n){
        if(n<=2) return n;
        return stairPath(n-1) + stairPath(n-2);
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the stairs : ");
       int n = sc.nextInt();
       System.out.println("The number of ways of stari path is "+stairPath(n));
    }
}
