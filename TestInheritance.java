//Program to demonstration of Inheritance(Single Inheritance)
class Base
{
private int a;//private variable can not be inherit
int b;// default
protected int c;
public int d;
void geta(int x)
{
a=x;
}
void getbcd(int x,int y, int z)
{
b=x;
c=y;
d=z;
}
void puta()
{
System.out.println("a="+a);
}
void putbcd()
{
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
}
}
class Derived extends Base
{
int e,f;
void getef(int x,int y)
{
e=x;
f=y;
}
void putef()
{
System.out.println("e="+e+"\nf="+f);
}
void showall()
{
System.out.println("Method showall");
//System.out.println("a="+a); Compile Time Exception
System.out.println("b="+b);//base class Variable
System.out.println("c="+c);//base class Variable
System.out.println("d="+d);//base class Variable   
System.out.println("e="+e);//Derived class Variable
System.out.println("f="+f);//Derived class Variable
}
}
class TestInheritance
{
public static void main(String args[])
{
Base B=new Base();
Derived D=new Derived();
B.geta(10);
B.getbcd(20,30,40);
D.getbcd(55,65,75);
D.getef(85,95);
B.puta();
B.putbcd();
D.putbcd();
D.putef();
D.showall();
//B.showall();Error
System.out.println("b="+B.b);
System.out.println("b="+D.b);
//System.out.println("b="+b);Error
}
}