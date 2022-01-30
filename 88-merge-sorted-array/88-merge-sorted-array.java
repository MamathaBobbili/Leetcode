class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        	 
     /*** Append 2nd array and sort 
		 int k=0;
		 for(int i=0;i<nums1.length;i++){
			 if(nums1[i]==0){
				 nums1[i]=nums2[k];
				 k++;
			 }
		 }
		 Arrays.sort(nums1);
     **/
        
     /** In place sorting**/ 
	    if(nums2.length>0){			 
		
		 for(int i=0;i<nums1.length;i++)
		 {
			 if(nums1[i]>nums2[0])//compare first value of 2nd array if greater then swap
			 {
				 int t=nums2[0];
				 nums2[0]=nums1[i];
				 nums1[i]=t;
                 /**sort 2nd array after swapping**/
				 int f = nums2[0];
				 int l;
				 for(l=1;l<nums2.length && f>nums2[l];l++)
				 {
					nums2[l-1]=nums2[l];					
				 }
				 nums2[l-1]=f;
			 }			 
		 }
            /** place last elements in first array**/
		 int k=nums2.length-1;
		 for(int i =nums1.length-1 ;i>=0 && k>=0;i--){
			 if(nums1[i]==0){
				 nums1[i]=nums2[k];
				 k--;
			}
		 }
		 }
		 
		 
    }
}