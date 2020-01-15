package Program;
import java.util.Scanner;

public class Gambler 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter $Stack");
		int stack=sc.nextInt();
		System.out.println("Enter $Goal");
		int goal=sc.nextInt();
		System.out.println("How many Times you Want Play??");
		int num=sc.nextInt();
		int win=0,count=0;
		
			
			while(num >= count && stack > 0 && goal > stack)
			{
				double a=Math.random();
				if( a > 0.5)
				{
					win++;
				}
				else
				{
					stack--;
				}
			count++;
			}
			System.out.println("Win No "+win);
			System.out.println("Percentage of Win "+(double)win/num*100);
	}
			
}