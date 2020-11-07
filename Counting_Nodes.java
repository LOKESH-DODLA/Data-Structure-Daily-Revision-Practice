class Counting_Nodes
{

    void counting(Node node)
    {
        Node temp = node;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("No. of nodes = "+count);
    }
}