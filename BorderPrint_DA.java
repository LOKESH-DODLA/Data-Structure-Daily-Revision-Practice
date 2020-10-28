import java.util.Scanner;
class BorderPrint_DA
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of rows ");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns ");
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.println("Enter a number ");
                ar[i][j] =  sc.nextInt();
                
            }
        }
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(i==0 || j==0 || i==(r-1) || j==(c-1))
                {
                    System.out.print(ar[i][j]+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
