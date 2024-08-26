import java.util.Scanner;
class StrEvnOdd
{
	public static boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter even/odd : ");
		int num = sc.nextInt();
		String flag = isEven(num)?"Even":"Odd";
		System.out.println(num+" is : \'"+flag+"\'");
	}
}