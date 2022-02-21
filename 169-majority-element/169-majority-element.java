class Solution {
    public int majorityElement(int[] nums) {
        
       Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(map.containsKey(nums[i]))
	                map.put(nums[i],(map.getOrDefault(nums[i],0))+1);
	            else
	                map.put(nums[i],1);
	        }
	        int val=0,max=0;
	        for(Map.Entry<Integer,Integer> m: map.entrySet())
	        {
//	        	System.out.println(m.getKey());
//	        	System.out.println(m.getValue());
	        	if(m.getValue() >val){
	        		max=m.getKey();
	        		val=m.getValue();
	        	}
	        }
	        return max;
        
    }
}