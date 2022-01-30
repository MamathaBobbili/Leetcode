class Solution {
    public int findDuplicate(int[] nums) {
        
        /** HashMap approach
       
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int n :nums){
			if(map.containsKey(n))
			{
				return n;
			}
			map.put(n, 1);
		}		
		return 0;*/
        
        /**   Array Visited approach  
        
		int[] a = new int[nums.length];
		Arrays.fill(a,0);
		for(int n :nums){
			if(a[n]==0)
				a[n]=1;
			else
				return n;
		}
        return 0;*/
        
        /** Optimized solution - Linkedlist Cycle detection **/
        int s=nums[0];
		int f=nums[0];
		do{
			s=nums[s];
			f=nums[nums[f]];
		}while(s!=f);
		f=nums[0];
		while(s !=f){
			s=nums[s];
			f=nums[f];
		}
		return s;
		
    }
}