// import java.util.ArrayList;
// import java.util.List;

// import javax.swing.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

public class Tree {
// public List<Integer> preorderTraversal(TreeNode root) {
// List<Integer> pre = new ArrayList<>();
// preHelper(root,pre);
// return pre;
// }
// public void preHelper(TreeNode root, List<Integer> pre) {
// if(root==null) return;
// pre.add(root.val);
// preHelper(root.left,pre);
// preHelper(root.right,pre);
// }


// public List<Integer> inorderTraversal(TreeNode root) {
//     List<Integer> pre = new ArrayList<>();
//     preHelper(root,pre);
//     return pre;
//     }
//     public void preHelper(TreeNode root, List<Integer> pre) {
//     if(root==null) return;
//     preHelper(root.left,pre);
//     pre.add(root.val);
//     preHelper(root.right,pre);
//     }
    

// public List<Integer> postorderTraversal(TreeNode root) {
// List<Integer> pre = new ArrayList<>();
// preHelper(root,pre);
// return pre;
// }
// public void preHelper(TreeNode root, List<Integer> pre) {
// if(root==null) return;
// preHelper(root.left,pre);
// preHelper(root.right,pre);
// pre.add(root.val);
// }

// public static int getSize(Node root)
// 	{
//         if (root == null)
//             return 0;
        
        
//             int a = getSize(root.left); 
//             int b = getSize(root.right);
            
//             return a+b+1;
//     }


// {
//     static int sumBT(Node head){
//          if (head == null)
//             return 0;
        
        
//             int a = sumBT(head.left); 
//             int b = sumBT(head.right);
            
//             return a+b+head.data;
//     }



    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     Queue<TreeNode> queue = new LinkedList<TreeNode>();
    //     List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
    //     if(root == null) return wrapList;
        
    //     queue.offer(root);
    //     while(!queue.isEmpty()){
    //         int size = queue.size();
    //         List<Integer> subList = new LinkedList<Integer>();
    //         for(int i=1; i <= size; i++) {
    //             if(queue.peek().left != null) queue.offer(queue.peek().left);
    //             if(queue.peek().right != null) queue.offer(queue.peek().right);
    //             subList.add(queue.poll().val);
    //         }
    //         wrapList.add(subList);
    //     }
    //     return wrapList;
    // }


    // public ArrayList<Integer> reverseLevelOrder(Node node) 
    // {
    //     // code here
    //     Stack<Node> s = new Stack<Node>();

    //     Queue<Node> q = new LinkedList<Node>();
    //         ArrayList<Integer> t = new ArrayList<Integer>();
    //         if(node != null){
    //             q.add(node);
    //             s.push(node);
    //         }
            
    //         while(q.size() > 0){
    //           Node temp = q.remove();
    //           //t.Add(temp.data);
              
    //         if(temp.right != null){
    //               q.add(temp.right);
    //               s.push(temp.right);
    //           }
    //           if(temp.left != null){
    //               q.add(temp.left);
    //               s.push(temp.left);
    //           }

              
              
    //         }
            
    //         while(s.size()>0){
    //             Node temp = s.pop();
    //             t.add(temp.data);
    //         }
            
    //         return t;
    // }



    


 }


