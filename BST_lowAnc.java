class BST_lowAnc
{
    Nodes root;
    Nodes lca(Nodes node , int n1 , int n2)
    {
        if(node == null)
        {
            return null;
        }
        if(node.key > n1 && node.key > n2)
        {
            return lca(node.left , n1 , n2);
        }
        if(node.key < n1 && node.key < n2)
        {
            return lca(node.right , n1 , n2);
        }
        return node;
    }
    //element chhote or bade kb honge?
    public static void main(String args[])
    {
        BST_lowAnc tree = new BST_lowAnc();
        tree.root = new Nodes(20);
        tree.root.left = new Nodes(8);
        tree.root.right = new Nodes(22);
        tree.root.left.left = new Nodes(4);
        tree.root.left.right = new Nodes(12);
        tree.root.left.right.left = new Nodes(10);
        tree.root.left.right.right = new Nodes(14);
        int n1 = 10 , n2 = 14;
        Nodes t = tree.lca(tree.root , n1 , n2);
        System.out.println("LCA of "+n1+ " and "+n2+" is "+t.key);
        /*n1 = 14;
        n2 = 8;
         t = tree.lca(tree.root , n1 , n2);
        System.out.println("LCA of "+n1+ " and "+n2+" is "+t.data);
        n1 = 10; 
        n2 = 22;
        t = tree.lca(tree.root , n1 , n2);
        System.out.println("LCA of "+n1+ " and "+n2+" is "+t.data);*/
    }
}