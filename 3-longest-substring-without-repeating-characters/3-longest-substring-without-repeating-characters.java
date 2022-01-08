class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        if(s.length()==1) //" ","a"
            return s.length();        
        String test="";
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                                      + 1);
            }
            test = test + String.valueOf(c);
            len = Math.max(test.length(), len);
        }
//         char ch[]=s.toCharArray();
//         for(int i=0;i<ch.length;i++)
//         {
//             String str= Character.toString(ch[i]);
//             for(int j=i+1;j<ch.length;j++)
//             {
//                 String str2=  Character.toString(ch[j]);
//                 if(str.contains(str2)){
//                     if(str.length()>len)
//                        len=str.length();              
                   
//                   break;
//                 }
//                 else{
//                     str =str.concat(str2);
                    
//                 }
//                 if(j==ch.length-1 && str.length()>=len){
//                         len=str.length();
//                          return len;
//                 }
//             }
           
//        }
        return len;
        
    }
}