import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a,f,s,r,l;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    f=a/100;
    s=(a/10)%10;
    l=a%10;
    r=(l*100)+(s*10)+f;
    System.out.print(r);
  }
}