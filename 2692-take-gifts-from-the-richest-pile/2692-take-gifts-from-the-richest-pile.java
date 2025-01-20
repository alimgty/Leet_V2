class Solution {
    public long pickGifts(int[] gifts, int k) {
       PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->b-a);
       for(int i=0;i<gifts.length;i++){
        pq.add(gifts[i]);
       }
       while(k>0){
        int largest=pq.poll();
        int reduced =(int)Math.floor(Math.sqrt(largest));
        pq.add(reduced);
        k--;
       }
       long total=0;
       while(!pq.isEmpty()){
         total+=pq.poll();
       }
       return total;
    }
}