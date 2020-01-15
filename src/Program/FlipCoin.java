package Program;
import java.util.Random;
import java.util.*;
public class FlipCoin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head=0,tail=0,counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many times You Want Flip Coin??");
		int n=sc.nextInt();
		/*if(n>0) {
			for(int i=0;i<n;i++) {
				if(Math.random() < 0.5) {
					tail+=1;
				}.                                                                                                                                                         
				else {
					head+=1;
				}
			}
			System.out.println(head);
			System.out.println(tail);
			System.out.println("Percentage of Head "+(double)head/n*100);
			System.out.println("Percentage of Tail "+(double)tail/n*100);
		}*/
		if(n>0) 
		{
			while(counter < n) 
			{
				if(Math.random() < 0.5) {
					tail+=1;
				}
				else {
					head+=1;
				}
			counter++;
			}
			
			System.out.println(head);
			System.out.println(tail);
			System.out.println("Percentage of Head "+(double)head/n*100);
			System.out.println("Percentage of Tail "+(double)tail/n*100);
		}
	}
}
