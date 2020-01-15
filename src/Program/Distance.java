package Program;
import java.util.Scanner;
import java.math.*;
public class Distance {
	int x,y;
	Distance(int a,int b){
		x=a;
		y=b;
		
		}
	
	public void calculate(){
		double result=Math.sqrt(x*x+y*y);
		System.out.println("Euclidean Distance "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Distance d1=new Distance(15,25),d2=new Distance(20,10);
		d1.calculate();
		d2.calculate();
		
	}

}
