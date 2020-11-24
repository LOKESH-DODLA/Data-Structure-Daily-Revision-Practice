class BST_swapNode
{
    Nodes first , middle, last , prev;
    void correctBSTUtil(Nodes root)
    {
        if(root!=null)
        {
            correctBSTUtil(root.left);
            if(prev != null && root.data < prev.data)
            {
                if(first == null)
                {
                    first = prev;
                    middle = root;
                }
                else
                {
                    last = root;
                }
            }
            prev = root;
            correctBSTUtil(root.right);
        }
    }

    void correctBST(Nodes root)
    {
        first = middle = last = prev = null;
        
        correctBSTUtil(root);
        if(first != null && last != null)
        {
            int temp = first.key;
            first.key = last.key;
            last.key = temp;
        }
        else if(first != null && middle != null)
        {
            int temp = first.key;
            first.key = middle.key;
            middle.key = temp;
        }
    }

    void printInorder(Nodes node)
    {
        if(node == null)
        {
            return;
        }
        printInorder(node.left);
        System.out.println(node.key+" ");
        printInorder(node.right);
    }

    public static void main(String args[])
    {
        
        Nodes root = new Nodes(6);
        root.left = new Nodes(10);
        root.right = new Nodes(2);
        root.left.left = new Nodes(1);
        root.left.right = new Nodes(3);
        root.right.right = new Nodes(12);
        root.right.left = new Nodes(7);
        System.out.println("Inorder ");
        BST_swapNode tree = new BST_swapNode();
        tree.printInorder(root);
        tree.correctBST(root);
        System.out.println("Inorder after swap");
        tree.printInorder(root);
    }
}