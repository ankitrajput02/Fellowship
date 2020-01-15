package Program;
import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("STOPWATCH\n1.Start\n2.Stop\n3.Exit..");
		int n=sc.nextInt();
		long start=0,end=0,value=0;
		if(n==1)
		{
		start=System.currentTimeMillis();
		}
		int n1=sc.nextInt();
		if(n1==2)
		{
			end=System.currentTimeMillis();	
			value=end-start;
			System.out.println(value/1000);
		}
		else{
			return;
		}
	}

}
