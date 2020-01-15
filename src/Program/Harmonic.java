package Program;
import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Harmonic Value ");
		int n=sc.nextInt();
		double result=1.0;
		if(n!=0 || n > 0){
			for(int i=1;i<=n;i++){
				result=result+1.0/i;
			}
			System.out.println(" "+result);
		}
		else{
			System.out.println("Enter Positive NonZero Number");
		}
		
		
	}

}
