import java.util.ArrayList;
import java.util.Stack;

/**
 * @author HeLi
 * MIS: heli11
 * Date: 2020-08-06 12:06
 * Email: heli11@meituan.com
 * Desc:二叉树的深度优先遍历
 */
public class traversal {

    public  static ArrayList<Integer> reslut(TreeNode root){


        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.peek();
            list.add(node.data);
            stack.pop();
            if(node.right !=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return  list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right =new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(3);
        ArrayList<Integer> reslut = reslut(root);
        System.out.println(reslut);
    }
}
