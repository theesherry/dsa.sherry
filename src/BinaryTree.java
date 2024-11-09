 class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }




}

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertrec(root, data);

    }

    private Node insertrec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertrec(root.left, data);
        } else if (data > root.data) {
            root.right = insertrec(root.right, data);

        }

return root;


    }



    public void print(){
    print2(root);

    }

    private void print2(Node root) {
        if(root!=null){
            print2(root.left);
            System.out.println(root.data);
            print2(root.right);
        }

    }
}








