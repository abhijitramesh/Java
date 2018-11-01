
import java.util.*;
	/**
	 * 
	 * @author abhijit
	 * importing the java util package to use the scanner class to input data from the user
	 */
class Calculator{
	/**
	 * this class is for the objects to use the three variables to store data.
	 * this is also known as state of the object
	 * this class also has for methods the object could take advantage perform specific tasks.
	 * this is known as behavior of the object
	 */
	int number1;//1st variable
	int number2;//2nd variable
	int result;//third variable

	public void add(){
	/**
	 * this method is used to perform simple addition.
	 */
		result = number1 + number2 ;

	}
	public void subtract(){
	/**
	 * this method is used to perform simple subtraction.
	 */
		result = number1 - number2;
			}
	public void multiply(){

		result = number1 * number2;
	/**
	 * this method is used to perform simple subtraction.
	 */
	}
	public void divide(){
	/**
	 * this method is used to perform simple subtraction.
	 */
		result = number1/number2;
	/**
	 * all the methods shown above are to explain how objects takes different behaviors
	 * when an object calls any method with its reference the underlying tasks are performed
	 * with the variables that are assigned for the particular object
	 */
	}
}
class ObjectDemo1{
	/**
	 * 
	 * @return nothing
	 * this is the main class 
	 */
	public static void main(String[] arg){
	Calculator calculator = new Calculator();
	/**
	 * creating an object calculator using the class (blueprint) Calculator
	 * not that i am using the object as calculator
	 * the class is Calculator
	 */
	Scanner scanner = new Scanner(System.in);
	/**
	 * Initializing object scanner from class Scanner to input values from the user
	 */
	System.out.println("enter two numbers");
	calculator.number1 = scanner.nextInt();
	calculator.number2 = scanner.nextInt();
	/**
	 * Here i am accepting the values for variable number1 and number2 of object calculator
	 */
	calculator.add();
	/**
	 * method for adding two numbers in object calculator has been performed
	 */
	System.out.println("the sum of the numbers = "+calculator.result);
	/**
	 * since the add() method has been performed for object calculator i know that the final answer for it is stored is result
	 * printing the value in result for object calculator
	 */
	calculator.subtract();
	/**
	 * method for subtracting two numbers in object calculator has been performed
	 */
	System.out.println("the difference of the numbers = "+calculator.result);
	/**
	 * since the subtract() method has been performed for object calculator i know that the final answer for it is stored is result
	 * printing the value in result for object calculator
	 */
	calculator.multiply();
	/**
	 * method for multiplying two numbers in object calculator has been performed
	 */
	System.out.println("the product of the numbers = "+calculator.result);
	/**
	 * since the multiply() method has been performed for object calculator i know that the final answer for it is stored is result
	 * printing the value in result for object calculator
	 */
	calculator.divide();
	/**
	 * method for dividing two numbers in object calculator has been performed
	 */
	System.out.println("the quotient of the numbers = "+calculator.result);
	/**
	 * since the divide() method has been performed for object calculator i know that the final answer for it is stored is result
	 * printing the value in result for object calculator
	 */
}
}
