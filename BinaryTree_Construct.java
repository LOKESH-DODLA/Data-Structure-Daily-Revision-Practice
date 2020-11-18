class BinaryTree_Construct
{
    Nodes root;
    static int preIndex = 0;
    Nodes buildTree(char in[] , char pre[] , int inStrt , int inEnd)
    {
        if(inStrt > inEnd)
        {
            return null;
        }
        Nodes tNode = new Nodes(pre[preIndex++]);
        if(inStrt == inEnd)
        {
            return tNode;
        }
        int inIndex = search(in , inStrt , inEnd , tNode.data);
        tNode.left = buildTree(in , pre , inStrt , inIndex-1);
        tNode.right = buildTree(in , pre , inIndex+1 , inEnd);
        return tNode;
    }
    
    int search(char arr[] , int strt , int end , char value)
    {
        int i;
        for(i = strt; i <= end; i++)
        {
            if(arr[i] == value)
            {
                return i;
            }
        }
        return i;
    }
    
    void printInOrder(Nodes node)
    {
        if(node == null)
        {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data+ " ");
        printInOrder(node.right);
    }
    
    public static void main(String args[])
    {
        BinaryTree_Construct tree = new BinaryTree_Construct();
        char in[]= {'D' , 'B' , 'E' , 'A' , 'F' , 'C'};
        char pre[] = {'A' , 'B' , 'D' , 'E' , 'C' , 'F'};
        int l = in.length;
        Nodes root = tree.buildTree(in , pre , 0 , l-1);
        
        System.out.println("\nInOrder Traversal");
        //tree.printInOrder();
    }
}
