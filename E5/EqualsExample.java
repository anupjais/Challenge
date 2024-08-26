import java.util.Scanner;
class EqualsExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MyString str = new MyString("Hello world");
		MyString ch = new MyString("   e");
		// MString ch = " jhfd";
		// System.out.print("Enter data for comparision : ");
		// String ch = sc.nextLine();
		// if(str.startsWith(ch))
		// System.out.println(str.equals(ch));
		System.out.println(str.concat(ch));

	}
}