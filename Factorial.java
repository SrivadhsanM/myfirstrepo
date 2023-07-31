import java.util.*;
class Factorial
{
public static void main(String args[])
{

	int i,fact=1,number;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Value");
	number=Integer.parseInt(input.next());
	for(i=1;i<=number;i++)
	{

		fact=fact*i;
	}
	System.out.println("Factorial of "+ number +" is : " + fact);
}

}
