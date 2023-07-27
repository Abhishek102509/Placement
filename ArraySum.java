class ArraySum
{
public static void main(String args[])
{
int ar[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int even=0,Odd=0,sum=0;
for(int i=0; i<ar.length; i++)
{
if (i%2==0)
even+=ar[i];
else
Odd+=ar[i];
}
System.out.println("Sum of even="+even);
System.out.println("Sum of Odd="+Odd);
}
}