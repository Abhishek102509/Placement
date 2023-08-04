import java.util.Scanner;
class Employee
{
int ecode;
String ename;
float basicsal,hra,da,ta,lic,ept,netsal,epf;
void getEmp()
{
Scanner scan= new Scanner(System.in);
System.out.println("Entre Employee code,Name,Basic Salary");
ecode=scan.nextInt();
ename=scan.next();
basicsal=scan.nextFloat();
}
void payslip()
{
hra=(basicsal*25)/100;
da=(basicsal*30)/100;
ta=(basicsal*15)/100;
lic=(basicsal*7)/100;
epf=(basicsal*17)/100;
netsal=basicsal+hra+da+ta-lic-epf;
System.out.println("Employee Name\t"+ename);
System.out.println("Employee code\t"+ecode);
System.out.println("Basic salary\t"+basicsal);
System.out.println("Net salary\t"+netsal);
if(basicsal>=7000)
System.out.println("class I Employee");
else if (basicsal>=5000)
System.out.println("class II Employee");
else if(basicsal>=4000)
System.out.println("class III Employee");
else
System.out.println("class IV Employee");
System.out.println("_____________________");
}
}
class payslip
{
public static void main(String arg[])
{
Employee emp1= new Employee();
Employee emp2= new Employee();
Employee emp3= new Employee();
emp1.getEmp();
emp2.getEmp();
emp3.getEmp();
emp1.payslip();
emp2.payslip();
emp3.payslip();
}
}