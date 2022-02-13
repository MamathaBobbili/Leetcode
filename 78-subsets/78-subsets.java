class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<Integer>();
        getSubsets(0,nums,ans,res);
        //System.out.println(res.toString());
        return res;
    }
    
    public void getSubsets(int index,int[] nums,List<Integer> ans,List<List<Integer>> res)
    {
    	res.add(new ArrayList<Integer>(ans));
    	for(int i=index;i<nums.length;i++){
       		ans.add(nums[i]);
	        getSubsets(i+1,nums,ans,res);
	        ans.remove(ans.size()-1);
    	}
        
    }
}