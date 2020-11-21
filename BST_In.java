class BST_In
{
    Nodes root;
    BST_In()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root , key);
    }
    Nodes insertRec(Nodes root , int key)
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
        BST_In tree = new BST_In();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
    }
}
