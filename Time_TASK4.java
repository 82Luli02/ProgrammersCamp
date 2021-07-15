package time_task4;
import java.util.Scanner; //Needed for Scanner class

/**
 * This class asks the user about the time that the user want in words and it has the main method
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */
public class Time_TASK4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //Create an object of Scanner class
        String time, min, h, choice;
        char letter;
        
        do{
        System.out.println("\nEnter the time you wanna convert into words (ex. 05:23)");
        time=input.nextLine(); 
        
        //Input validation 
        while(time.length()>5||time.length()<5||time.charAt(2)!=':'||time.charAt(0)>'2'||
        (time.charAt(0)=='2'&&time.charAt(1)>'4')|| time.charAt(3)>'5'){
            System.out.println("\ninvalid, Please re-enter the time you wanna convert into words (ex. 05:23)");
        time=input.nextLine();
        }//end of while loop
        
        h=time.charAt(0)+""+time.charAt(1); //Concatenate the 1st digit with 2nd (which indicates to no. of hours)
        min=time.charAt(3)+""+time.charAt(4); //Concatenate the 4st digit with 5nd (which indicates to no. of minutes)
        
        Conversion c= new Conversion(Integer.parseInt(h),Integer.parseInt(min)); //Create an object of Conversion class and convert str to int inside the parameter
        c.Result(); //Calling Result method from Conversion class
        
        System.out.println(""); //To leave a blank line
        
            // >>Extra feature to enable the user to end the program or try again
            System.out.println("Try Again (Y / N)? ");
            choice=input.nextLine(); //reads the input of type string
            letter=choice.charAt(0); //reads the first character 
            
            //Input validation
            while(letter!='N'&& letter!='n'&& letter!='Y'&& letter!='y'){
                System.out.println("invalid entry, wanna try again (Y / N)? ");
                choice=input.nextLine(); //reads the input of type string
                letter=choice.charAt(0); //reads the first character
            }//end of while loop
            
            switch(letter){
                case 'Y':
                case 'y':
                    break;
                case 'N':
                case 'n':
                    System.out.println("Program ended, Thank you!"); 
                    break;   
            }//end of switch
    }while(letter != 'N'&& letter != 'n'); //condition to enable the user to re-enter the loop
    }//end of main method
}//end of Time_TASK4 class
    
