import java.util.HashMap;
import java.util.Stack;


public class Solution {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	
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
        /*int[] retval = new int[2];
    	for(int i=0; i<numbers.length ; i++){
            int firstNum = numbers[i];
            
            for(int j=i+1; j<numbers.length ; j++){
            	int secondNum = numbers[j];
            	if((firstNum+secondNum==target)){
            		retval[0]=i;
            		retval[1]=j;
            		break;
            	}
            }
        }
    	
    	return retval;*/
    	int len = numbers.length;
    	assert(len>2);
    	int[] retval = new int[2];
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i =0; i<len; i++){
    		if(!map.containsKey(numbers[i])){
    			map.put(target-numbers[i], i);
    		}
    		else
    		{
    			int idx = map.get(numbers[i]);
    			retval[0]=idx;
    			retval[1] = i;
    			break;
    		}
    		
    	}
    	return retval;
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
    
    public int maxDepth(TreeNode root) {        
    	if(root ==null)
    	{
    		return 0;
    	}
    	root.val =0;
    	return findDeep(root);
    	
    }
    
    private int findDeep(TreeNode lastNode){
    	int left=0;
    	int right =0;
    	if(lastNode.left != null){
    		lastNode.left.val = lastNode.val+1;
    		left=findDeep(lastNode.left);
    	}
    	
    	if(lastNode.right !=null){
    		lastNode.right.val = lastNode.val+1;
    		right=findDeep(lastNode.right);
    	}
    	
    	if(right>left){
    		return right+1;
    	}
    	else
    	{
    		return left+1;
    	}
    }
    
    public int maxProfit(int[] prices) {
//    	if(prices==null || prices.length<2){
//    		return 0;
//    	}
//    	
//    	int profit =0;
//    	
//    	for(int buyIndex =0 ; buyIndex<prices.length-1; buyIndex++){
//    		int buy = prices[buyIndex];
//    		for(int sellIndex = buyIndex+1; sellIndex<prices.length; sellIndex++){
//    			int sell = prices[sellIndex];
//    			if(sell>buy){
//    				profit = (sell-buy)>profit ? (sell-buy):profit;
//    			}
//    		}
//    	}
//    	
//    	return profit;
    	
    	int profit =0;
    	int buy =0;
    	
    	for(int i = 0; i<prices.length ; i++){
    		int tmpProfit =0;
    		if(prices[i]<prices[buy]){
    			buy = i;
    		}else{
    			tmpProfit = prices[i] - prices[buy];
    		}
    		if(tmpProfit>=profit){
    			profit=tmpProfit;
    		}
    		
    	}
    	
    	return profit;
    }
}
