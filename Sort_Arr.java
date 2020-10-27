import java.util.Scanner;
class Sort_Arr
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter no. of terms ");
        int n = sc.nextInt();
        String s[] = new String[n];
        int m[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter a name ");
            s[i] = sc.nextLine();
            String t = sc.nextLine();
            System.out.println("Enter a marks ");
            m[i] = sc.nextInt();
            
            
        }
        for(int x = 1; x<n ; x++)
        {
            String t = s[x];
            int t1 = m[x];
            int i = x;
            while(m[i-1] < t1)
            {
                m[i] = m[i-1];
                s[i] = s[i-1];
                i--;
                if(i==0)
                {
                    break;
                }
            }
            m[i] = t1;
            s[i] = t;
        }
        for(int i = 0; i<n;i++)
        {
            System.out.println((i+1)+ "\t" +s[i]+"\t"+m[i]);
        }
    }
}
        