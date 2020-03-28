package problem2.main;

public class MyBST {
    public Node root = null;
    public void preOrder() {
        System.out.print("preOrder sequence:");
        Node temp = root;
        pretrav(temp);
        System.out.println();
    }
    private void pretrav(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.getData()+"  ");
        pretrav(node.getRight());
        pretrav(node.getLeft());
    }
    public void postOrder() {
        System.out.print("postOrder sequence:");
        Node tem = root;
        posttrav(tem);
        System.out.println();
    }
    private void posttrav(Node node){
        if (node == null) {
            return;
        }
        posttrav(node.getLeft());
        posttrav(node.getRight());
        System.out.print(node.getData()+"  ");
    }
    public void Insert(int data) {
        if (root == null) {
            Node temp = new Node(data);
            root = temp;
        }
        insert(root, data);
    }
    private static Node insert(Node root, int x){
        if (root == null)
            return new Node(x);
        else if(x>root.getData())
            root.setRight(insert(root.getRight(),x));
        else if(x<root.getData())
            root.setLeft(insert(root.getLeft(),x));
        return root;
    }
}
