import java.util.*;
class ArrayListAll {
    public static void main(String[] args) {
        // Intiallization 
        int size = 5;
        ArrayList<Integer> arr = new ArrayList<>(size); // Method 1
        // List<Integer> arr = new ArrayList<>(size); // Method 2\+
        
        // Add element in List 
        arr.add(1); // this will append value at the end
        arr.add(1,2); // (index , value) this will add value at the index
        arr.add(3);
        arr.add(3,4);
        // arr.add(5,5); // this will give error because last add ele was at idx 3 so it required idx 4 but we given idx 5 
        System.out.println(arr);
        
        // PRINT
        System.out.println(arr); // Method 1
        
        for(int i=0; i<arr.size(); i++){ // .size() will give length of array
            System.out.print(arr.get(i) + " "); // to get element we use get()
        }
        System.out.println();
        
        // MODIFY ELEMENT 
        
        arr.set(2,10); // This will change the value at given index (index , value)
        arr.set(3,56);
        System.out.println(arr);
        
        // REMOVE ELEMENT
        
        arr.remove(2); // This will delete the value at given index
        System.out.println(arr);
        
        // Inbuilt Array Sort method
        Collections.sort(arr); // this sort the array list
    }
}
