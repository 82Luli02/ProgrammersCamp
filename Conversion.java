package time_task4;

/**
 * This class receives the time in numbers and then print out the result in words (by using Result method)
 * ID: 310 | Name: Alia AlGhamdi
 * @author 82Lul
 */
public class Conversion {
    //attributes fields or instance method (also GV)
    private int hrs,mins;
    
    /* ---------------------------- constructor ---------------------------------- */
    Conversion(int h, int m){
        //This constructor assigns parameter values to all attributes of the class
        hrs=h;
        mins=m;
    }
    
    /* -------------------------- >> accessor method(getter) << -------------------------- */
    public void Result(){
        String num[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
            "twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six",
            "twenty seven","twenty eight","twenty nine"}; //Create a String array that has the numbers in form of str 
       
        switch(mins){
            case 00:
              System.out.println(num[hrs] +" o' clock");
              break;
            case 01:
              System.out.println("-> one minute past "+num[hrs]);
              break;
            case 59:
              System.out.println("-> one minute to "+num[(hrs%12)+1]);
              break;
            case 15:
               System.out.println("-> quarter past "+num[hrs]);
               break;
            case 30:
              System.out.println("-> half past "+num[hrs]);
              break;
            case 45:
              System.out.println("-> quarter to "+num[(hrs%12)+1]);
              break;
            default:
                if (mins <= 30)
                  System.out.println("-> "+num[mins]+" minutes past "+num[hrs]);
                
                else if (mins > 30)
                  System.out.println("-> "+num[60-mins]+" minutes to "+num[(hrs%12)+1]);    
        }//end of switch    
    }//end of Result method
}//end of Conversion class
