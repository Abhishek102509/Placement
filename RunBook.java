import java.util.Scanner;
class Book
{
    int PageNumber;
    float cp,sp;
    String BookName;
    Book()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Page Number,Book Name, Cost and Selling Price");
         BookName=scan.next();
        PageNumber=scan.nextInt();
        cp=scan.nextFloat();     
        sp=scan.nextFloat();
   }
void result()
{
 System.out.println("Book Name\t"+BookName);
 System.out.println("Page Number\t"+PageNumber);
if(sp>cp)
 System.out.println("Profit\t"+(sp-cp));
else if(cp>sp)
System.out.println("Loss\t"+(cp-sp));
else
System.out.println("No Profit No Loss");
}
}
class RunBook
{
public static void main(String args[])
{
Book B[]=new Book[3];
int i;
for(i=0;i<3;i++)
B[i]=new Book();
for(i=0;i<3;i++)
B[i].result();
}
}

                                                                                                                                                                                                                                                                                                                                                                                                                    