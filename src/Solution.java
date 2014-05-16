import java.util.Stack;


public class Solution {
    public int singleNumber(int[] A) {
        if(A.length<=0)
    	   return -1;
        if(A.length==1)
    	   return A[0];
    	   
    	int retval = 0;
    	for(int i=0; i<A.length; i++)
    	{
    	    retval ^= A[i];    
    	}
    	
    	return retval;
    }
    
    public String reverseWords(String s){
    	String[] words = s.split(" ");
    	String retval="";
    	Stack<String> stack = new Stack<String>();
    	for(String word:words){
    		String tmp =word.trim();
    		if(tmp.equalsIgnoreCase(" ")|| tmp.length()==0){
    			continue;
    		}
    		stack.add(tmp);
    	}
    	
    	while(!stack.isEmpty()){
    		retval+=stack.pop()+" ";
    	}
    	retval=retval.trim();
    	
    	return retval;
    }
    
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length ; i++){
            
        }
    }
    
    public String reverseWords1(String s) {
    	char c= ' ';
        while(s.length()>0 && s.charAt(0)==c)
        {
        	s=s.trim();
        }
        
//        while(s.length()>1 && s.charAt(s.length()-1)==c){
//        	s.trim();
//        }
    	
    	String[] words =s.split(" ");
        String retval="";
        for(int i= words.length-1; i>=0 ; i--){
        	if(words[i].equalsIgnoreCase(" ") || words[i].length()==0){
        		continue;
        	}
        	
        	if(0==i){
        		retval += words[0];
        		continue;
        	}
        	
        	retval +=words[i]+"X";
        }
        
        return retval;
    }
    
    public int singleNumberII(int[] A){
    	if(A.length <=0)
    		return -1;
    	
    	for(int i =0 ; i<A.length; i+=3)
    	{
    		int seed1 =0;
			int seed2 =0;
    		if(i >= A.length){
    			
    		}
    		else{    			
    			seed1=A[i]^A[i+1];
    			seed2=A[i]^A[i+2];
    		}
    		
    		if(seed1==0 && seed2==0){
    			continue;
    		}
    	}
    	return 0;
    }
}
