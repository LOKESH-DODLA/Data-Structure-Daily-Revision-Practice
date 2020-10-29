import java.util.Scanner;
class SingArBorPrint_DA
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of rows ");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns ");
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        int m=0;
        int s[]=new int[(2*(r+c))-1];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println("Enter a number ");
                ar[i][j] =  sc.nextInt();
                
            }
        }
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                if(x==0 || y==0 || x==(r-1) || y==(c-1))
                {
                    s[m] = ar[x][y];
                    m++;
                }
            }
        }
        boolean sorted=true;
        do
        {
            for(int i=0;i<s.length;i++)
            {
                sorted = true;
                if(s[i] > s[i+1])
                {
                    int temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                    sorted = false;
                }
            }
        }while(sorted == false);
        for(int y=0;y<=c-1;y++)
        {
            ar[0][y] = s[m++];
        }
        for(int x=1;x<=r-2;x++)
        {
            ar[x][c-1] = s[m++];
        }
        for(int y=c-1;y>=0;y--)
        {
            ar[r-1][y] = s[m++];
        }
        for(int x=r-2;x>=1;x--)
        {
            ar[x][c-1] = s[m++];
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
            
        
        
        
