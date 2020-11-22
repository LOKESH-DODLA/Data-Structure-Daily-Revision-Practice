class BST_kSmallEle
{
    static int count = 0;
    public static Nodes insert(Nodes node , int key)
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
    public static Nodes kthSmallest(Nodes root , int k)
    {
        if(root == null )
        {
            return null;
        }
        Nodes left = kthSmallest(root.left , k);
        if(left != null)
        {
            return left;
        }
        count++;
        if(count == k)
        {
            return root;
        }
        return kthSmallest(root.right , k);
    }
    public static void printKthSmallest(Nodes root , int k)
    {
        count = 0;
        Nodes res = kthSmallest(root , k);
        if(res == null)
        {
            System.out.println("There are less than k nodes");
        }
        else
        {
            System.out.println("Kth Smallest Element is "+res.key);
        }
    }
    public static void main (String args[])
    {
        Nodes root = null;
        int k[] = {20 , 8 , 22 , 4 , 12 , 10 , 14 };
        for(int x : k)
        {
            root = insert(root , x);
        }
        int d = 3;
        printKthSmallest(root , d);
    }
}