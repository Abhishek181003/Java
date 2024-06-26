import java.util.*;
class Upper_Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Fill the array ");
        for(int i=0; i<size; i++) arr[i]=sc.nextInt();
        System.out.println("Choose the number to get is lower Bound ");
        int target = sc.nextInt();
        // int arr [] = {10,23,46,46,58,69,72};
        // int target = 80;
        int n=arr.length;
        int upperBound = n;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                upperBound = Math.min(upperBound,mid);
                hi= mid-1;
            }
            else lo = mid +1;
        }
        System.out.println("Upper bound is at "+upperBound);
    }
}
