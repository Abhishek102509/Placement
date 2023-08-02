  import java.util.Scanner;
class LargestNumber
{
int num1,num2,num3;
LargestNumber()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first number");
    num1=scan.nextInt();
    System.out.println("Enter the second number");
    num2=scan.nextInt();
    System.out.println("Enter the third number");
    num3=scan.nextInt();    
}
void LargestNumber()
{
    if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
            System.out.println("The second largest number is= "+num1);
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
            System.out.println("The second largest number is ="+num2);
        else
            System.out.println("The second largest number is= "+num3);
}
      public static void main(String args[])
      {
        LargestNumber obj = new LargestNumber();
        obj.LargestNumber();
      }

}