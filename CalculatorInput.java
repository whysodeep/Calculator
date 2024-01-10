
package assignment2;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Ramandeep Singh
 * @version 1
 * @see Calculator engine.java
 * 
 * this code defines a class calculator input which does the exception handling for the calculator, including the use of try and catch and 
 * a instance of Calculator engine class. it takes input from user by using scanner class. it also contains several methods to validate user's input.
 * All in all, the main purpose of this class is to taker user's input and handle the exceptions that might occur using try and catch.
 */
public class CalculatorInput {
	
	/**
	 * private instance variable calculatorEngine of type CalculatorEngine
	 */
	    private CalculatorEngine calculatorEngine;
	    
    /**
     * constructor that initializes calculatorEngine variable with a provided CalculatorEngine object. 
     * @param calculatorEngine variable of type CalculatorEngine used to call the method from given class.
     */
	    public CalculatorInput(CalculatorEngine calculatorEngine) {
	        this.calculatorEngine = calculatorEngine;
	    }
	    
     /**
      * this method called takeUserInput defines a new scanner object and uses a while loop to execute the functionality of a calcualtor.
      * the while loop will run until the user enters "0 =",  it then stores the input of the user in the string called 'buffer' which is then used in
      * the other method called 'processInput' to handle the exceptions.
      */
	    public void takeUserInput() {
	        Scanner go = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter your equation: ");
	            String buffer = go.nextLine();

	            if (buffer.equals("0 =")) {
	                System.out.println("Program exiting.");
	                break;                }
	            
	            processInput(buffer); 
	            }

	           go.close();
        }
	    
     /**
      * this method called 'processInput' validates user's input based on what value is stored inside the string 'buffer'.
      * it involves the use of try and catch to display exceptions, in the try block the value of num1,num2,sign, and equals is validated from their 
      * respective methods which checks for the possible exceptions and the catch block then prints the specific error message if it needs to be.
      * Calculations are performed based the calculate method of CalculatorEngine class which takes in the values of num1 , num2 and sign(operator). 
      * @param buffer  string buffer stores user's input and uses the values to validate the input. 
      */
	    private void processInput(String buffer) {
	        Scanner input = new Scanner(buffer);
  
	       
	        try {
	            int num1 = readInteger(input);
	            
	            String sign = readOperator(input);
	            int num2 = readInteger2(input);
	            String equals = readEquals(input);

	            calculatorEngine.calculate(num1, num2, sign);
	            
	        } 
	        catch (InputMismatchException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	    
	    
       /**
        * this method uses if / else block to handle the exceptions that might occur while entering the value of num1; 
        * and defines the error messages if needed so. 
        * @param go   new object of scanner class to check user's input.
        * @return returns an integer if user has entered the value in correct format.
        */
	    private int readInteger(Scanner go) {
	        if (go.hasNextInt()) {
	            return go.nextInt();
	            
	        } else if (!go.hasNext()) {
	            throw new InputMismatchException("First number is missing.");
	        }
	        
	        else {
	            throw new InputMismatchException("Please enter an integer.");
	        }
	    }
	    
	  /**
	   * this method uses if / else block to handle the exceptions that might occur while entering the value of num2; 
       * and defines the error messages if needed so. 
	   * @param go   new object of scanner class to check user's input.
	   * @return returns an integer if user has entered the value in correct format for num2.
	   */
	    private int readInteger2(Scanner go) {
	        if (go.hasNextInt()) {
	            return go.nextInt();
	            
	        } else if (!go.hasNext()) {
	            throw new InputMismatchException("Second number is missing.");
	        }
	        
	        else {
	            throw new InputMismatchException("Please enter an integer.");
	        }
	    }
	    
       /**
        * this method uses if / else block to handle the exceptions that might occur while entering the value of sign(operator); 
        * and defines the error messages if needed so. 
        * @param go new object of scanner class to check user's input.
        * @return returns an operator string  if user has entered the value in correct format for sign.
        */
	    private String readOperator(Scanner go) {
	    	if (!go.hasNext()) {
	            throw new InputMismatchException("Equation incomplete. Operator is missing.");
	        }

	        String operator = go.next();
	        if ("+-*/".contains(operator) && operator.length() == 1) {
	            return operator;
	        } else {
	            throw new InputMismatchException("Invalid operator. Valid operators are +, -, *, and /");
	        }
	    }
	    
	   /**
	    * this method uses if / else block to handle the exceptions that might occur while entering the value of equals sign; 
        * and defines the error messages if needed so. 
	    * @param go new object of scanner class to check user's input.
	    * @return returns an equals '='  string  if user has entered the value in correct format for equals sign.
	    */
	    private String readEquals(Scanner go) {
	    	if (!go.hasNext()) {
	            throw new InputMismatchException("Equation incomplete. '=' is missing.");
	        }
	    	
	    	 String sign = go.next();
		        if ("=".contains(sign) && sign.length() == 1) {
		            return sign;
		        } else {
		            throw new InputMismatchException("Equation must end with '='.");
		        }
	    }
	
}

