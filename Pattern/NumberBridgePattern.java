// 1 2 3 4 5 6 7 
// 1 2 3   5 6 7 
// 1 2       6 7 
// 1           7 
import java.util.*;

class NumberBridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the row : ");
        int m =sc.nextInt();
        for(int i=1; i<=m; i++){
            if(i==1){
                for(int j=1; j<=m*2-1; j++) System.out.print(j + " ");
            }else {
                int t=1;
                for(int j=m; j>=i; j--){
                    System.out.print(t+" ");
                    t++;
                }
            for(int j=1; j<=2*(i-1)-1; j++){
                  System.out.print("  "); 
                  t++;
                }
            for(int j=m; j>=i; j--){
                  System.out.print(t+" "); 
                  t++;
                }
            }
            System.out.println();
        }
        
    }
}
