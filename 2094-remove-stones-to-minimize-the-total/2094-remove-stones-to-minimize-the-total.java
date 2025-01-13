class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int stone:piles){
            pq.add(stone);
        }
        for(int i=0;i<k;i++){
            int x=pq.poll();
            pq.add((x+1)/2);
            
        }
        int ans=0;
        for(int i:pq){
            ans=ans+i;
        }
        return ans;
        
    }
}