class Solution {
    
    /** Dutch nation flag algorithm / 3-way quick sort*/
    public static void swap(int i,int j,int[] nums){
		int t= nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
    public void sortColors(int[] nums) {
        int l=0;
		int m=0;
		int h=nums.length-1;
		
		while(m<=h){
			if(nums[m]==0){
				swap(l,m,nums);
				l++;
				m++;		
				
			}
			else if(nums[m]==2){
				swap(m,h,nums);
				h--;
								
			}
			else{
				m++;
			}
		}
    }
}