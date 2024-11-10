package bstCommon;

class Node { //node w its attributes 
    Node left;
    Node right;
    int data;
}

/*
  for now, i'm only building the BST so my unique key to compare the nodes is the root.
  i'll introduce the parents soon. 
*/

class BinaryTree {  //class where i'll build the methods and verify the root to insert the nodes. 

    public Node createNewNode(int data) { //creation node method
        Node a = new Node(); //instancing an empty node to receive values
        a.left = null;
        a.right = null;
        a.data = data;
        return a;
    }
    
    public Node insert(Node node, int value) { //insertion into node method 
        if (node == null) {
            return createNewNode(value); //inserting a root if tree is empty 
        }
        // validating to insert the nodes in the correct place;
         else if (value < node.data) {  
            node.left = insert(node.left, value);
        } 
         else if (value > node.data) {
            node.right = insert(node.right, value);
        }
         return node; 
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = null; 

        root = bt.insert(root, 6);
        root = bt.insert(root, 12);
        root = bt.insert(root, 4);
        root = bt.insert(root, 3);
        root = bt.insert(root, 9);
        root = bt.insert(root, 20);
        root = bt.insert(root, 67);
    }
}
