import java.util.*;
class Factorial
{
public static void main(String args[])
{

	int number;
	long fact;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Value");
	number=Integer.parseInt(input.next());
	fact=multiplynum(number);
	System.out.println("Factorial of "+ number +" is : " + fact);
}
public static long multiplynum(int num)
{
if (num>=1)
{

	return num*multiplynum(num -1);
}
else 
{ return 1;
}
}
}
