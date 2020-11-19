class BinaryTree_LevelOrder
{
    Nodes root;
    public BinaryTree_LevelOrder()
    {
        root = null;
    }

    void printLevelOrder()
    {
        int h = height(root);
        int i ;
        for(i=1; i<=h ; i++)
        {
            printGivenLevel(root , i);

        }
    }

    int height(Nodes root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int lh = height(root.left);
            int rh = height(root.right);

            if(lh > rh)
            {
                return (lh+1);
            }
            else
            {
                return (rh+1);
            }
        }
    }

    void printGivenLevel(Nodes root , int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == 1)
        {
            System.out.print(root.key+" ");
        }
        else if(level > 1)
        {
            printGivenLevel(root.left , level-1);
            printGivenLevel(root.right , level-1);
        }
    }

    public static void main(String args[])
    {
        BinaryTree_LevelOrder tree = new BinaryTree_LevelOrder();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(5);
        System.out.println("Level Order Traversal");
        tree.printLevelOrder();
    }
}