class BinaryTree_Depth
{
    Nodes root;
    int maxDepth(Nodes node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            if(lDepth > rDepth)
            {
                return (lDepth + 1);
            }
            else
            {
                return (rDepth + 1);
            }
        }
    }
    
    public static void main(String args[])
    {
        BinaryTree_Diameter tree = new BinaryTree_Diameter();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(5);
        System.out.println("Diameter = "+tree.diameter());

    }
}