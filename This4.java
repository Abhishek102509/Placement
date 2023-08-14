class Data
{
void show()
{
System.out.println("This is method show");
}
void msg()
{
System.out.println("This is method msg");
}
void display()
{
this.show();
System.out.println("This is method display");
this.msg();
}
}
class This4
{
public static void main (String args [])
{
new Data ().display();
}
}