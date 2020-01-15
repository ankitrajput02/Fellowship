package Program;
import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
		int n=arr.length;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number...\n");
		int num=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==num)
					{
						System.out.println("arr["+i+"]+arr["+j+"]+arr["+k+"]");
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+num);
					}
					
					
				}
			}
		}
		sc.close();
		
	}
}


