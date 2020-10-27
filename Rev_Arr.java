import java.util.Scanner;
class Rev_Arr
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of terms ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter a number");
            ar[i] = sc.nextInt();
        }
        for(int i = n-1 ; i >=0; i--)
        {
            System.out.println(ar[i]+" ");
            
        }
    }
}