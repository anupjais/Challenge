class Demo
{
	/*String str="";
	Demo()
	{
		str=null;
	}
	Demo(String str)
	{
		this.str = str;
	}*/
	public static void main(String[] args) 
	{
		// System.out.println("Hello".equalsIgnoreCase("heLL"));
		// System.out.println("Hello".charAt(11));
		// System.out.println("Hello".codePointCount(0,-1));
		// System.out.println("Hello".indexOf('l'));
		// System.out.println("Helelllllllo".lastIndexOf('l'));
		// System.out.println("Hello".substring(3,4).toUpperCase());
		// Demo d = new Demo("Anup");
		// System.out.println(d.concat(" Kumar"));



		 MyString str = new MyString("Hello World");
		 System.out.println(str.concat(" HTML"));
	}
	/*public Demo concat(Demo nstr)
	{
		String newStr = nstr.str;
		newStr = str+newStr;
		return new Demo(newStr);
	}*/
}