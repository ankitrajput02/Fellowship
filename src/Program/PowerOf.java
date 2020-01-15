package Program;
import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		int N=sc.nextInt();
		int power=1;
		if(N>=0 && N < 31){
			for(int i=0;i<N;i++)
			{
			power=power*2;
			}
		System.out.println("2^"+N+"="+power);
		}
		else
		{
		System.out.println("Enter Valid Number");
		}
	}

}
