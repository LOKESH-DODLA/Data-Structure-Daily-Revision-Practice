class BST_isBinBST
{
    Nodes root;
    boolean isBST()
    {
        return isBSTUtil(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    boolean isBSTUtil(Nodes node , int min , int max)
    {
        if(node == null)
        {
            return true;
        }
        if(node.key < min || node.key > max)
        {
            return false;
        }
        return ((isBSTUtil(node.left , min , node.data-1)) && (isBSTUtil(node.right , node.data+1, max)));
    }
    public static void main(String args[])
    {
        BST_isBinBST tree = new BST_isBinBST();
        tree.root = new Nodes(4);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(5);
        tree.root.left.left = new Nodes(1);
        tree.root.left.right = new Nodes(3);
        if(tree.isBST())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}