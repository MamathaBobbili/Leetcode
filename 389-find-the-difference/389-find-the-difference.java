class Solution {
    public char findTheDifference(String s, String t) {
       int[] visitedArr = new int[26];
        if(s.length()==0)
	        return t.charAt(0);
	    if(s.length()==t.length()-1)
	        {
	            char[] ch = t.toCharArray();
	            for(char c : ch)
	            {
                    visitedArr[c-'a']+=1;	                         
	            }
                char[] ch1 = s.toCharArray();
	            for(char c : ch1)
	            {
                    visitedArr[c-'a']-=1;
                }
	            for(int i=0;i<visitedArr.length;i++)
	            {
                    if(visitedArr[i]>=1)
                        return (char)(97+i);
                }
	        }
	    return Character.MIN_VALUE;
    }
   
    /** Add ascii value of each character from t and remove from s
     public char findTheDifference(String s, String t) {
        int charCode = t.charAt(s.length());
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) {
              charCode -= (int)s.charAt(i);
              charCode += (int)t.charAt(i); 
        }
        return (char)charCode;
    }
    **/
    
    /** Using XOR (bit manupiulation) method
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(int i = 0; i < s.length(); i++){
            c ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            c ^= t.charAt(i);
        }
        return c;
    }**/
}