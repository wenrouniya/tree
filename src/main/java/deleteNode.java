/**
 * @author HeLi
 * MIS: heli11
 * Date: 2020-08-07 17:00
 * Email: heli11@meituan.com
 * Desc:
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，
 * 并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
 *
 * 思路分析：
 * 1。 二分法删除节点
 * 2。 删除节点后可能遇到的三种情况
 *          被删除节点为叶子节点  直接删除
 *          被删除节点的节点 有一边为空 直接返回另一边不为空的节点即可
 *          被删除的叶子节点左右子树都不为空  则用左子树的最大值替换要删除的节点 或者用右子树的最小值 替换要删除的节点
 *
 */
public class deleteNode {

    public static  TreeNode  deleteNode (TreeNode node ,int value){
        if(node ==null){
            return null;
        }

        if(node.data > value){
            node.left=deleteNode(node.left,value);
        }else if(node.data <value){
           node.right= deleteNode(node.right,value);
        }else {
            //左子树为空  直接返回右子树
            if(node.left ==null ){
                return node.right;
            }
            //右子树为空 返回左子树
            if(node.right == null){
                return node.left;
            }
            //两个子树都不为空
            TreeNode temp= findRightMin(node.right);
            node.data=temp.data;
            node.right=deleteNode(node.right,node.data);

        }
        return node;
    }

    private static TreeNode findRightMin(TreeNode node) {

        while(node.left!=null){
           node=node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left=new TreeNode(10);
        root.right =new TreeNode(30);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(15);
        root.left.right.left=new TreeNode(13);
        root.left.right.right=new TreeNode(16);
        TreeNode treeNode = deleteNode(root, 10);
        System.out.println(treeNode);
    }

}


