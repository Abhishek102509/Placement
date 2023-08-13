class Number
{
int a,b,c;
Number ()
{
this(10);
System.out.println("Constructor1");
}
Number (int x)
{
//System.out.println("Hello");
this (x,20);
System.out.println("Constructor2");
}
Number(int x, int y)
{
this (x,y,30);
System.out.println("Constructor3");
}
Number(int x, int y,int z)
{
a=x;
b=y;
c=z;
System.out.println("Constructor4");
}
void showdata()
{
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
}
}
class This3
{
public static void main(String args[])
{
Number N=new Number();
N.showdata();
}
}