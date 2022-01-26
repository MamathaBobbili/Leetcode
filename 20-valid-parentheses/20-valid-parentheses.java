class Solution {
    public boolean isOpenBrace(char c){
	       if(c=='{'||c=='('||c=='[')
        		 return true;      
	        return false;
	    }
    public boolean isValid(String s) {
	        
	        char ch[] = s.toCharArray();
	        Stack<Character> stk = new Stack<>();
	        Map<Character,Character>  map = new HashMap<>();
	        boolean balanced=false;
	        map.put('{','}');
	        map.put('[',']');
	        map.put('(',')');
	        for(int c=0;c<ch.length;c++)
	        {
	        	if(isOpenBrace(ch[c])){
	                    stk.push(ch[c]); //Keep pushing onto stack if input is an Open brace
	                    balanced= false; // have to make it false for "[]("
	                }
	                else{
	                	if(stk.isEmpty()) // "[]{}}"
	                		return false;
	                	else{
		                    char popchar = stk.pop();
		                    if(map.containsKey(popchar)){
		                        char val = map.get(popchar);
		                        if(val==ch[c])
		                        {
		                        	balanced= true;
                                    if(c==ch.length-1 && !stk.isEmpty())
		                        		return false; // "{[]"
		                        }
		                        else
		                        	return false;  //"({{{{}}}))"
		                    }
	                	}
	                }
	            }         
	        return balanced;
	    }
    
    /*public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(stack.isEmpty()){
                stack.push(ch[i]);
            }else if(stack.peek()=='(' && ch[i]==')'){
                stack.pop();
            }else if(stack.peek()=='[' && ch[i]==']'){
                stack.pop();
            }else if(stack.peek()=='{' && ch[i]=='}'){
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
        }
        
        return stack.isEmpty();
    }*/
}