import java.util.Scanner;

public class Binary_Search_Code {
    public static int Binaryalgo(int a[] , int target){
        int start = 0;
        int end = a.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(a[mid]==target) return 1;
            if(a[mid]>target) end=mid-1;
            else start =mid+1;
        

        }
        return 0;
    }
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the number : ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        if(Binaryalgo(array, target) ==1){
            System.out.println("Yes, Number is found");
        }else{
            System.out.println("No, the number isNot found");
        }
        
    }
    
}
