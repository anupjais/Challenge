import java.util.Scanner;
class StartsWithExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MyString str = new MyString("Hello world");
		System.out.print("Enter com data : ");
		String ch = sc.next();
		// if(str.startsWith(ch))
		System.out.println(str.startsWith(ch));

	}
}