package Program;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Value Of A");
		double a=scan.nextDouble();
		System.out.println("Enter The Value Of B");
		double b=scan.nextDouble();
		System.out.println("Enter The Value Of C");
		double c=scan.nextDouble();
		double delta=b*b-4*a*c;
		double s=Math.sqrt(delta);
		System.out.println("Delta "+delta);
		double root1=(-b+s)/(2*a);
		System.out.println("Root 1 of X "+root1);
		double root2=(-b-s)/(2*a);
		System.out.println("Root 2 of X "+root2);
		
	}

}
