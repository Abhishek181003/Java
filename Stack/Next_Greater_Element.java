import java.util.*;
class HelloWorld {
    public static int[] nseBackward(int a[]){
        // This is backward approach
        int res[] = new int[a.length];
        Stack <Integer> st = new Stack<>();
        for(int i=res.length-1; i>=0; i--){
            while(st.size()!=0 && st.peek()<a[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }else res[i]=st.peek();
            st.push(a[i]);
        }
        return res;
    }
    public static int[] nse(int a[]){
        // This is forward approach
        int res[] = new int[a.length];
        Stack <Integer> st = new Stack<>();
        for(int i=0; i<res.length; i++){
            if(st.size()==0){
                res[i]=-1;
                st.push(i);
            }else{
                while(st.size()!=0 && a[st.peek()]<a[i]){
                    res[st.peek()]=a[i];
                    st.pop();
                }
                res[i]=-1;
                st.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Code for Next Greater Element :");
        int a[] = {2,7,4,3,5};
        int b[] = nseBackward(a);
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
