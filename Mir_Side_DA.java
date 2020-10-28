import java.util.Scanner;
class Mir_Side_DA
{
    public static void main(String args [])
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
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.print("\t");
            for(int j=c-1;j>=0;j--)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
