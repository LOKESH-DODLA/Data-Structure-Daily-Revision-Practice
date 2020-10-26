import java.util.Scanner;
class Find_Arr
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
        System.out.println("Enter number to be searched");
        int x = sc.nextInt();
        boolean found  = false;
        for(int i = 0; i<n; i++)
        {
            if(ar[i] == x)
            {
                found = true;
                break;
            }
        }
        if(found == true )
        {
            System.out.println("Element Found ");
        }
        else
        {
            System.out.println("Element not Found ");
        }
    }
}