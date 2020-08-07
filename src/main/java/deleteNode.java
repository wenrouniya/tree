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
 *      被删除节点的左子树为空 直接用右子树节点代替当前节点 因为对副节点来说你该节点一下的要么全是大于它的 要么全是小于它的
 *      被删除节点的右子树为空 直接用左子树节点代替当前节点
 *      被删除的节点左右子树都不为空 则找到 小于当前节点的最大值替换该节点 或者 找到大于当前节点的最小值替换该节点
 *      就删除的操作来说 找到小于当前节点的最大值并替换的方式更易于操作
 *3。 删除节点的操作 若为叶子节点 直接删除该节点 置为null
 *   若为非叶子节点 递归找到要替换的叶子节点的值
 *          值替换
 *          删除叶子节点
 */
public class deleteNode {

    public static  TreeNode  deleteNode (TreeNode node ,int value){

        if(node.data > value){
            deleteNode(node.left,value);
        }else if(node.data <value){
            deleteNode(node.right,value);
        }else {
            //为叶子节点 直接删除
            if(node.left ==null && node.right == null){
                node =null;
            }else if()
        }
    }
}
