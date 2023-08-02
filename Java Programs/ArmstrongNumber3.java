import  java.util.Scanner;
class  DigitCount
{
 public static int calculateArmstrong(long input)
{
 int Count=1;
 while((input=input/10)>0)
{
 Count++;
}
 return Count;
}
} 
 class SumOfDigit extends DigitCount
{
 public static long calculateArmstrong(long input,int digitCount)
{
long sum=0;
long num=input;
while(num>0)
{
 long rem=num%10;
 sum+=Math.pow(rem,digitCount);
 num=num/10;
}
 return sum;
}
}
 class ArmstrongNumber3
{
 public static void main(String args[])
{
 Scanner scanner=new Scanner(System.in);
 String str=scanner.nextLine();
 long input=Long.parseLong(str);
 SumOfDigit sod= new SumOfDigit();
 int digitCount=sod.calculateArmstrong(input);
 long SumOfDigits=sod.calculateArmstrong(input,digitCount);
 if(input==SumOfDigits)
{
 System.out.println(input+" is an armstrong number");
}
 else
{
  System.out.println(input+" is Not an Armstrong number");
}
}
}
