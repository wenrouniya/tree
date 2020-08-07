import java.util.ArrayList;

/**
 * @author HeLi
 * MIS: heli11
 * Date: 2020-08-06 18:39
 * Email: heli11@meituan.com
 * Desc:是不是完全二叉树 左子数小于根结点 右子树大根结点
 */
public class isBTS {
    public static boolean reslut(TreeNode  root){

        if(root == null){
            return  true;
        }
      return   isBts(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static Boolean isBts(TreeNode root, int minValue, int maxValue) {
        if(root == null){
            return true;
        }
        if(root.data<= minValue || root.data>=maxValue){
            return false;
        }
        //上一个节点的data是左子树的最大值 是右子树的最小值
      return   isBts(root.left,minValue,root.data)
              && isBts(root.right,root.data,maxValue);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left=new TreeNode(4);
        root.right =new TreeNode(8);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
         Boolean reslut = reslut(root);
        System.out.println(reslut);
    }
}
