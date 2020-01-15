package Program;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int i=1,result=1;
		while(i<=num)
		{	
			if(i==1)
				System.out.print(i);
			else
				System.out.print("x"+i);
			result=result*i;
			i++;
		}
		System.out.println("\nResult is "+result);
		
	}

}
