import java.util.Scanner;
class Factorial
{
    int n,i,fact=1;
    Factorial()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the factorial Number");
        n=scan.nextInt();

    }
    void fact()
    {
        for(i=2; i<=n; i++)
        fact=fact*i;
        System.out.println("factorial="+fact);
    }

    public static void main(String args[])   
   {   
    Factorial obj = new Factorial();
    obj.fact();
 }   

}