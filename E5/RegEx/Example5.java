import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Example5
{
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("[^A-Z]");
		Matcher matcher = pattern.matcher("Ab!c1De@f2Gh#i3Jk$l4");
		while(matcher.find())
		{
			System.out.println("["+matcher.start()+","+matcher.end()+") -> "+matcher.group());
		}
	}
}