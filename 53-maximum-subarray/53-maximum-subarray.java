class Solution {
   public int maxSubArray(int[] nums) {
    	
    	/** Kadane's Algorithm - Traverse through array if sum<0 ,
    	    make sum as 0 because we 
    	    dont want to carry negative **/
    	int max=nums[0];
    	int sum=0;
       
	   	for(int i=0;i<nums.length;i++){
    		sum=sum+nums[i];
    		if(sum>max)
    			max=sum;
    		if(sum< 0)
    			sum=0;
    	}
    	
    	
    	/**     		
    	for(int i=0;i<nums.length;i++){
    		
    		for(int j=0;j<nums.length;j++)
    		{
    			int sum=0;
    			for(int k=i;k<=j;k++)
    			{
    				sum=sum+nums[k];
    				if(sum>max)
    					max=sum;
    			}
    		}
    	} */
    		
    	return max;
    }
}