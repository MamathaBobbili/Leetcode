class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
		
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
          {
        	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
          }
        for(int i: map.keySet())
        {
        	if(k>0)
        	{
        		int sum=i+k;
        		if(map.containsKey(sum))
        			count++;
        	}
        	else if (k==0)
        	{
        		if(map.get(i)>1)
        			count++;
        	}
        }
        return count;
    }
}