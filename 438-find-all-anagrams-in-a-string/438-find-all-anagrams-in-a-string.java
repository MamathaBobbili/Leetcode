class Solution {
    
     public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<Integer>();
        int windowlen = p.length();
        int phash[]=new int[26];
        int shash[] = new int[26];
        int left=0,right=0;
        
        if(p.length()> s.length()) return indexes;
        
        while(right<windowlen){
        	phash[p.charAt(right)-'a']=phash[p.charAt(right)-'a']+1;
        	shash[s.charAt(right)-'a']=shash[s.charAt(right)-'a']+1;
        	right++;
        }
        right-=1;
        while(right<s.length())
        {
        	if(compare(phash,shash)){
            	indexes.add(left);
            }
        	right+=1;
        	if(right!=s.length())
        	shash[s.charAt(right)-'a']=shash[s.charAt(right)-'a']+1;
        	shash[s.charAt(left)-'a']=shash[s.charAt(left)-'a']-1;
        	left++;
        	//right++;
        }
       return indexes; 
    }
	private boolean compare(int[] phash, int[] shash) {
		// TODO Auto-generated method stub
		
		for(int j=0;j<phash.length;j++){
			if(phash[j]!=shash[j])
				return false;
			
		}
		return true;
	}
    
}

/** Using Recursion method 
    public void getAnagrams(char[] ch,List<String> res,List<String> s,int n,boolean[] freq){
        // Once individual anagram matches with size of given length then return  
		if(s.size()==n) 
		{
			res.add(String.join("",new ArrayList<>(s)));  
			return;
		}
		Solution f = new Solution();
		for(int i=0;i<ch.length;i++){			
			if(!freq[i]){               //if element is not taken then only add the element
				freq[i]=true;
				s.add(ch[i]+"");
				f.getAnagrams(ch,res,s,n,freq);
				s.remove(s.size()-1);  // on backtracking remove element and make frequency off
				freq[i]=false;
			}
		}
		
		
	}
    public List<Integer> findAnagrams(String s, String p) {
        
        //Get all permutations of given String p and check all these anagrams indexes in String s
        
        char[] ch = p.toCharArray();
		List<Integer> indexes = new ArrayList<Integer>(); //to maintain indexes
        if(p.length()>s.length())
			return indexes;
		List<String> res = new ArrayList<String>(); //to maintain final result (set of anagrams)
		List<String> str = new ArrayList<String>(); //to maintain individual anagram
		boolean[] freq=new boolean[p.length()];  // to maintain frequency whether each individual element taken or not taken ,if we directly use contains on list ,duplicates will not get handle
        
		Solution f = new Solution();
		f.getAnagrams(ch, res,str,p.length(),freq); 
        
        //Get all indexes for each anagram in the resultset
		for(String k : res)    
		{
			 int index = 0;
		        while(index != -1){
		            index = s.indexOf(k, index);
		            if (index != -1) {
		            	if(!indexes.contains(index))
		                indexes.add(index);
		                index++;
		            }
		        }
		}
		return indexes;
        
    }


 
 Recursion Tree : To find anagrams  
                abc                         
            a       b       c           
        b     c    a  c    a  b
      c        b   c   a   b   a
      
        abc,acb,bac,bca,cab,cba     

                    abab
                a   b   a   b 
               b    a   b   a 
**/