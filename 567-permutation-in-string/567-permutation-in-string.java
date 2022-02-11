class Solution {
    
    /** Sliding Window Technique **/
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
		if(n1>n2)
			return false;
		int[] shash=new int[26];
		int[] phash=new int[26];
		for(int i=0;i<n1;i++)
		{
			shash[s1.charAt(i)-'a']++; // Find frequency of S1
		}
		for(int l=0;l<n2;l++){
			phash[s2.charAt(l)-'a']++; // Find frequency of S2
			if(l>=n1)
                phash[s2.charAt(l-n1)-'a']--; // reduce by one while moivng to right
			if(Arrays.equals(shash,phash)) return true;
		}
		return false;
	}
    
    /** Recursion BruteForce Method 
    public boolean checkInclusion(String s1, String s2) {
		boolean found =false;
		List<ArrayList<Character>> res = new                     ArrayList<ArrayList<Character>>();
		List<Character> ans=new ArrayList<Character>();
		char[] ch = s1.toCharArray();
		boolean freqmap[]=new boolean[ch.length];
		getPermutationsOfString(ch,res,ans,freqmap);
		for(ArrayList<Character> list : res)
		{
			String str="";
			for(char c: list)
			{
				 str+=c;
			}
			System.out.println(str);
			found= s2.contains(str);
				if(found)
					return found;
			
		}
		
		return found;
        
    }
	
	
	private void getPermutationsOfString(char[] ch, List<ArrayList<Character>> res,List<Character> ans,boolean[] freqmap) {
		
		if(ans.size()==ch.length)
		{
			res.add(new ArrayList<Character>(ans));
			
		}
		for(int i=0;i<ch.length;i++)
		{
			if(!freqmap[i]){
				ans.add(ch[i]);
				freqmap[i]=true;
				getPermutationsOfString(ch,res,ans,freqmap);
				freqmap[i]=false;
				ans.remove(ans.size()-1);
			}
		}
		
	}**/
}