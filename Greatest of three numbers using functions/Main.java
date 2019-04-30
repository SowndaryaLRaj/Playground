import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      
      int a,b,c;
      a=in.nextInt();
      b=in.nextInt();
      c=in.nextInt();
      int grt=fun(a,b);
     
        System.out.print(fun(grt,c));
    }
      public static int fun(int m,int n)
      {
        int g;
        if(m<=n)
          g=n;
        else 
          g=m;
        return g;
      }
}