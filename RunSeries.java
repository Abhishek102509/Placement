/*
WAP to create a class Series that containns 3 attributes a,d,n and method for input , now create 2 sub
class named as APSeries and GPSeries to print respective series.
AP Series => a , (a+d), (a+2d), (a+3d), (a+4d),... (a+(n-1)d)
GP Series => a , (ar), (ar^2), (ar^3), (ar^4),... (a+r^(n-1))
(Hierarichal Inheritance)
*/
class Series
{
int a,d,n;
void getdata(int x,int y,int z)
{
a=x;
d=y;
n=z;
}
void putdata()
{
System.out.println("a="+a);
System.out.println("d="+d);
System.out.println("n="+n);
}
}
class APSeries extends Series
{
int T,i;
void printAP()
{
System.out.println("AP Series");
for(i=0;i<n;i++)
{
T=a+(i*d);
System.out.println(T);
}
System.out.println("End of AP Series");
}
}
class GPSeries extends Series
{
int T,i;
void printGP()
{
System.out.println("GP Series");
for(i=0;i<n;i++)
{
T=(int) (a*Math.pow(d,i));
System.out.println(T);
}
System.out.println("End of GP Series");
}
}
class RunSeries
{
public static void main(String[] args)
{
APSeries ap=new APSeries();
GPSeries gp=new GPSeries();
ap.getdata(10,5,8);
gp.getdata(3,2,8);
ap.printAP();
gp.printGP();
}
}