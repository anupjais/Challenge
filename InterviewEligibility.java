import java.util.Scanner;
class InterviewEligibility
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage : ");
		float percentage = sc.nextFloat();
		System.out.println(eligibility(percentage));
	}
	public static String eligibility(float percentage)
	{
		if(percentage>=60)
			return "You are eligible for Interview";
		return "You are not eligible Interview";
	}
}