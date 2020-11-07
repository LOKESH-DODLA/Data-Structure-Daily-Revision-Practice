class AddingNodes
{
    Node addTwoList(Node first , Node second)
    {
        DNode res = null;
        DNode prev = null;
        DNode temp = null;
        int carry = 0 , sum;
        while(first != null || second != null)
        {
            sum = carry + (first != null ? first.data : 0) + (second != null ?second.data : 0);
            carry = (sum > 10)?1:0;
            sum = sum%10;
            temp = new Node(sum);
            if(res == null)
            {
                res = temp;
            }
            else
            {
                prev.next = temp;
            }
            prev = temp;
            if(first != null)
            {
                first = first.next;
            }
            if(second != null)
            {
                second = second.next;
            }
        }
        if(carry > 0)
        {
            temp.next = new Node(carry);
        }
        return res;
    }
}
            