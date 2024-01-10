
package assignment2;

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Ramandeep Singh
 * @version 1
 * 
 */

public class Calculator {
	
	/**
	 * This is the entry point for the application, it prints the instructions to use the calculator .
	 * it then instantiates a new object for both calculator engine and calculator input class to call the method from the class which holds
	 * all the calculations for the program.
	 * @param args Command line arguments are not used by this program.
	 */
	    public static void main(String[] args) {
	        System.out.println("Welcome to the Assignment 2 CST8284 calculator.");
	        System.out.println("Written by Ramandeep Singh, #041097006");
	        System.out.println("Equations are in the form num1 operator num2 =");
	        System.out.println("Where num1 and num2 must be integers,");
	        System.out.println("operator is one of +, -, / or *");
	        System.out.println("Enter 0 = to quit.");

            CalculatorEngine calculatorEngine = new CalculatorEngine();
	        CalculatorInput calculatorInput = new CalculatorInput(calculatorEngine);

	        calculatorInput.takeUserInput();
	    }
	
}
