import java.util.Scanner;
class BinS_Rec
{
    int ar[] = new int[5];
    public void input()
    {
        for(int x=0; x<5; x++)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter a number");
            ar[x] = sc.nextInt();
        }
    }
    public int search (int n)
    {
        return b_search(0,4,n);
    }
    public int b_search(int min , int max , int n)
    {
        int mid = (min + max)/2;
        if(n == ar[mid])
        {
            return mid;
        }
        else if(n > ar[mid])
        {
            return b_search(mid+1 , max , n);
        }
        else
        {
            return b_search(min , mid-1 , n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be searched " );
        int n = sc.nextInt();
        BinS_Rec br = new BinS_Rec();
        br.input();
        System.out.println(br.search(2));
    }
}
        