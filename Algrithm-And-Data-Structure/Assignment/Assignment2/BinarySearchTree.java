import java.util.*;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
	//root of BST
	public Node root;

	//number of nodes
	public int n;

	public BinarySearchTree(){
        root = null;
        n = 0;
    }

	public class Node {
        public Key key;           // sorted by key
        public Value val;         // associated data
        public Node left, right;  // left and right subtrees
        public int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;

            left = null;
            right = null;
        }
    }

    public boolean isEmpty(){
    	if (n==0) {
            return true;    
        }
        else{
            return false;
        }
    } 
    
    public int size() {
    	if (n==0) {
    		return 0;	
    	}
        return n;    
    }

    // public Value get(Node root, int value) {
    //     while (root != null) {
    //         if ((int) root.data == value)
    //             return true;

    //         if (value < (int) root.data)
    //             root = root.left;

    //         else
    //             root = root.right;
    //     }

    //     return false;
    // }

    public void put(Key key, Value val) {
    	Node current, parent;

        Node tempNode = new Node(value);

        if (root == null) {
            root = tempNode;
            return root;
        } else {
            current = root;
        }

        while (true) {
            parent = current;

            if (value < (int) current.val) {
                current = current.left;
                if (current == null) {
                    parent.left = tempNode;
                    return root;
                }

            } else if (value > (int) current.data) {
                current = current.right;

                if (current == null) {
                    parent.right = tempNode;
                    return root;
                }
            }

        }
    }
}