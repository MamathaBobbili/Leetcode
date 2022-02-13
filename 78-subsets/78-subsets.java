class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<Integer>();
        getSubsets(0,nums,ans,res);
        return res;
    }
    
    public void getSubsets(int index,int[] nums,List<Integer> ans,List<List<Integer>> res)
    {
    	res.add(new ArrayList<Integer>(ans));//add each result
    	for(int i=index;i<nums.length;i++){ //iterate every index
       		ans.add(nums[i]);
	        getSubsets(i+1,nums,ans,res);
	        ans.remove(ans.size()-1);
    	}
        
    }
    /** Recursion Tree 
    
             []      1 2 3
                    /  |  \
              [1]1   [2]2  3[3] 
             /\        | 
       [1,2]2  3[1,3]  3[2,3] 
           /
           3[1,2,3]
          **/
}