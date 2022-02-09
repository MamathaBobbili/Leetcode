class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
		
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) //maintain frequency of each value
          {
        	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
          }
        for(int i: map.keySet())
        {
        	if(k>0)
        	{
                /* add the k value to eachkey and check result exist in the map*/
        		int sum=i+k;        
        		if(map.containsKey(sum))
        			count++;
        	}
        	else if (k==0)
        	{
                /* check eachkey whose frequency greaterthan 1*/
        		if(map.get(i)>1)
        			count++;
        	}
        }
        return count;
        
       /*
       Below approach is failing in because keys and values are getting duplicated
       for(int i=0;i<nums.length;i++)
       {
           for(int j=i+1;j<nums.length;j++)
           {
               if(Math.abs(nums[i]-nums[j])==k)
               {
                   System.out.println(nums[j]+"---"+nums[i]);
                   if(map.containsKey(nums[i])){
                   	if(map.get(nums[i])==nums[j]){
                   		continue;
                   	}
                   	map.put(nums[j],nums[i]);
                   }
                   else{
                   	map.put(nums[j],nums[i]);

                   }
               }
           }
       }
        System.out.println(map.toString());
        return map.size();
        */
    }
}