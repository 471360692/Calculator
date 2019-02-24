/**
 * @author Kekang Shu 
 * ClassID: 548
 * Assignment Number: 1
 * Description: This is the second assignment for CSE360 class.
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	private String history = "0"; // History string that record all action.
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * 
	 * This method will return the total number.
	 * 
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * 
	 * @param value The integer to be added.
	 * This method will add the parameter to the total variable.
	 * 
	 */
	public void add (int value) {
		history = history + " + " + value;
		total = total + value;
		
	}
	/**
	 * 
	 * @param value The integer to be subtracted.
	 * This method will subtract the parameter from the total variable.
	 */
	public void subtract (int value) {
		history = history + " - " + value;
		total = total - value;
	}
	/**
	 * 
	 * @param value the integer to be multiplied with.
	 * This method will multiply the total by the parameter.
	 */
	public void multiply (int value) {
		history = history + " * " + value;
		total = total * value;
	}
	/**
	 * 
	 * @param value the integer to be divide by.
	 * This method will divide the total by the parameter.
	 */
	public void divide (int value) {
		history = history + " / " + value;
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	/**
	 * 
	 * This method will return a history string that include all action history.
	 * 
	 */
	public String getHistory () {
		return history;
	}
}