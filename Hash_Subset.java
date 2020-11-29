class Hash_Subset
{
    static boolean isSubset(int ar1[] , int ar2[] , int m, int n)
    {
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < m; j++)
            {
                if(ar2[i] == ar1[j])
                {
                    break;
                }
            }
        }
        if(j == m)
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int ar1[] = {11 , 1 , 3 , 21 , 13 , 3 , 7};
        int ar2[] = {11 , 3 , 7 , 1};
        int m = ar1.length;
        int n = ar2.length;
        if(isSubset(ar1 , ar2 , m , n))
        {
            System.out.println("Yes , It is a Subset");
        }
        else
        {
            System.out.println("No , It is not a Subset");
        }
    }
}