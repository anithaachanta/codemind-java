import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     float x1,y1,x2,y2;
     int t;
     t=sc.nextInt();
     while(t-->0)
     {
         x1=sc.nextInt();
         x2=sc.nextInt();
         y1=sc.nextInt();
         y2=sc.nextInt();
         if(y1/x1<y2/x2)
         System.out.println("-1");
         else if(y1/x1>y2/x2)
         System.out.println("1");
         else
         System.out.println("0");
     }
     sc.close();
    }
}