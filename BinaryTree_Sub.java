class BinaryTree_Sub
{
    Nodes root1 , root2;
    boolean areIdentical(Nodes root1 , Nodes root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }
        if(root1 == null || root2 == null)
        {
            return false;
        }
        return (root1.data == root2.data && areIdentical(root1.left , root2.left) && areIdentical(root1.right , root2.right));
    }
    boolean isSubtree(Nodes T , Nodes S)
    {
        if(S == null)
        {
            return true;
        }
        if(T == null)
        {
            return false;
        }
        if(areIdentical(T,S))
        {
            return true;
        }
        return isSubtree(T.left , S) || isSubtree(T.right , S);
    }
    
    public static void main(String args[])
    {
        BinaryTree_Sub tree = new BinaryTree_Sub();
        tree.root1 = new Nodes(1);
        tree.root1.left = new Nodes(2);
        tree.root1.right = new Nodes(3);
        tree.root1.left.left = new Nodes(4);
        tree.root1.left.right = new Nodes(5);
        tree.root2 = new Nodes(1);
        tree.root2.left = new Nodes(2);
        tree.root2.right = new Nodes(3);
        if(tree.isSubtree(tree.root1 , tree.root2))
        {
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
        }
    }
}