//requirement of this keyword of variable 
class Number 
{
int a,b;
void getdata(int a,int b)
{
a=a;
b=b;
}
void putdata()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class this1
{
public static void main (String args[])
{
Number N=new Number();
N.getdata(20,25);
N.putdata();
}
}


