import java.util.Scanner;
import java.lang.Math;
class quadratic
{
 public static void main(String args[])
{
  int a,b,c;
  double det,root,root1,root2;
  Scanner myobj=new Scanner(System.in);
System.out.println("my name is archie");
System.out.println("my usn is 1bm23cs049");
  System.out.println("Enter the values of a,b,c:");
  a=myobj.nextInt();
  b=myobj.nextInt();
  c=myobj.nextInt();

  if(a==0)
  {
  System.out.println("It is not a quadratic equation");
  }
  else
  {
    det=(b*b)-(4*a*c);
    if(det>0)
    {
       root1=(((-b)+(Math.sqrt(det)))/(2*a));
       root2=(((-b)-(Math.sqrt(det)))/(2*a));
       System.out.println("It equation has real and distinct roots");
       System.out.println("The roots are"+root1+"and"+root2);
    }
    else if(det==0)
    {
     root=-b/(2*a);
     System.out.println("It equation has real and equal roots");
     System.out.println("The roots are"+root);
    }
    else
    {
     root1=(-b)/(2*a);
     root2=Math.sqrt(-det)/(2*a);
     System.out.println("It equation has imaginary roots");
     System.out.println("The roots are"+root1+"and"+root2);
    }
  }
}
}
