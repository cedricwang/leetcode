
public class SameTree {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	boolean retval = true;
    	
    	if(p==null && q==null){
    		return true;
    	}
    	
    	if(p==null && q !=null){
    		return false;
    	}
    	
    	if(p!=null && q ==null){
    		return false;
    	}
    	
    	isSameNode(p,q);
    	return retval;
    }
    
    private boolean isSameNode(TreeNode p, TreeNode q){
    	if(p.val==q.val){
    		if((p.left==null && q.left !=null) || (q.left==null && p.left!=null)){
    			return false;
    		}
    		
    		if((p.right==null && q.right !=null) || (q.right==null && p.right!=null)){
    			return false;
    		}
    		
    		if(p.left != null && q.left !=null){
    			isSameNode(p.left,q.left);    			
    		}
    		
    		if(p.right != null && q.right !=null){
    			isSameNode(p.right,q.right);
    		}
    		
    	}else{
    		return false;
    	}
    	
    	return true;
    }
}
