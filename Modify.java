package task5_program;
import java.util.ArrayList; //Needed for ArrayList

/**
 * This Class has 3 methods that sends the desired output 
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */

public class Modify {
    //attributes fields or instance method (also GV)
    ArrayList<Integer> arr =new ArrayList<>(); //create object of ArrayList class
    ArrayList<Integer> pairs =new ArrayList<>();
    int target,p;
    
    /* ---------------------------- constructor ---------------------------------- */
    public Modify(ArrayList<Integer> arr, int aim){
        this.arr=arr;
        target=aim;
    }//end of constructor
    
    
    /* -------------------------- >> accessor methods(getters) << -------------------------- */
    
    /**
     * IsThereAPair method has no parameter and returns a boolean 
     * it checks if there is a pair the equals the target
     * @return boolean (True of False)
     */
    public boolean IsThereAPair(){
        // consider each element except the last
        for (int i = 0; i < arr.size() - 1; i++){
            // start from the i'th element until the last element
            for (int j = i + 1; j < arr.size(); j++){
                //check if the desired sum is found
                if (arr.get(i) + arr.get(j) == target){
                    pairs.add(arr.get(i)); //add the 1st number to pairs ArrayList
                    pairs.add(arr.get(j)); //add the 2nd number to pairs ArrayList
                    p++; //To count how many pairs
                }//end of if condition
            }//end of nested for loop
        }//end of for loop
              if(pairs.size()>1)
                  return true; //if the pair is found
              else
                  return false; //if the pair is not found
    }//end of IsThereAPair method  
        
    /**
     * PrintArrayList method has no parameter and it prints out the ArrayList's values
     */
    public void PrintArrayList(){
        System.out.print("The values in ArrayList are : ");
        //To print out each element in the list
        for (Integer value : arr) {
            System.out.print(value);
            System.out.print(" ");
        }//end of for loop
    }//end of PrintArrayList method 
    
    
    /**
     * findPairs method has no parameter, it prints out the number of pairs found
     * and prints each pair that sums equals the target
     */
    public void findPairs(){
        System.out.println("\n"+p+" Pair/s found\n");
        for (int i = 0; i < pairs.size(); i+=2){
             System.out.println("pair "+(1+(i/2))+" ("+pairs.get(i)+","+pairs.get(i+1)+")");
        }//end of for loop
    }//end of findPairs method
}
    
