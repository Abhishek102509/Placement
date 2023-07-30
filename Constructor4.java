class Number
{
int a,b;
Number()
{
a=10;
b=20;
System.out.println("Class Number is initialized");
}
Number(Number N) 
{
a=N.a;
b=N.b;
System.out.println("Duplicate copy of class number is created");
}
void swap()
{
int temp;
temp=a;
a=b;
b=temp;
}
void showdata()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class Constructor4 
{
public static void main(String arg[])
{
Number N1=new Number();
Number N2=new Number(N1);
N1.showdata();
System.out.println("Actual data");
N2.showdata();
}
}


