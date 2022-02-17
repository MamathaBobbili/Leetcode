class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (candidates == null || candidates.length == 0 || target <= 0) {
          return res;
        }
        List<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(candidates); // Only benefit of sorting is that we can break early in the recursion if the current number is greater than the remaining target. 
	    checkCombinationSum(0,candidates,ans,res,target);
		return res;
        
    }
    
    public void checkCombinationSum(int index,int[] candidates,List<Integer> ans,List<List<Integer>> res,int sum) {
	
       if (sum==0){ 
			res.add(new ArrayList<>(ans));	
			return;
		}
		else
		{
			for(int i=index;i<candidates.length;i++){
			if (candidates[i] > sum) {
	                break;
	        }
			ans.add(candidates[i]);
			checkCombinationSum(i,candidates,ans,res,sum-candidates[i]); // pass the same index to have same elements 
			ans.remove(ans.size()-1);
			
			}
		}
	}
}