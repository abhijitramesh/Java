import java.util.*;//importing util class to use scanner class
class Calculator{
	int num1;
	int num2;
	int result;

	public void add(){//method to perfome additon
		result = num1 + num2 ;

	}
	public void subtract(){//method to perfome subtraction
		result = num1 - num2;
			}
	public void multiply(){//method to perfome multiplication
		result = num1 * num2;
	}
	public void divide(){//method to perfome division
		result = num1/num2;
	}
}
class ObjectDemo1{//class for main
	public static void main(String[] arg){//starting main
	Calculator calculator = new Calculator();//initialising object ob
	Scanner scanner = new Scanner(System.in);//importing scanner class and initialising it to sc
	System.out.println("enter two numbers");//asking user for two values 
	calculator.num1 = scanner.nextInt();//initalising value to int num1 on object num1
	calculator.num2 = scanner.nextInt();//initialisng value to int num2 on object num2
	calculator.add();//performing addition
	System.out.println("the sum of the numbers = "+calculator.result);//printing the result
	calculator.subtract();//performing subtraction
	System.out.println("the difference of the numbers = "+calculator.result);//printing the result
	calcucator.multiply();//performing multiplication
	System.out.println("the product of the numbers = "+calculator.result);//printing the result
	calculator.divide();//performing division
	System.out.println("the quotient of the numbers = "+calculator.result);//printing the result
}
}


	

