package Program;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter First String...");
		//String str1=sc.next();
		System.out.println("Enter Second String...");
		String str2=sc.next();
		
		if(str1.length()==str2.length())
		{
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			for(int i=0;i<arr1.length;i++) 
			{
				if(arr1[i]>arr1[i+1]) {
				char temp=arr1[i];
				arr1[i]=arr1
			
			}
			}
			
			if()
			{
			System.out.println("Anagram");	
			}
			else
			{
			System.out.println("Strings are not Anagram");
			}
		}
	}
}
