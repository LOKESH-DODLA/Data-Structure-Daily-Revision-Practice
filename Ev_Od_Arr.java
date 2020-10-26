import java.util.Scanner;
class Ev_Od_Arr
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
        int ce=0 , co=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]%2==0)
            {
                ce++;
            }
            else
            {
                co++;
            }
        }
        System.out.println("Even Number "+ce);
        System.out.println("Odd Numbers "+co);
    }
}
