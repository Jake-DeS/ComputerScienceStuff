// Jake DeSantis
// Lab 3
// Part 1
// converting temp from Fahrenheit to centigrade



//Jake DeSantis
//lab 3 part 1
// convert fahrenheit to centigrade and vice versa
import java.util.Scanner;
public class tempConvert {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double fahrenTemp,celsTemp;

        System.out.println("Please enter the temperature in Fahrenheit ");                                                         //prompting for user to give number
        fahrenTemp=keyboard.nextDouble();                                                                                          // taking the number
        System.out.println(fahrenTemp +" degrees Fahrenheit is equal to " + ((fahrenTemp-32)*(5.0/9.0)) + " degrees Centigrade");  // returning the temp in centigrade

        System.out.println("Please enter the temperature in Centigrade");                                                           //prompting user for temp
        celsTemp=keyboard.nextDouble();                                                                                             // taking the number
        System.out.println( celsTemp+ " degrees Centigrade is equal to " + (celsTemp*(9.0/5.0)+32) + " degrees Fahrenheit");        // returning the temp in Fahrenheit
        //After minor testing the program seems to be in working order
    }
}