import java.util.Scanner;
public class Sum_Avg_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ar[] = new int[n];
        int sum = 0;
        int avg = 0;
        for(int i = 0 ; i < n; i++)
        {
            System.out.println("Enter a number");
            ar[i] = sc.nextInt();
            sum = sum + ar[i];
        }
        avg = sum/n;
        for(int i = 0; i < n; i++)
        {
            System.out.println(ar[i]+" ");
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
        
        