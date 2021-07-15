package tic.tac.toe_task3;
import java.util.Scanner; //Needed for Scanner class

/**
 * This class inherits TicTacToe Class and also it has the main method 
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */

public class Game_Task3 extends TicTacToe{
    
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);  //Create an object of Scanner class
            String winner = null;
            
            turn ="X"; //To start the game with X
                       
            //Needed to initalize the game with the number printed on the board, then the player will chose the move
	    for (int i = 0; i < 9; i++) {
			board[i] = String.valueOf(i + 1);
	    }
            
		System.out.println("Welcome to 3x3 Tic Tac Toe Gams");
		printDetails();

		System.out.println("X will play first. \nEnter a slot number to place X in: ");

                
		while (winner == null) {
		int num;
	            num = input.nextInt();
                    
                    //input validation
		    if (num <= 0 || num > 9) {
	        	System.out.println("Invalid input, re-enter slot number: ");
                        num = input.nextInt();
                    }
		    
		        // This logic is to decide which player will play next x or O
		        if (board[num - 1].equals(String.valueOf(num))) {
			board[num - 1] = turn;

		            if (turn.equals("X")) {
				turn = "O";
		            }
                        
			    else {
			     	turn = "X";
			    }
                        
		            printDetails(); //To print the board
                
                        //call checkWinner method from TicTacToe class and store the value in 'winner'    
		            winner = checkWinner();
	                }
                
		    else {
	        	System.out.println("Slot already taken, re-enter slot number:");
		    }
		}//end of while loop
		
		//If no one win or lose from both player x and O, then print "draw".
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing");
		}
		
		//To display Congrats message for the Winner
		else {
	            System.out.println("Congratulations! " +winner+ "'s have won! Thanks for playing.");
		     }
	}//end of main method 
}//end of Game_Task3 class

