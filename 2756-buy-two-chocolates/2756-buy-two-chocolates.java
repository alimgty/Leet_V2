class Solution {
    public int buyChoco(int[] prices, int money) {
        // int m1=0;
        // int m2=0;
        

        Arrays.sort(prices);
        int c=prices[0]+prices[1];
        if(c>money){
            return money;
        }
        else{
            return money-c;
        }
    }
}