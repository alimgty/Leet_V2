class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0){
                    push(nums,i,even);
                    even++;
                }
                

            }return nums;
    }
            public void push(int nums[],int a,int b){
                int temp=nums[a];
                nums [a]=nums [b];
                nums [b]=temp;

            }
        
}
