package Program;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year To Check Leap Or Not");
		int year=sc.nextInt();
		if(year < 1000 || year > 9999){
			System.out.println("Enter Valid Year");
			return;
		}
		else if(year % 400==0){
				System.out.println(year+" is Leap Year");
			}
			else if(year % 100 == 0){
				 System.out.println(year+" is Not Leap");
			}
			else if(year % 4 == 0){
				System.out.println(year+" is Leap Year");
			}
			else {
				System.out.println(year+" is Not Leap");
			}
		}
		
	}

