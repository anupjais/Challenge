import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Example2
{
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("[abc]");
		Matcher matcher = pattern.matcher("Ab!c1De@f2Gh#i3Jk$l4");
		while(matcher.find())
		{
			System.out.println("["+matcher.start()+","+matcher.end()+") -> "+matcher.group());
		}
	}
}