import  java.util.Scanner;
class  DigitCount
{
 public static int calculateArmstrong(long inputNo)
{
 int Count=1;
 while((inputNo=inputNo/10)>0)
{
 Count++;
}
 return Count;
}
} 
 class SumOfDigit extends DigitCount
{
 public static long calculateArmstrong(long inputNo,int digitCount)
{
long sum=0;
long num=inputNo;
while(num>0)
{
 long remainder=num%10;
 sum+=Math.pow(remainder,digitCount);
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
 long inputNo=Long.parseLong(str);
 SumOfDigit sod= new SumOfDigit();
 int digitCount=sod.calculateArmstrong(inputNo);
 long SumOfDigits=sod.calculateArmstrong(inputNo,digitCount);
 if(inputNo==SumOfDigits)
{
 System.out.println(inputNo+"is an armstrong number");
}
 else
{
  System.out.println(inputNo+"is Not an Armstrong number");
}
}
}