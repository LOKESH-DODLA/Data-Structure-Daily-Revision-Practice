class BST_ce
{
    Nodes root;
    int Ceil(Nodes node , int input)
    {
        if(node == null)
        {
            return -1;
        }
        if(node.key == input)
        {
            return node.key;
        }
        if(node.key < input)
        {
            return Ceil(node.right , input);
        }
        int ceil = Ceil(node.left , input);
        return (ceil >= input) ? ceil : node.key;
    }
    public static void main(String args[])
    {
        BST_ce tree = new BST_ce();
        tree.root = new Nodes(8);
        tree.root.left = new Nodes(4);
        tree.root.right = new Nodes(12);
        tree.root.left.left = new Nodes(2);
        tree.root.left.right = new Nodes(6);
        tree.root.right.left = new Nodes(10);
        tree.root.right.right = new Nodes(14);
        for(int i = 0; i < 16; i++)
        {
            System.out.println(i+" "+tree.Ceil (tree.root , i));
        }
    }
}