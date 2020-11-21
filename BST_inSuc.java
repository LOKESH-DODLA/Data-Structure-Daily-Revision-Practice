class BST_inSuc
{
    static Nodes head;
    Nodes insert (Nodes node , int key)
    {
        if(node == null)
        {
            return (new Nodes(key));
        }
        else
        {
            Nodes temp = null;
            if(key <= node.key)
            {
                temp = insert(node.left , key);
                node.left = temp;
                temp.parent  = node;
            }
            else
            {
                temp = insert(node.right , key);
                node.right = temp;
                temp.parent = node;
            }
            return node;
        }
    }
    Nodes inOrderSuccessor(Nodes root , Nodes n)
    {
        if(n.right != null)
        {
            return minValue(n.right);
        }
        Nodes p =n.parent;
        while(p != null && n == p.right)
        {
            n = p;
            p = p.parent;
        }
        return p;
    }
    Nodes minValue(Nodes node)
    {
        Nodes current = node;
        while(current.left != null)
        {
            current = current.left;
        }
        return current;
    }
    public static void main(String args[])
    {
        BST_inSuc tree = new BST_inSuc();
        Nodes root = null , temp = null, suc = null , min = null;
        root = tree.insert(root , 20);
        root = tree.insert(root , 8);
        root = tree.insert(root , 22);
        root = tree.insert(root , 4);
        root = tree.insert(root , 12);
        root = tree.insert(root , 10);
        root = tree.insert(root , 14);
        temp = root.left.right.right;
        suc = tree.inOrderSuccessor(root , temp);
        if(suc != null)
        {
            System.out.println("Inorder Successor of " +temp.key+" is "+suc.key);
        }
        else
        {
            System.out.println(" Inorder Successor does not exist ");
        }
    }
}