class Hash_sumele
{
    static boolean hasArrayTwoSum(int A[] , int arr_size , int sum)
    {
        int l , r;
        l = 0;
        r = arr_size - 1;
        //For Sorted Arrays
        while(l < r)
        {
            if(A[l] +A[r] == sum)
            {
                return true;
            }
            else if(A[l] + A[r] < sum)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int A[] = {1,3,4,6,7};
        int n = 10;
        int arr_size = A.length;
        if(hasArrayTwoSum(A , arr_size , n))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}