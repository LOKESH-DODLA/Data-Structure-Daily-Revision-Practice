class BinaryTree_Ancestor
{
    Nodes root;
    
    boolean printAncestor(Nodes node , int target)
    {
        if(node == null)
        {
            return false;
        }
        if(node.data == target)
        {
            return true;
        }
        if(printAncestor(node.left , target) || printAncestor(node.right , target))
        {
            System.out.print(node.data+" ");
            return true;
        }
        return false;
        
    }
    
    public static void main(String args[])
    {
        BinaryTree_Diameter tree = new BinaryTree_Diameter();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(5);
        tree.printAncestor(tree.root , 4);

    }
}