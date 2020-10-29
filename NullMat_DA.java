import java.util.Scanner;
class NullMat_DA
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
        int count = 0;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(ar[i][j] == 0)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        if(count == (r*c))
        {
            System.out.println("Null Matrix");
        }
        else
        {
            System.out.println("Not A Null Matrix ");
        }
    }
}
