package Program;
public class Permutation
{
	static public void StringPermutation(String input){
		StringPermutation("" , input);
	}
	private static void StringPermutation(String permutation,String input){
		if(input.length()==0){
			System.out.println(permutation);
		}
		else{
			for(int i=0;i<input.length();i++){
				StringPermutation(permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1, input.length()));
			}
		}
	}
	public static void main(String[] args){
		StringPermutation("Ankit");
	}
}








/*
  import java.util.Scanner;
 

public class Permutation 
{
	static String swap1(String str, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char[] charArray=str.toCharArray();
		temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}

	private static void permute(String str, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r)
		{
			System.out.println(str);
		}
		else
		{
		
		for(int i=l;i<r;i++)
		{
			str=swap1(str,l,r);
			permute(str,l+1,r);
			str=swap1(str,l,r);
		}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String...\n");
		String str=sc.next();
		int n=str.length();
		
		//StringPermutation sp=new StringPermutation();
		StringPermutation.permute(str,0,n-1);
		sc.close();
	}
}*/