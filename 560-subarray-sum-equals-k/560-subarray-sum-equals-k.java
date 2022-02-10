class Solution {
    public int subarraySum(int[] nums, int k) {
        
//         int count=0;
		
//          for(int x=0; x < nums.length; x++){
//             for(int y=x; y < nums.length; y++){
//                 int sum = 0;
//                 for(int z=x; z <= y; z++)
//                     sum += nums[z];
//                 if(sum == k)
//                     ++count;
//             }
//         }
        
        
// 		return count;
        
         int count = 0;
        for(int x=1; x < nums.length; x++)
            nums[x] += nums[x-1];
        for(int x=0; x < nums.length; x++){
            if(nums[x] == k)
                ++count;
            for(int y=x+1; y < nums.length; y++)
                if(nums[y]-nums[x] == k)
                    ++count;
        }
        return count;
        
    }
}