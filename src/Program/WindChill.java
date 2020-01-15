package Program;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature(In Fahrenheit) ");
		double t=scan.nextDouble();
		System.out.println("Enter Wind Speed(in miles Per hour)");
		double v=scan.nextDouble();
		//double w=(35.74+(0.6215*t))- (35.75 * v) +(-0.4275*t*v);
		
		System.out.println("Temp is "+t+"Wind Speed "+v+"Wind Chill "+w);
	}

}
