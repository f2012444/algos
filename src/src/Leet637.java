import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;


public class Leet637 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> out = averageOfLevels(root);
        for (double i:out) {
            System.out.println(i);
        }

    }

    public static  List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q1 = new Queue<TreeNode>() ;
        q1.push(root);
        Queue<TreeNode> q2 = new Queue<TreeNode>();
        List<Double> output = new ArrayList<Double>();
        //output.add((double)root.value);

        while(q1!= null || q2!=null) {
            double curr = 0;
            double size = 0;
            while(q1!=null) {
                TreeNode temp = q1.pop();
                curr+= (double)temp.value;
                size+=1;
                if(temp.left != null) {
                    q2.push(temp.left);
                }

                if(temp.right != null) {
                    q2.push(temp.right);
                }

            }

            output.add(curr/size);
            curr = 0;
            size = 0;

            while(q2!=null) {
                TreeNode temp = q2.pop();
                curr+= (double)temp.value;
                size+=1;
                if(temp.left != null) {
                    q1.push(temp.left);
                }

                if(temp.right != null) {
                    q1.push(temp.right);
                }

            }
            output.add(curr/size);


        }

        return output;

    }
}


