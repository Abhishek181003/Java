import java.util.*;
class HelloWorld {
   public static int[] previousGreaterElement(int[] a) {
        int n = a.length;
        Stack <Integer> st = new Stack<>();
        int ans[] = new int [n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && a[i]>=a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=a[st.peek()];
            }
            st.push(i);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {10,4,2,20,40,12,30};
        for(int ele:a){
        System.out.print(ele+" ");
        }
        System.out.println();
        int b[] = previousGreaterElement(a);
        for(int ele:b){
        System.out.print(ele+" ");
        }

        System.out.println();
        
    }
}
