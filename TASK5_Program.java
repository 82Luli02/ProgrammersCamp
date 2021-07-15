package task5_program;
import java.util.Scanner;   //Needed for Scanner class
import java.util.ArrayList; //Needed for ArrayList

        
/**
 * This Class asks the user about the target and to enter numbers 
 * to check by Modify class if there's at least one pair, Also it has the main method
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */

public class TASK5_Program {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create an object of Scanner class
        ArrayList<Integer>array=new ArrayList<>(); //create object of ArrayList class
        int num,n=0;
        
        System.out.print("Enter your target: ");
        num=input.nextInt();
        
        do{
        System.out.print("\nEnter a number (*Note* when you wanna stop enter \"-1\") : ");
        n=input.nextInt();
        
        //Input validation
        while(array.contains(n)){
            System.out.print("\nInvalid, the number is repeated please re-enter a number again: ");
        n=input.nextInt();
        }//end of while loop
        
        array.add(n); //Add the number to the ArrayList
        }while(n!=-1);
        
        array.remove(array.size()-1); //To Delete last element which is '-1' 
        
        Modify x= new Modify(array,num); //Create an object of Modify class
        
        System.out.println(""); //To leave a blank line
        
        if(x.IsThereAPair()){//flag
           
           x.PrintArrayList(); //calls PrintArrayList method in Modify class
           x.findPairs(); //calls findPairs method in Modify class
        }//end of if condition
        else{
           x.PrintArrayList();//calls PrintArrayList method in Modify class
           System.out.println("and target="+x.target+" result is "+x.IsThereAPair()+" because there's");
           System.out.println("\nNo pair found");
        }//end of else
        
    }//end of main method
}//end of TASK5_Program class
    
    
    

    
    

