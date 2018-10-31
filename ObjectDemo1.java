@author		Abhijit Ramesh
import java.util.*;/**importing the java.util package 
		    *to use the scanner class to take the input from the user
		    */
class Calculator{
/** This class is created to take three values and perform four methods 
*adding subtracting multiplying and dividing
@param number1 This is the first parameter to Calculator class
@param number2 This is the second parameter to Calculator class
@param result This is the third parameter to Calculator class
*/
	int number1;
	int number2;
	int result;

	public void add(){
	/**this method is used to add two integers.
	*this is to explain how objects usues methods to perform certain steps.
	*this is bacially a behaviour showed by the object
	*/
		result = number1 + number2 ;

	}
	public void subtract(){
	/**this method is used to subtract two integers.
	*this is to explain how objects usues methods to perform certain steps.
	*this is bacially a behaviour showed by the object
	*/
		result = num1 - num2;
			}
	public void multiply(){
	/**this method is used to multiply two integers.
	*this is to explain how objects usues methods to perform certain steps.
	*this is bacially a behaviour showed by the object
	*/
		result = num1 * num2;
	}
	public void divide(){
	/**this method is used to divide two integers.
	*this is to explain how objects usues methods to perform certain steps.
	*this is bacially a behaviour showed by the object
	*/
		result = num1/num2;
	}
}
class ObjectDemo1{
	public static void main(String[] arg){
	Calculator calculator = new Calculator();
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter two numbers");
	calculator.number1 = scanner.nextInt();
	calculator.number2 = scanner.nextInt();
	calculator.add();
	System.out.println("the sum of the numbers = "+calculator.result);
	calculator.subtract();
	System.out.println("the difference of the numbers = "+calculator.result);
	calculator.multiply();
	System.out.println("the product of the numbers = "+calculator.result);
	calculator.divide();
	System.out.println("the quotient of the numbers = "+calculator.result);
}
}


	

