class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1.equals(version2))
        	return 0;
        String[] v1=new String[version1.length()];
        String[] v2 =new String[version2.length()];
        int i=0;
        if(!version1.contains(".") && !version2.contains(".")){
        if(Integer.parseInt(version1) > Integer.parseInt(version2))
        	return 1;
        else if(Integer.parseInt(version1) < Integer.parseInt(version2))
        	return -1;
        else if(Integer.parseInt(version1) == Integer.parseInt(version2))
        	return 0;
        }
        if(version1.contains("."))
        	v1=version1.split("\\.");
        else{
        	version1=version1+".0";
        	v1=version1.split("\\.");
        }
        if(version2.contains("."))
        	v2=version2.split("\\.");
        else{
        	version2=version2+".0";
        	v2=version2.split("\\.");
        	
        }
        int maxlen=v1.length;
        if(v2.length>maxlen)
        	maxlen=v2.length;
        
        while(i!=maxlen){
        	if(maxlen!=v1.length && i>=v1.length)
        	{        		
        		v1 = Arrays.copyOf(v1, v1. length + 1);
        		v1[i]="0";
        	}
        	if(maxlen!=v2.length && i>=v2.length)
        	{
        		v2 = Arrays.copyOf(v2, v2. length + 1);
        		v2[i]="0";
        	}
        	if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i]))
        		return -1;
        	else if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i]))
        		return 1;
        	else{
        		i++;
        	}
        		
        }
        
        return 0;
    }
}