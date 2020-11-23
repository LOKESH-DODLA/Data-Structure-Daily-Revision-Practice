class BST_minNode
{
    static Nodes head;
    Nodes insert(Nodes node , int key)
    {
        if(node == null)
        {
            return (new Nodes(key));
        }
        else
        {
            if(key <= node.key)
            {
                node.left = insert (node.left , key);
            }
            else
            {
                node.right = insert (node.right , key);
            }
            return node;
        }
    }
    int minValue(Nodes node)
    {
        Nodes current = node;
        while(current.left != null)
        {
            current = current.left;
        }
        return (current.key);
    }
    public static void main(String args[])
    {
        BST_minNode tree = new BST_minNode();
        Nodes root = null;
        root = tree.insert(root , 4);
        tree.insert(root , 2);
        tree.insert(root , 1);
        tree.insert(root , 3);
        tree.insert(root , 6);
        tree.insert(root , 4);
        System.out.println("Minimum Value "+tree.minValue(root));
    }
}