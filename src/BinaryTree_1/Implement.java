package BinaryTree_1;
import java.util.*;
 class Node{
     int val;
     Node left;
     Node right;
     Node(int val){
         this.val=val;
     }
 }

public class Implement {
    public static void main(String[] args) {
        //                       3
        //                    /      \
        //                  4         2
        //                 /   \     /  \
        //               -1    1   6    9
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

//        display(a);
//        System.out.println();
//        System.out.println("Levels of tree : "+Levels(a));
//        System.out.println( "size of tree : "+size(a));
//        System.out.println("sum of tree : "+sum(a));
//        System.out.println("max of tree: "+max(a));
//        System.out.println("min of tree  :"+min(a));
//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);

     // levelOrder(a);
        KthLevel(a,0,0);


    }
    private static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    private static void KthLevel(Node root ,int level,int k){
        if(root==null) return;
        if(level==k) System.out.println(root.val+" ");
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }
    private static int Levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(Levels(root.left),Levels(root.right));
    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val+ sum(root.left) +sum(root.right);
    }
    private static int size(Node root){
        if(root==null)  return 0;
        return 1+ size(root.left) + size(root.right);
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
