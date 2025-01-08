class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr=new int [nums2.length];
        nextElement(arr,nums2);
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],arr[i]);
            }
            int narr[]=new int[nums1.length];
            for(int i=0;i<narr.length;i++){
                narr[i]=map.get(nums1[i]);
            }
        return narr;
        
        
        
    }

    public void nextElement(int [] ans,int []nums){
        Stack<Integer> st=new Stack<>();

        int n=nums.length;
        st.push(nums[n-1]);
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&& nums[i]>=st.peek()){
                st.pop();
            }

            if(st.size()==0)
            {
                ans[i]=-1;
            }
            else{
                   ans[i]=st.peek(); 
            }
            st.push(nums[i]);
        }
    }
}