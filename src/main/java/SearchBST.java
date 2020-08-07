import java.util.ArrayList;

/**
 * @author HeLi
 * MIS: heli11
 * Date: 2020-08-06 20:51
 * Email: heli11@meituan.com
 * Desc:给定二叉搜索树（BST）的根节点和一个值。你需要在BST中找到节点值等于给定值的节点。返回以该节点为根的子树。如果节点不存在，则返回 NULL
 */
public class SearchBST {
    public static TreeNode result( TreeNode node,int value){
        while(node !=null){
            if(node.data ==value){
                return  node;
            }else if( node.data < value){
                node=node.right;
            }else{
                node=node.left;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right =new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(3);
        TreeNode reslut = result(root,8);
        System.out.println(reslut);
    }
}
