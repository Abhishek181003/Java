//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 
import java.util.*;
class PyramidPalindromePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the row ");
        int m =sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=m; j>i; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+ " "); 
            }
            if(i>1){
                for(int j = i-1; j>=1; j--){
                 System.out.print(j + " "); 
                    
                }
            }
        System.out.println();
        }
    }
}
