//73 20 74 72 61 6e

//Created: 2/24/28
//Title: Connect Four

package connectfour;

import java.util.*;
public class Game {
	
int colOne, colTwo, colThree, colFour, colFive, colSix, colSeven;
char[][] connectBoard;

	public static void main(String[] args) {
		
		Game dogs = new Game();
		
		dogs.startGame();
		
		do {
				dogs.scannerOne();
				dogs.printBoard();
			
			if(dogs.gameVictory() == false) {
				dogs.scannerTwo();
				dogs.printBoard();
			}
			
		}while(dogs.gameVictory() == false);
		
	} // MAIN METHOD
	
	
	
	
	public void scannerOne() {
		System.out.println("Player ONE's Turn [O]:");
		Scanner sc = new Scanner(System.in);
		int inputOne = sc.nextInt();
		System.out.println();
		getMovePlayerOne(inputOne);
	}
	
	
	public void scannerTwo() {
		System.out.println("Player TWO's Turn [X]:");
		Scanner scTwo = new Scanner(System.in);
		int inputTwo = scTwo.nextInt();
		System.out.println();
		getMovePlayerTwo(inputTwo);
	}
	
	
	
	
	
	public void startGame() {
		System.out.println("1 2 3 4 5 6 7");
		connectBoard = new char[6][7];
		
		for(int i = 0; i < 6; i++)
		{
			for(int ii = 0; ii < 7; ii++)
			{
				connectBoard[i][ii] = '-';
				System.out.print(connectBoard[i][ii] + " ");
			}
			System.out.println();
		}
	}
	
