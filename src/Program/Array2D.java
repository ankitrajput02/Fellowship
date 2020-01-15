package Program;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Rows And Column ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		System.out.println("Enter "+m*n+" Elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("After Enter");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
