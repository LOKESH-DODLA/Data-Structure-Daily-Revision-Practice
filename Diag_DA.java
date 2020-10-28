import java.util.Scanner;
class Diag_DA
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
        boolean diag = true;
        outer:
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                if(x==y && ar[x][y] == 0 || x != y && ar[x][y] != 0)
                {
                    diag = false;
                    break outer;
                }
            }
        }
        if(diag == true)
        {
            System.out.println("Diagonal Matrix ");
        }
        else
        {
            System.out.println("Not a Diagonal Matrix");
        }
    }
}
            