	public void printBoard() {
		System.out.println("1 2 3 4 5 6 7");
		for(int i = 0; i < 6; i++)
		{
			for(int ii = 0; ii < 7; ii++)
			{
				System.out.print(connectBoard[i][ii] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	public void getMovePlayerOne(int column) {
		
		switch(column) {
		case 1: if(colOne == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else {
					colOne++;
					connectBoard[6 - colOne][0] = 'O';
				}
				break;
		case 2: if(colTwo == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else {	
					colTwo++;
					connectBoard[6 - colTwo][1] = 'O';
				}
				break;
		case 3: if(colThree == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else  {
					colThree++;
					connectBoard[6 - colThree][2] = 'O';
				}
				break;
		case 4: if(colFour == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else {
					colFour++;
					connectBoard[6 - colFour][3] = 'O';
				}
				break;
		case 5: if(colFive == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else {
					colFive++;
					connectBoard[6 - colFive][4] = 'O';
				}
				break;	
		case 6: if(colSix == 6) {
					System.out.println("Column is full");
					scannerOne();
				}
				else {
					colSix++;
					connectBoard[6 - colSix][5] = 'O';
				}
				break;
		case 7: if(colSeven == 6) {
					System.out.println("Column is full");
					scannerOne();
				}	
				else {
					colSeven++;
					connectBoard[6 - colSeven][6] = 'O';
				}
				break;		
		default: scannerOne();
				 System.out.println("Entered invalid position.");
				 printBoard();
				break;
	
		}
	
	}	
	
	public void getMovePlayerTwo(int columnTwo) {
			
			switch(columnTwo) {
			case 1: if(colOne == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {
						colOne++;
						connectBoard[6 - colOne][0] = 'X';
					}
					break;
			case 2: if(colTwo == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {	
						colTwo++;
						connectBoard[6 - colTwo][1] = 'X';
					}
					break;
			case 3: if(colThree == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {
						colThree++;
						connectBoard[6 - colThree][2] = 'X';
					}
					break;
			case 4: if(colFour == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {
						colFour++;
						connectBoard[6 - colFour][3] = 'X';
					}
					break;
			case 5: if(colFive == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {
						colFive++;
						connectBoard[6 - colFive][4] = 'X';
					}
					break;	
			case 6: if(colSix == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}
					else {
						colSix++;
						connectBoard[6 - colSix][5] = 'X';
					}
					break;
			case 7: if(colSeven == 6) {
						System.out.println("Column is full");
						scannerTwo();
					}	
					else {
						colSeven++;
						connectBoard[6 - colSeven][6] = 'X';
					}
					break;		
			default: scannerTwo();
					 System.out.println("Entered invalid position.");
					 printBoard();

					break;
		}
		
	}


	
	
	
	public boolean gameVictory() {
		 if( (checkVertOne() == true) || (checkHorizOne() == true) || (checkDiagOnePos() == true) || (checkDiagOneNeg() == true) ) {
			 messageVictoryPlayerOne();
		 }
		 if( (checkVertTwo() == true) || (checkHorizTwo() == true) || (checkDiagTwoPos() == true) || (checkDiagTwoNeg() == true) ) {
			 messageVictoryPlayerTwo();
		 }
		 
		return false;
	}
	
	
	public void messageVictoryPlayerOne() {

		System.out.println("Player ONE is the winner.");
		System.exit(0);
		}
	public void messageVictoryPlayerTwo() {

		System.out.println("Player TWO is the winner.");
		System.exit(0);
	}
	
	
	public boolean checkVertOne() {
		
		String vert = "";
		for(int col = 0; col < 7; col++) {
			for(int row = 0; row < 6; row++) {
				vert = vert + connectBoard[row][col];
			}
			if(vert.contains("OOOO")) {
				return true;
			}
			vert = "";
		}
		

		
		return false;
	}

	public boolean checkHorizOne() {
		
		String horiz = "";
		for(int row = 0; row < 6; row++) {
			for(int col = 0; col < 7; col++) {
				horiz = horiz + connectBoard[row][col];
			}
			
			if(horiz.contains("OOOO")) {
				
				return true;
			}
			horiz = "";
		}
		
		
		
		return false;
	}
	
	public boolean checkDiagOnePos() {
		String diagOne = "", diagTwo = "", diagThree = "", diagFour = "", diagFive = "", diagSix = "";
		
		diagOne = diagOne + connectBoard[3][0] + connectBoard[2][1] + connectBoard[1][2] + connectBoard[0][3];
		diagTwo = diagTwo + connectBoard[4][0] + connectBoard[3][1] + connectBoard[2][2] + connectBoard[1][3] + connectBoard[0][4];
		diagThree = diagThree + connectBoard[5][0] + connectBoard[4][1] + connectBoard[3][2] + connectBoard[2][3] + connectBoard[1][4] + connectBoard[0][5];
		diagFour = diagFour + connectBoard[5][1] + connectBoard[4][2] + connectBoard[3][3] + connectBoard[2][4] + connectBoard[1][5] + connectBoard[0][6];
		diagFive = diagFive + connectBoard[5][2] + connectBoard[4][3] + connectBoard[3][4] + connectBoard[2][5] + connectBoard[1][6];
		diagSix = diagSix + connectBoard[5][3] + connectBoard[4][4] + connectBoard[3][5] + connectBoard[2][6];
		
		if( diagOne.contains("OOOO") || diagTwo.contains("OOOO") || diagThree.contains("OOOO") 
		 || diagFour.contains("OOOO") || diagFive.contains("OOOO") || diagSix.contains("OOOO") ) {
			return true;
		}
		
		return false;
	}
	
	public boolean checkDiagOneNeg() {
		String diagOne = "", diagTwo = "", diagThree = "", diagFour = "", diagFive = "", diagSix = "";
		
		diagOne = diagOne + connectBoard[0][3] + connectBoard[1][4] + connectBoard[2][5] + connectBoard[3][6];
		diagTwo = diagTwo + connectBoard[0][2] + connectBoard[1][3] + connectBoard[2][4] + connectBoard[3][5] + connectBoard[4][6];          
		diagThree = diagThree + connectBoard[0][1] + connectBoard[1][2] + connectBoard[2][3] + connectBoard[3][4] + connectBoard[4][5] + connectBoard[5][6];
		diagFour = diagFour + connectBoard[0][0] + connectBoard[1][1] + connectBoard[2][2] + connectBoard[3][3] + connectBoard[4][4] + connectBoard[5][5];
		diagFive = diagFive + connectBoard[1][0] + connectBoard[2][1] + connectBoard[3][2] + connectBoard[4][3] + connectBoard[5][4];
		diagSix = diagSix + connectBoard[2][0] + connectBoard[3][1] + connectBoard[4][2] + connectBoard[5][3]; 
		
		if( diagOne.contains("OOOO") || diagTwo.contains("OOOO") || diagThree.contains("OOOO") 
		 || diagFour.contains("OOOO") || diagFive.contains("OOOO") || diagSix.contains("OOOO") ) {
			return true;
				}
		
		return false;
	}
	
	
	
	
	
	public boolean checkVertTwo() {
		
		String vert = "";
		for(int col = 0; col < 7; col++) {
			for(int row = 0; row < 6; row++) {
				vert = vert + connectBoard[row][col];
			}
			if(vert.contains("XXXX")) {
				return true;
			}
			vert = "";
		}

		
		return false;
	}
	
	public boolean checkHorizTwo() {
		String horiz = "";
		for(int row = 0; row < 6; row++) {
			for(int col = 0; col < 7; col++) {
				horiz = horiz + connectBoard[row][col];
			}
			
			if( horiz.contains("XXXX") ) {
				
				return true;
			}
			horiz = "";
		}

		return false;
	}
	
	public boolean checkDiagTwoPos() {
		String diagOne = "", diagTwo = "", diagThree = "", diagFour = "", diagFive = "", diagSix = "";
		
		diagOne = diagOne + connectBoard[3][0] + connectBoard[2][1] + connectBoard[1][2] + connectBoard[0][3];
		diagTwo = diagTwo + connectBoard[4][0] + connectBoard[3][1] + connectBoard[2][2] + connectBoard[1][3] + connectBoard[0][4];
		diagThree = diagThree + connectBoard[5][0] + connectBoard[4][1] + connectBoard[3][2] + connectBoard[2][3] + connectBoard[1][4] + connectBoard[0][5];
		diagFour = diagFour + connectBoard[5][1] + connectBoard[4][2] + connectBoard[3][3] + connectBoard[2][4] + connectBoard[1][5] + connectBoard[0][6];
		diagFive = diagFive + connectBoard[5][2] + connectBoard[4][3] + connectBoard[3][4] + connectBoard[2][5] + connectBoard[1][6];
		diagSix = diagSix + connectBoard[5][3] + connectBoard[4][4] + connectBoard[3][5] + connectBoard[2][6];
		
		if( diagOne.contains("XXXX") || diagTwo.contains("XXXX") || diagThree.contains("XXXX") 
		 || diagFour.contains("XXXX") || diagFive.contains("XXXX") || diagSix.contains("XXXX") ) {
			return true;
		}
		
		return false;
	}
	
	public boolean checkDiagTwoNeg() {
		String diagOne = "", diagTwo = "", diagThree = "", diagFour = "", diagFive = "", diagSix = "";
		
		diagOne = diagOne + connectBoard[0][3] + connectBoard[1][4] + connectBoard[2][5] + connectBoard[3][6];
		diagTwo = diagTwo + connectBoard[0][2] + connectBoard[1][3] + connectBoard[2][4] + connectBoard[3][5] + connectBoard[4][6];          
		diagThree = diagThree + connectBoard[0][1] + connectBoard[1][2] + connectBoard[2][3] + connectBoard[3][4] + connectBoard[4][5] + connectBoard[5][6];
		diagFour = diagFour + connectBoard[0][0] + connectBoard[1][1] + connectBoard[2][2] + connectBoard[3][3] + connectBoard[4][4] + connectBoard[5][5];
		diagFive = diagFive + connectBoard[1][0] + connectBoard[2][1] + connectBoard[3][2] + connectBoard[4][3] + connectBoard[5][4];
		diagSix = diagSix + connectBoard[2][0] + connectBoard[3][1] + connectBoard[4][2] + connectBoard[5][3]; 
		
		if( diagOne.contains("XXXX") || diagTwo.contains("XXXX") || diagThree.contains("XXXX") 
		 || diagFour.contains("XXXX") || diagFive.contains("XXXX") || diagSix.contains("XXXX") ) {
			return true;
				}
		
		return false;
	}
	
	

}
