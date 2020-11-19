class BinaryTree_MWidth
{
    Nodes root;
    int getMaxWidth(Nodes node)
    {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;
        for(i=1;i<=h;i++)
        {
            width = getWidth(node , i);
            if(width > maxWidth)
            {
                maxWidth = width;
            }
        }
        return maxWidth;
    }
    
    int getWidth(Nodes node , int level)
    {
        if(node == null)
        {
            return 0;
        }
        if(level == 1)
        {
            return 1;
        }
        else if(level > 1)
        {
            return getWidth(node.left , level - 1) + getWidth(node.right , level-1);
        }
        return 0;
    }
    
    int height(Nodes node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            int lheight = height(node.left);
            int rheight = height(node.right);
            return(lheight > rheight) ? (lheight+1):(rheight+1);
        }
    }
    
    public static void main(String args[])
    {
        BinaryTree_MWidth tree = new BinaryTree_MWidth();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(5);
        System.out.println("Maximum Width = "+tree.getMaxWidth(tree.root));

    }
}

    