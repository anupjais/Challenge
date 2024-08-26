import java.util.Arrays;
class MyString
{
	String str = null;
	MyString()
	{

	}
	MyString(String str)
	{
		this.str = str;
	}

// 1.
	public int length()
	{
		int count = 0;
		for(int i=0; ; i++)
		{
			try{
				str.charAt(i);
				count++;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				break;
			}
		}
		return count;
	}
// 2.
	public boolean startsWith(String ch)
	{
		if(ch.length()>str.length())
			throw new StringIndexOutOfBoundsException(ch+" length is higher than "+str);
		for(int i=0; i<ch.length(); i++)
		{
			// String c1 = str.charAt(i);
			// String c2 = ch.charAt(i);
			// if(!(c1.equals(c2))
			if(!(str.charAt(i)==ch.charAt(i)))
				return false;
		}
		return true;
	}
// 3.
	public boolean equals(String str1)
	{
		if(str.length()!=str1.length())
			return false;
		for(int i=0; i<str1.length(); i++)
		{
			if(str.charAt(i)!=str1.charAt(i))
				return false;
		}
		return true;
	}
// 4.
// Have some work
	public MyString concat(MyString str1)
	{
		// MyString newStr = str+str1.str;
		return new MyString(str1.str);
		// return newStr;
	}
// 5.
	public String toString()
	{
		return this.str;
	}
// 6.
// Have Some Work
	public String trim()
	{
		boolean strt=false;
		boolean end=false;
		int sIndx = 0;
		int eIndx = 0;
		for(int i=0; i<str.length(); i++)
		{
			// if(!)
		}
		return "Anup";
	}

// 7.
	public MyString substring(int indx)
	{
		// char[] arr = str.toCharArray();
		String newStr = "";
		if(indx<0 || indx>=str.length())
			throw new StringIndexOutOfBoundsException("Wrong Index");
		while(indx<str.length())
		{
			newStr = newStr+str.charAt(indx++);
		}
		return new MyString(newStr);
	}

// 8.
	public boolean contentEquals(String str1)
	{
		// if(str1.str.length()!=str.length())
		if(str1.length()!=str.length())
			return false;
		for(int i=0; i<str.length(); i++)
		{
			// if(str.charAt(i)!=str1.str.charAt(i))
			if(str.charAt(i)!=str1.charAt(i))
				return false;
		}
		return true;
	}

// 9.
// Have Some Work
	public int compareTo(String str1)
	{
		// for(int i=0; i<str.length();i++)
		// {

		// }
		// return (str.charAt(0))-(str1.str.charAt(0));
		return 1;
	}

// 10.
	public MyString replace(char old, char neww)
	{
		char[] arr = str.toCharArray();
		String newStr = "";
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==old)
				arr[i]=neww;
			newStr += arr[i];
		}
		// newStr = arr;
		System.out.println(Arrays.toString(arr));
		return new MyString(newStr);
		// return new MyString("Anup");
	}
}