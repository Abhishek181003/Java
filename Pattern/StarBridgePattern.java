// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           *
import java.util.*;

class StarBridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the row ");
        int m =sc.nextInt();
        for(int i=1; i<=m; i++){
            if(i==1){
                for(int j=1; j<=m*2-1; j++) System.out.print("* ");
            }else {
                for(int j=m; j>=i; j--){
                    System.out.print("* ");
                }
            for(int j=1; j<=2*(i-1)-1; j++){
                  System.out.print("  "); 
                }
            for(int j=m; j>=i; j--){
                  System.out.print("* "); 
                }
            }
            System.out.println();
        }
        
    }
}
