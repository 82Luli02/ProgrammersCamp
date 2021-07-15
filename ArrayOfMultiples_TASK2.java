package arrayofmultiples_task2; 
import java.util.Scanner; //Needed for Scanner class
import java.util.Arrays; //Needed for toString function 

/**
* ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */


public class ArrayOfMultiples_TASK2 {

    public static void main(String[] args) {
    int num,length;
    Scanner input= new Scanner(System.in); //create an object of Scanner class
    
    System.out.print("Please enter a number: ");
    num=input.nextInt(); //reads the input of integer

    System.out.print("\nPlease enter the maximum limit of multiples: ");
    length=input.nextInt(); //reads the input of integer
    
    int[] array= Result(num,length); //assign array to the array returned after calling Result Method
    
    System.out.println("\n- - - - - - -  Output - - - - - - -");
    System.out.println(Arrays.toString(array)); //printing the array and its values
    
    }//end of main class

/**
 * Result Method has two parameter and returns an array of integers
 * @param n indicate to the number
 * @param len indicate to the length of the array
 * @return an array of integers that begins with the number chosen
 * then it multiples till the last chosen limit
 */
public static int[] Result(int n,int len){
    int[] result = new int[len]; //creating an array
    
    //for loop for desired calculations
    for (int index = 0; index < len; index++){
            result[index] = (n *(index+1));
    }//end of for loop
    
    return result;
    }//end of Result method
}//end of ArrayOfMultiples_TASK2 class