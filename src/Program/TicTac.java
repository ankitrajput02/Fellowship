package Program;
import java.util.Scanner;

public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard={{'|','-','-','-','-','-','|'},
							{'|',' ','|',' ','|',' ','|'},
							{'|','-','+','-','+','-','|'},
							{'|',' ','|',' ','|',' ','|'},
							{'|','-','+','-','+','-','|'},
							{'|',' ','|',' ','|',' ','|'},
							{'|','-','-','-','-','-','|'},
							};
		printGameBoard(gameBoard);
		while(true){
		
		int num=9;
		while(num>=0){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position");
		int pos=sc.nextInt();
		System.out.println(pos);
		if(num%2==0)
		{
		placeSymbol(gameBoard,pos,"Player 1");
		printGameBoard(gameBoard);
		num--;
		}
		else{
		placeSymbol(gameBoard,pos,"Player 2");
		printGameBoard(gameBoard);
		num--;
		}
		}
		
	}
	}
		public static void printGameBoard(char[][] gameBoard)
		{
			for(char[] row : gameBoard){
				for(char c : row){
					System.out.print(c);
				}
				System.out.println();
			}
			
		}
		
		public static void placeSymbol(char[][] gameBoard,int pos,String user)
		{
		char symbol=' ';
		if(user=="Player 1"){
			symbol='X';
		}
		else if(user=="Player 2"){
			symbol='O';
		}
		int count=0;
		while(count<9)
		{
			if((gameBoard[1][1]=='X' && gameBoard[1][3]=='X' && gameBoard[1][5]=='X')||
				(gameBoard[3][1]=='X' && gameBoard[3][3]=='X' && gameBoard[3][5]=='X')||
				(gameBoard[5][1]=='X' && gameBoard[5][3]=='X' && gameBoard[5][5]=='X')||
				(gameBoard[1][1]=='X' && gameBoard[3][1]=='X' && gameBoard[5][1]=='X')||
				(gameBoard[1][3]=='X' && gameBoard[3][3]=='X' && gameBoard[5][3]=='X')||
				(gameBoard[1][5]=='X' && gameBoard[3][5]=='X' && gameBoard[5][5]=='X')||
				(gameBoard[1][1]=='X' && gameBoard[3][3]=='X' && gameBoard[5][5]=='X')||
				(gameBoard[1][5]=='X' && gameBoard[3][3]=='X' && gameBoard[5][1]=='X'))
			{
				System.out.println("Player 1 Win");
				break;
			}
			else if((gameBoard[1][1]=='O' && gameBoard[1][3]=='O' && gameBoard[1][5]=='O')||
					(gameBoard[3][1]=='O' && gameBoard[3][3]=='O' && gameBoard[3][5]=='O')||
					(gameBoard[5][1]=='O' && gameBoard[5][3]=='O' && gameBoard[5][5]=='O')||
					(gameBoard[1][1]=='O' && gameBoard[3][1]=='O' && gameBoard[5][1]=='O')||
					(gameBoard[1][3]=='O' && gameBoard[3][3]=='O' && gameBoard[5][3]=='O')||
					(gameBoard[1][5]=='O' && gameBoard[3][5]=='O' && gameBoard[5][5]=='O')||
					(gameBoard[1][1]=='O' && gameBoard[3][3]=='O' && gameBoard[5][5]=='O')||
					(gameBoard[1][5]=='O' && gameBoard[3][3]=='O' && gameBoard[5][1]=='O')){
				System.out.println("Player 2 Win");
				break;
			}
			else
				switch(pos)
				{
				case 1:
					if(gameBoard[1][1]=='X'||gameBoard[1][1]=='O'){
						return;
					}
					else
						gameBoard[1][1]=symbol;
					break;
				case 2:
					if(gameBoard[1][3]=='X'||gameBoard[1][3]=='O'){
						return;
						
					}
					else
						gameBoard[1][3]=symbol;
					break;
				case 3:
					if(gameBoard[1][5]=='X'||gameBoard[1][5]=='O'){
						return;
					}
					else
						gameBoard[1][5]=symbol;
					break;
				case 4:
					if(gameBoard[3][1]=='X'||gameBoard[3][1]=='O'){
						return;
					}
					else
						gameBoard[3][1]=symbol;
					break;
				case 5:
					if(gameBoard[3][3]=='X'||gameBoard[3][3]=='O'){
						return;
					}
					else
						gameBoard[3][3]=symbol;
					break;
				case 6:
					if(gameBoard[3][5]=='X'||gameBoard[3][5]=='O'){
						return;
					}
					else
						gameBoard[3][5]=symbol;
					break;
				case 7:
					if(gameBoard[5][1]=='X'||gameBoard[5][1]=='O'){
						return;
					}
					else
						gameBoard[5][1]=symbol;
					break;
				case 8:
					if(gameBoard[5][3]=='X'||gameBoard[5][3]=='O'){
						return;
					}
					else
						gameBoard[5][3]=symbol;
					break;
				case 9:
					if(gameBoard[5][5]=='X'||gameBoard[5][5]=='O'){
						return;
					}
					else
						gameBoard[5][5]=symbol;
					break;
				default:
					break;
			}
		count++;
		}
}
		
}