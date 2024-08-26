import java.util.*;
class SplitDemo
{
	static String str;
	public static void main(String[] args) 
	{
		str="hi jj io hi";
		String[] arr = str.msplit(" ");
		System.out.println(Arrays.toString(arr));
	}
	public static String[] msplit(String rg)
	{
		ArrayList list = new ArrayList();
		char ch=rg.charAt(0);
		int t=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				list.add(str.substring(t,i));
				t=i;
			}
		}
		return list;
	}
}