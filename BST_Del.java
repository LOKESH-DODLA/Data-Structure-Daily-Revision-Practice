class BST_Del
{
    Nodes root;
    BST_Del()
    {
        root = null;
    }

    void deleteKey(int key)
    {
        root = deleteRec(root , key);
    }

    Nodes deleteRec(Nodes root , int key)
    {
        if(root == null)
        {
            return root;
        }
        if(key < root.key)
        {
            root.left = deleteRec(root.left , key);
        }
        else if(key > root.key)
        {
            root.right = deleteRec(root.right , key);
        }
        else
        {
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right , root.key);
        }
        return root;
    }

    int minValue(Nodes root)
    {
        int minv = root.key;
        while(root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void insert(int key)
    {
        root = insertRec(root , key);
    }

    Nodes insertRec(Nodes root, int key)
    {
        if(root == null)
        {
            root = new Nodes(key);
            return root;
        }
        if(key < root.key)
        {
            root.left = insertRec(root.left , key);
        }
        else if(key > root.key)
        {
            root.right = insertRec(root.right , key);
        }
        return root;
    }

    void inorder()
    {
        inorderRec(root);
    }

    void inorderRec(Nodes root)
    {
        if(root != null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);

        }
    }
    public static void main(String args[])
    {
        BST_Del tree = new BST_Del();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("Inorder ");
        tree.inorder();
        System.out.println("Delete 20");
        tree.deleteKey(20);
        System.out.println("Inorder ");
        tree.inorder();
        System.out.println("Delete 30");
        tree.deleteKey(30);
        System.out.println("Inorder ");
        tree.inorder();
        System.out.println("Delete 50");
        tree.deleteKey(50);
        System.out.println("Inorder ");
        tree.inorder();
    }
}