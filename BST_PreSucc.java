class BST_PreSucc
{
    static Nodes pre  = new Nodes() , suc = new Nodes ();
    static void findPreSuc(Nodes root , int key)
    {
        if(root == null)
        {
            return;
        }
        if(root.key == key)
        {
            if(root.left != null)
            {
                Nodes temp = root.left;
                while(temp.right != null)
                {
                    temp = temp.right;
                    
                }
                pre = temp;
            }
            if(root.right != null)
            {
                Node temp = root.right;
                while(temp.left != null)
                {
                    temp = temp.left;
                    
                }
                suc = temp;
            }
            return ;
        }
        if(root.key > key)
        {
            suc = root;
            findPreSuc(root.left , key);
        }
        else
        {
            pre = root;
            findPreSuc(root.right , key);
        }
    }
    static Nodes insert(Nodes node , int key)
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
    public static void main(String args[])
    {
        int key = 65;
        Nodes root = new Nodes();
        root = insert(root , 50);
        insert(root , 30);
        insert(root , 20);
        insert(root , 40);
        insert(root , 70);
        insert(root , 60);
        insert(root , 80);
        findPreSuc(root , key);
        if(pre != null)
        {
            System.out.println("Predecessor is "+pre.key);
        }
        else
        {
            System.out.println("No Predecessor ");
        }
        if(suc != null)
        {
            System.out.println("Successor is "+pre.key);
        }
        else
        {
            System.out.println("No Successor ");
        }
    }
}