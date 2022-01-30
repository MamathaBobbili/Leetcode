class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
		int wholeSum=(n*(n+1))/2;  // sum of n number
		int givenSum=0;
		for(int i :nums) //calculate sum 		
        {
			givenSum=givenSum+i;
		}
		
		return wholeSum-givenSum;     
	    }
}