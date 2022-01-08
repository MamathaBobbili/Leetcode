class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int resArrlen = nums1.length+nums2.length;
        int res[]=new int[resArrlen];
        
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
  
        int m=nums1.length;
        for(int j=0;j<nums2.length;j++){
            res[m]=nums2[j];
            m+=1;
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
        int index = resArrlen/2;
        int rem= resArrlen %2;
        System.out.println("index---"+index);
        System.out.println("rem----"+rem);
        if(rem==0)
        {
            double sum=(res[index]+res[index-1])/2.0;
            System.out.println("sum-----"+sum);
            return sum;
        }
        else{
            return res[index];
        }
        
    }
}