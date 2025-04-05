public class MaximumDepthOfATree {
    static int MAX_DEPTH =0;
    public static class TreeNode{
        int value;
        TreeNode left = null;
        TreeNode right = null;

        
        TreeNode(int val){
            this.value = val;
        }
    }
   public static void main(String[] args) {
        //Test case 1
        //     1
        //   2    3
        //4          5
        //            6
        TreeNode root = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t3.right = t5;
        t5.left =  t6;

        FindMaximumDepth(root,1);
        System.out.println("Maximum depth from root is " + MAX_DEPTH);

   }
   //bfs recursion
   public static void FindMaximumDepth(TreeNode root, int currentDepth){
        MAX_DEPTH = Math.max(MAX_DEPTH, currentDepth);
        if(root.left != null) FindMaximumDepth(root.left,currentDepth+1);
        if(root.right != null) FindMaximumDepth(root.right,currentDepth+1);
   }
}
