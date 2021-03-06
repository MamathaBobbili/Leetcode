class Solution {   
    
    /** Using Hashset method **/
    public int singleNumber(int[] nums) { 
    Set<Integer> s = new HashSet<Integer>();
	    for (int i: nums){
	    	if(!s.add(i)){
	    		s.remove(i);
	    	}
	    }
	    return s.iterator().next();
    }
    
    /** Using Bit Manipulation XOR method 
    public int singleNumber(int[] nums) { 
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++)
            ans ^= nums[i];

        return ans;
    }**/
    
    /** Using two pointers
    
    i != j --> j++
    i == j --> a[i]=Max,a[j]=Max,curr=Max,i++;j++
    
    public int singleNumber(int[] nums) {       
        
        if(nums.length % 2 ==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		int curr=Integer.MAX_VALUE;
		int i=0,j=0;
		
		for(i=0,j=i+1;i<nums.length;)
		{
			if(nums[i]==Integer.MAX_VALUE){
				i++;
                if(j==i+1)
				j++;
			}
			if(curr==Integer.MAX_VALUE){
				curr = nums[i];
				j=i+1;
			}
			if(j>=nums.length && curr!=Integer.MAX_VALUE)
				break;
			if(nums[i]!=nums[j])
				j++;
			else if(nums[i]==nums[j])
			{
				nums[i]=Integer.MAX_VALUE;
				nums[j]=Integer.MAX_VALUE;
				curr=Integer.MAX_VALUE;
				i++;
				j++;
			}
			
		}	
		return curr;        
    }**/
}