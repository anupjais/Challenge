class ContentEqualsExample
{
	public static void main(String[] args)
	{
		MyString str = new MyString("Hello");
		MyString jj = new MyString("jj");

		// System.out.println(str.contentEquals(jj));
		System.out.println(str.contentEquals(""));
		System.out.println(str.contentEquals("Hello"));
		System.out.println(str.contentEquals("hello"));
	}
}