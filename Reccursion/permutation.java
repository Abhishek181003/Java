import java.util.*;
class Permutation {
    public static void permutationPrint(String str,String ans){
        if(str.compareTo("")==0){
            System.out.println(ans);
            return;
        } 
      for(int j=0; j<str.length(); j++){
          char ch = str.charAt(j);
         sequence(str.substring(0,j)+str.substring(j+1),ans+ch);
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        permutationPrint(str,"");
    }
}
