import java.util.*;
class subSet {
   static ArrayList<String> ansList = new ArrayList<>(); // This is Global array list
   public static void printSubset(int i,String string , String ans){
      if(i==string.length()){
          System.out.println(ans); // if we want to print all subsets 
        //   ansList.add(ans); // If we want to store all subsets in array list
          return;
      }
      char currChar = string.charAt(i);
      printSubset(i+1,string,ans+currChar);
      printSubset(i+1,string,ans);
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       printSubset(0,str,"");
       System.out.println(ansList);
       System.out.println("End");
    }
}
