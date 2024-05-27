import java.util.*;
class fibanacci
{
    public static void main(String[] args)
    {
        System.out.println("enter any term no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        int a = 0;
        int i=2;
        if (n ==1)
        {
            System.out.println(a1);
        }
        else if (n==2)
        {
            System.out.println(a2);
        } 
        else 
        {
            while(i<n)
                {
                    a = a1+a2;
                    i++;
                    a1 = a2;
                    a2 = a;
                }   
            System.out.println(a);
        }
        
    }
}