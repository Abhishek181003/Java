class Solution {
  public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack <Integer> st = new Stack<>();
        int idx = 0; // to iterate over popped array
        for(int i=0; i<n; i++){ // to iterate over pushed array
            st.push(pushed[i]);
            if(pushed[i] == popped[idx]){
                while(!st.isEmpty() && popped[idx]==st.peek()){
                    st.pop();
                    idx++;
                }
            }
        }
        return st.isEmpty();
    }
}
