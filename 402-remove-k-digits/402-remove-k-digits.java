class Solution {
    public String removeKdigits(String num, int k) {
		if(k==num.length())
			return "0";
	    Stack<Character> s1=new Stack<Character>();
	    for(int i=0;i<num.length();i++){
	    while(k>0 && !s1.isEmpty() && s1.peek()>num.charAt(i)) //Finding small value while traversing the array
		    {
		    	s1.pop();
		    	k--;
		    }
		    s1.push(num.charAt(i));
	    }
        while(k>0){ // corner case like "1111"
            s1.pop();
            k--;            
        }
	  //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!s1.isEmpty())
            sb.append(s1.pop());
        sb.reverse();
        
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
	}
    /*
    Find all the possibles values and finding the min in it
    public int getMinValue(char[] numArr,int len,int m){
		int min=Integer.MAX_VALUE;
		if(numArr.length<=m)
			return 0;
		
		for(int i=0;i<=numArr.length-m;i++){
			String c=""+numArr[i];
			for(int j=i+1;j<numArr.length;j++){
				String f=c;
				for(int k=j;k<numArr.length && f.length()<len;k++){
					f=f+numArr[k];
				}
				if(f.length()==len){
					int val = Integer.parseInt(f);
					System.out.println("val--"+val);
					min=Math.min(min, val);
				}
				if(j==len){
		
				  break;
				}
			}
		}
		
		
		return min;
	}
	public String removeKdigits(String num, int k) {
		int len=num.length()-k;
		int min=0;
		char[] numArr = num.toCharArray();
	    min =getMinValue(numArr,len,k);
		return min+"";
	}*/
}