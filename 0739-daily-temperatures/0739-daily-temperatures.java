import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temps) {
       
       int [] temp=new int[temps.length];
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<temps.length;i++){
        while(!st.isEmpty() && temps[st.peek()] <temps[i]){
            int k=st.pop();
            temp[k]=i-k;
        }
        st.push(i);
       }
       return temp;
    }
}