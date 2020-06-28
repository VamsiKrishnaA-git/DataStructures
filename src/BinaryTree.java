import java.util.Scanner;

class BinaryTNode {
    BinaryTNode left,right;
    int data;

    public BinaryTNode(int n){
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(BinaryTNode n){
        left = n;
    }

    public void setRight(BinaryTNode n){
        right = n;
    }

    public BinaryTNode getLeft() {
        return left;
    }

    public BinaryTNode getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

class BinaryTreeImplementation{
    private  BinaryTNode root;
    public BinaryTreeImplementation(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int data)
    {
        System.out.println("-");
        root = insert(root, data);
        System.out.println(root);

    }
    /* Function to insert data recursively */
    private BinaryTNode insert(BinaryTNode node, int data)
    {

        if (node == null)
            node = new BinaryTNode(data);

        else
        {
            System.out.println(node.data);
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);
        }
        System.out.println(node.data);
        System.out.println("-----");
        return node;
    }

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(BinaryTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }

    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(BinaryTNode r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }

    public void inorder(BinaryTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }

    public void preorder(BinaryTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder(BinaryTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }

    public BinaryTNode getRoot(){
        return root;
    }
}

public class BinaryTree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");
        char ch;
        do
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bt.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bt.search( scan.nextInt() ));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ bt.countNodes());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ bt.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display tree  */
            System.out.print("\nPost order : ");
            bt.postorder(bt.getRoot());
            System.out.print("\nPre order : ");
            bt.preorder(bt.getRoot());
            System.out.print("\nIn order : ");
            bt.inorder(bt.getRoot());

            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
