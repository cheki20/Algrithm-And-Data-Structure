import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;  // root of BST
    
    int nodeCount;

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;
    

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
            left = null;
            right = null;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
        root = null;
    }

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        if (root == null) {
            return true;    
        }
        return false;  
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return root.size;   
    }
    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    // public boolean contains(Key key) {
       
    // }

    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        Node x = root;
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");   
        }
        while( x.key != key){
            int temp = key.compareTo(x.key);
            if (temp < 0) {
                x = x.left;
            }
            else if (temp > 0) {
                x = x.right;   
            }
            if (x.key == key) {
                return x.val;
                
            }
        }
        return x.val;   
    }

    public Node getNode(Node x, Key key){
        Node node = null;
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");   
        }
        while( x!= null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) {
                return x;
            }
            if (cmp > 0) {
                node = x;
                x = x.right;
            }
            else {
                x = x.left;
            }
        }
        return node;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("Key is Null");    
        }
        else {
            Node newest = new Node(key,val,1);
            if(root == null){
                root = newest;
            }
            else{
                Node x = root;
                Node parent;
                while( x!=null ){
                    parent = x;
                    int temp = key.compareTo(x.key);
                    if(temp < 0){
                        x = x.left;
                        if(x == null){
                            parent.left = newest;
                            root.size++;
                            return;
                        }
                        else if(x.key == key){
                            x.val = val;
                            return;
                        }
                    }
                    else if(temp > 0){
                        x = x.right;
                        if(x == null){
                            parent.right = newest;
                            root.size++;
                            return;
                        }
                        else if(x.key == key){
                            x.val = val;
                            return;
                        }
                    }
                }
            }
        }

    }

    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        Node x = root;
        for (x = root; x.left != null; x = x.left ) {
            if (x == null) 
                throw new NoSuchElementException("Symbol Table is Empty");     
        }
        return x.key;
    } 

    public Key max() {
        Node x = root;
        for (x = root; x.right != null; x = x.right) {
            if (x == null) 
                throw new NoSuchElementException("Symbol Table is Empty");     
        }
        return x.key;
    } 
    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        Node x = getNode(root, key);
        Node temp = x;
        if (key == null) {
            throw new IllegalArgumentException("Key is Null"); 
        }   
        else if (size() == 0) {
            throw new NoSuchElementException("No such Key");
        }
        if (x==null) {
            return null;
        } 
        if(x.left!=null){
            temp = x.left;
            
            while(temp.right!=null){
                temp = temp.right;
            }
        }
        return temp.key;
    }

    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    public Key select(int k) {
        nodeCount=0;
        if ((k<0) || k>=size()) {
            throw new IllegalArgumentException("Rank should be between 0 ans its size");
        }
        return select(root, k+1).key;
    }
    
    // Return key of rank k. 
     private Node select(Node x, int k) {
        Stack<Node> stack = new Stack<Node>();
        Node curr = root;
        while (!stack.empty() || curr != null)
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = stack.pop();
                nodeCount++;
                if(nodeCount == k)
                    break;
                curr = curr.right;
            }
        }
        return curr;
    } 
    

    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */
    public Iterable<Key> keys(Key lo, Key hi) {
        if (lo == null) {
            throw new IllegalArgumentException("first argument to keys() is null");
        }
        if (hi == null) {
            throw new IllegalArgumentException("second argument to keys() is null");
        }

        Stack<Key> stack = new Stack<Key>();
        keys(root, stack, lo, hi);
        return stack;
    }

    private void keys(Node x,Stack<Key> stack, Key lo, Key hi) { 
        if (x == null) {
            return;
        }
        while (x != null){
            int cmplo = x.key.compareTo(lo);
            int cmphi = x.key.compareTo(hi);
            
            if (x.left == null) {
                if (cmphi <= 0 && cmplo >= 0) {
                    stack.push(x.key);
                }
                x = x.right;
            }
            else {
                Node node = x.left;
                while (node.right != null && node.right != x) {
                    node = node.right;
                }
                if (node.right == null) {
                    node.right = x;
                    x = x.left;
                }
                else {
                    node.right = null;
                    if (cmphi <= 0 && cmplo>=0) stack.push(x.key);{
                     x = x.right;
                    }
                }
            }
        }
    }
        
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    public static void main(String[] args) { 
        Solution<String, Integer> obj = new Solution<String, Integer>();

       
    }
}