/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

/**
 *
 * @author Family
 */
import java.util.Scanner; //Imports must happen before any class declarations!
public class TempConvert {
    public static void main(String[] args) {
        double tempF, tempC;
       Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter temperature in Celcius: ");
        tempC = keyboard.nextDouble();

        tempF = (9.0/5.0)*tempC+32.0;
        System.out.println("The temperature in Fahrenheit is " + tempF);
    }
    
}

