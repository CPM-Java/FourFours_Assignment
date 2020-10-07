
/**
 * Project documentation is in the README.TXT file.
 * 
 * Using ONLY objects from the classes provided, 
 *    create 5 new methods which will return an integer value representing 
 *    your NEWLY assigned values.
 * 
 * You may use the internet to find an expression such as 21 = (4.4 + 4)/.4 that works.
 *     Here is one source: https://www.dwheeler.com/fourfours/fourfours.pdf
 * In a testing situation you will be given a working expression.
 * You MUST include exactly 4 numeral fours in your method.
 * You may NOT use any arithmetic symbols ( + - * / etc) 
 * You may NOT use any numbers besides 4
 * You may NOT use Math.pow(), Math.sqrt(), Math.round() or casting (int)
 * 
 * This is practice using object methods and their documentation, not efficient mathematics.
 * You may use local variables.
 * 
 * @author Scott Coyner CPM 
 * @version 7/31/17
 */


public class UsingObjectsExampleCode
{
    //making an object. You will need to make more
    private Add_Subtract as = new Add_Subtract();
    

    /**
     * a method to use 4 fours to make 16
     * using objects
     * 
     * 16 = 4 + 4 + 4 + 4
     */
    public int make_16()
    {
        int x = as.addIntegers(4,4);
        int y = as.addIntegers(4,4);
        return as.addIntegers(x,y);
    }

}
