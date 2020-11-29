class Graph_MoneyFrnd
{
    static final int  N = 3;
    static int getMin(int arr[])
    {
        int minInd = 0;
        for(int i = 1; i < N; i++)
        {
            if(arr[i] < arr[minInd])
            {
                minInd = i;
            }
        }
        return minInd;
    }
    static int getMax (int arr[])
    {
        int maxInd = 0;
        for(int i = 1; i < N; i++)
        {
            if(arr[i] > arr[maxInd])
            {
                maxInd = i;
            }
        }
        return maxInd;
    }
    static int minOf2(int x , int y)
    {
        return (x < y) ? x : y;
    }
    static void minCashFlowRec(int amt[])
    {
        int maxcre = getMax(amt) , maxdeb = getMin(amt);
        if(amt[maxcre] == 0 && amt[maxdeb] == 0)
        {
            return;
        }
        int min = minOf2(-amt[maxdeb] , amt[maxcre]);
        amt[maxcre] -= min;
        amt[maxdeb] += min;
        System.out.println("Person "+maxdeb+" pays "+ min+ " to "+" Person "+maxcre);
        minCashFlowRec(amt);
    }
    static void minCashFlow(int g[][])
    {
        int amt[] = new int [N];
        for(int p = 0; p < N; p++)
        {
            for(int i = 0; i < N; i++)
            {
                amt[p] += (g[i][p] - g[p][i]);
            }
        }
        minCashFlowRec(amt);
    }
    public static void main(String args[])
    {
        int g[][] = { {0 , 1000 , 2000} , {0 , 0 ,5000} , {0 , 0 ,0} , };
        minCashFlow(g);
    }
}