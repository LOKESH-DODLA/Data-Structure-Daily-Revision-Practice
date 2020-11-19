class BinaryTree_Diameter
{
    Nodes root;
    int diameter(Nodes root)
    {
        if(root == null)
        {
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(lheight + rheight + 1 , Math.max(ldiameter , rdiameter));
    }
    int diameter()
    {
        return diameter(root);
    }
    static int height(Nodes node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            return (1 + Math.max(height(node.left) , height(node.right)));
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