class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        if(s.length()==1) //" ","a"
            return s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            String str= Character.toString(ch[i]);
            for(int j=i+1;j<ch.length;j++)
            {
                String str2=  Character.toString(ch[j]);
                if(str.contains(str2)){
                    if(str.length()>len)
                        len=str.length();
                   
                    
                  break;
                }
                else{
                    str =str.concat(str2);
                    
                }
                if(j==ch.length-1 && str.length()>=len){
                        len=str.length();
                         return len;
                }
            }
           
       }
        return len;
        
    }
}