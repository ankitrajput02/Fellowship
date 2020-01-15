package Program;
import java.util.Scanner;

public class CouponNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Random no you want?");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++){
			int rnum=(int)(Math.random()*max);
			System.out.println(rnum);
			
		}
	}

}
