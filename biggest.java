import java.util.*;
public class biggest
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        f=sc.nextInt();
        g=sc.nextInt();
        h=sc.nextInt();
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        m=sc.nextInt();
        n=sc.nextInt();
        o=sc.nextInt();
        p=sc.nextInt();
       int b1=(int)Math.max(Math.max(a,b),Math.max(c,d));
       int b2=(int)Math.max(Math.max(e,f),Math.max(g,h));
       int b3=(int)Math.max(Math.max(i,j),Math.max(k,l));
       int b4=(int)Math.max(Math.max(m,n),Math.max(o,p));
       System.out.print("Biggest no. is"+Math.max(Math.max(b1,b2),Math.max(b3,b4)));
    }
}
