class Solution {
    public int maxProfit(int[] prices) {
        
        int minStock =Integer.MAX_VALUE;
        int maxProfit =0;
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<minStock)
            {
                minStock=prices[i];
            }   
            else{
            	
                int diff =prices[i]-minStock;
                if(diff > 0 && diff>maxProfit){
                        maxProfit=diff;
                }
            }
            
        }
            
        return maxProfit;
        
    }
}