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
		String newStr = str.toString()+str1.str;
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
// 7.2...
	public MyString substring(int begin, int end)
	{
		if(begin>end || begin<0 || end>=str.length())
			throw new StringIndexOutOfBoundsException("Either "+begin+" or "+end+" is or both are incorrect.");
		String newStr = "";
		while(begin<end)
		{
			newStr += str.charAt(begin++);
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

// 11.
	public boolean isEmpty()
	{
		if(str.length()==0)
			return true;
		return false;
	}
// 12.
	public boolean equalsIgnoreCase(StringBuffer sb)
	{
		if(str.length()!=sb.length())
			return false;

		String str1 = str.toLowerCase();
		sb=new StringBuffer((sb.toString()).toLowerCase());

		for(int i=0; i<str.length(); i++)
			if(str.charAt(i)!=sb.charAt(i))
				return false;

		return true;
	}
// 13.
	/*
	public boolean matches(String regex)
	{

	}*/
// 14.
	public char charAt(int indx)
	{
		if(indx<0 || indx>=str.length())
			throw new StringIndexOutOfBoundsException("Wrong Index");
		return str.charAt(indx);
	}
// 15.
	public int codePointAt(int indx)
	{
		if(indx<0 || indx>=str.length())
			throw new StringIndexOutOfBoundsException("Wrong Index");
		return str.charAt(indx);
	}
// 16.
	public int codePointBefore(int indx)
	{
		if(indx<1 || indx>str.length())
			throw new StringIndexOutOfBoundsException("Wrong Index");
		return str.charAt(indx-1);
	}
// 17.
	public int codePointcount(int indx)
	{
		if((indx<0 || indx>=str.length()))
			throw new IndexOutOfBoundsException("Wrong Index");
		return (str.length()-indx)-1;
	}
// 17.2...
	public int codePointcount(int begin, int end)
	{
		if((begin<0 || begin>=str.length()) || begin>end)
			throw new IndexOutOfBoundsException("Wrong Index");
		return end-begin;
	}
// 18.
	public int indexOf(char ch)
	{
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
				return i;
		}
		return -1;
	}
// 19.
	public int lastIndexOf(char ch)
	{
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i)==ch)
				return i;
		}
		return -1;
	}


// // Have some Work
// // 21.
// 	public String concat(MyString nstr)
// 	{
// 		return str+nstr.str;
// 	}
// // Have some Work
// 22.
	/*
	public String[] split(String regex)
	{
		ArrayList list = new ArrayList();
		String newStr="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==regex)
			{
				list.append(newStr);
				newStr="";
			}
			else{
				newStr += str.charAt(i);
			}
		}
		return ;
	}*/
// 23.
	public MyString toLowerCase()
	{
		String newStr="";
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)>=97 || str.charAt(i)<=122)
				newStr += (char)str.charAt(i)-32;
			else
				newStr += str.charAt(i);
		}
		return new MyString(newStr);
	}
// 24.
	public MyString toUpperCase()
	{
		String newStr="";
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)>=65 || str.charAt(i)<=90)
				newStr += (char)str.charAt(i)+32;
			else
				newStr += str.charAt(i);
		}
		return new MyString(newStr);
	}
// 25.
	public char[] toCharArray()
	{
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			arr[i]=str.charAt(i);
		}
		return arr;
	}

}