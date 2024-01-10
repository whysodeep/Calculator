
package assignment2;


  /**
   * @author Ramandeep Singh
   * @version 1 
   * 
   */
public class CalculatorEngine {
	 
	/**
	 * this method adds num1 and num2.
	 * @param num1 1st number to be added.
	 * @param num2 2nd number to be added.
	 * @return returns the result of their addition
	 */
	    public int add(int num1, int num2) {
	        return num1 + num2;
	    }
      /**
       * this method subtracts num1 from num2.
       * @param num1 Number to be subtracted from.
       * @param num2 number to be subtracted.
       * @return returns the result of subtraction.
       */
	    public int subtract(int num1, int num2) {
	        return num1 - num2;
	    }
	    
       /**
        * this method multiplies two numbers- num1 and num2.
        * @param num1 1st number
        * @param num2 2nd number
        * @return returns the result of multiplication of 2 numbers.
        */
	    public int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    /**
	     * this method divides num2 by num1. it also throws a new exception if the user tries to divide a number by zero.
	     * @param num1 the number to be divided
	     * @param num2 the number to be divided  by.
	     * @return the result of division.
	     */
	    public int divide(int num1, int num2) {
	        try {
	            if (num2 == 0) {
	                throw new ArithmeticException("Cannot divide by zero! Result is invalid, returning zero.");
	            }
	            return num1 / num2;
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	            return 0;
	        }
	    }
	    
        /**
         * calculate method uses switch and case for different operators to decide which method is to be used if user enters a specific operator.
         * the possible operations which can be performed are addition,subtraction, multiplication and division. It then prints the final result. 
         * @param num1 1st number.
         * @param num2 2nd number.
         * @param operator the sign of the operator. 
         */
	    public void calculate(int num1, int num2, String operator) {
	        int result = 0;

	        switch (operator) {
	            case "+":
	                result = add(num1, num2);
	                break;
	            case "-":
	                result = subtract(num1, num2);
	                break;
	            case "*":
	                result = multiply(num1, num2);
	                break;
	            case "/":
	                result = divide(num1, num2);
	                
	                break;
	            default:
	                System.out.println("Error: Invalid operator. Valid operators are +, -, /, and *");
	        }

	        System.out.println("That answer is: " + result);
	    }
	}


