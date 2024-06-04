import java.util.*;
class sequencePattern {
    public static void sequence(int i ,int n , int k,String ans){
        if(i>k){
            System.out.println(ans);
            return;
        } 
      for(int j=i; j<=n; j++){
        if(ans.length()>0){
            if(j>((int)(ans.charAt(ans.length()-1))-48))
                sequence(i+1,n,k,ans+j);
        }else 
            sequence(i+1,n,k,ans+j);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        System.out.println("The increasing Sequence of length K is : ");
        sequence(1,n,k,"");
    }
}
