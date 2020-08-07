import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author HeLi
 * MIS: heli11
 * Date: 2020-08-06 14:36
 * Email: heli11@meituan.com
 * Desc:广度优先遍历
 */
public class Bfs {

    public static  ArrayList<ArrayList<Integer>> result(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                level.add(node.data);
                if(node.left !=null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(level);

        }

        return  res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(4);
        root.right =new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(0);
        ArrayList<ArrayList<Integer>> reslut = result(root);
        System.out.println(reslut);
    }

}
