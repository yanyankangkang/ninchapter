
public class Solution {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
private boolean flag;
public boolean isBalanced(TreeNode root) {
    flag =false;
    height(root);
    return !flag;
}
private int max_height(int a, int b){
	if(a > b){
		return a;
	}
	else 
		return b;
}
private int height(TreeNode node){
    if(node == null || flag ){
        return 0;
    }
    int left_height, right_height;
    left_height = height(node.left);
    right_height = height(node.right);
    if ( Math.abs(left_height - right_height) > 1 ){
       flag =true;
    }
    return max_height(left_height , right_height) + 1;
}

}
