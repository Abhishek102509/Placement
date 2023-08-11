class Number 
{
int a,b;
void getnumber(int x,int y)
{
a=x;
b=y;
}
}
class Data extends Number
{
int a,b;
void getdata(int x,int y)
{
a=x;
b=y;
}
void showdata()
{
System.out.println("value of Data class");
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("value of Number class");
System.out.println("a="+super.a);
System.out.println("b="+super.b);
}
}
class Testsuper1
{
public static void main (String args[])
{
Data D= new Data();
D.getnumber(10,20);
D.getdata(70,80);
D.showdata();
}
}