class Solution {
        public static boolean calculateSumofSquares(int n,int sum,List<Integer> list){
    	    while(n>0){	            
	            int r = n%10;
	            sum=sum+r*r;
	            n=n/10;
	        }
	        if(sum==1)
	            return true;
	        else{
	        	if(list.contains(sum))
	        		return false;
	        	list.add(sum);
	            return calculateSumofSquares(sum,0,list);
	           
	        }
		        
	    }
       
	    public boolean isHappy(int n) {
	    	List<Integer> list =new ArrayList<Integer>();
	    	return calculateSumofSquares(n,0,list);	        
	    }
}