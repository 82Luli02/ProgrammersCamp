package tic.tac.toe_task3;
import java.util.Arrays;

/**
 * This Class is inherited by Game_Task3 class
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */

public class TicTacToe {
    //attributes fields or instance method (also GV)
    public static String[] board = new String[9]; //Create an array of String
    public static String turn; 
	
    //CheckWinner method returns a string which will help us know whether there's a winner or it's a draw
    static String checkWinner(){
        for (int i = 0; i < 8; i++) {
	String line="";
        
        //making comination of the expect ways to win so we can know after checking if there's a winner
	switch (i) {
	case 0:
	       line = board[0] + board[1] + board[2];
	       break;
	case 1:
	       line = board[3] + board[4] + board[5];
	       break;
	case 2:
	       line = board[6] + board[7] + board[8];
	       break;
	case 3:
	       line = board[0] + board[3] + board[6];
	       break;
	case 4:
	       line = board[1] + board[4] + board[7];
	       break;
	case 5:
	       line = board[2] + board[5] + board[8];
	       break;
	case 6:
	       line = board[0] + board[4] + board[8];
	       break;
	case 7:
               line = board[2] + board[4] + board[6];
	       break;
        }//end of switch
		
        //If X is the winner
	if (line.equals("XXX")) {
        	return "X";
	}
			
	//If O is the winner
	else if (line.equals("OOO")) {
         	return "O";
	    }
        }//end of for loop
		
        //To check if the result is 'Draw' 
	for (int index = 1; index <= 9; index++) {
        	if (Arrays.asList(board).contains(String.valueOf(index))) {
			break;
		}               
		else if (index == 9) {
		    return "draw";
		}         
	}//end of for loop
        
	// To enter the X Or O at the exact place
	System.out.println(turn+"'s turn, enter a slot number to place "+turn+" in:");
		return null;
	}
	
        
        //To print the board
	public static void printDetails(){
		System.out.println("|---|---|---|");
                for(int index=0; index<3 ; index++){
                System.out.println("| "+board[index*3]+" | "+ board[(index*3)+1]+ " | "+board[(index*3)+2]+" |");
                System.out.println("|---|---|---|");
                }//end of for loop
	}//end of
}//end of class

