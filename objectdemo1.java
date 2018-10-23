import java.util.*;//importing util class to use scanner class
class calc{//class for initialising methods and variables
	int num1;//1st variable
	int num2;//2nd variable
	int result;//3rd variable

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
	calc ob = new calc();//initialising object ob
	Scanner sc = new Scanner(System.in);//importing scanner class and initialising it to sc
	System.out.println("enter two numbers");//asking user for two values 
	ob.num1 = sc.nextInt();//initalising value to int num1 on object num1
	ob.num2 = sc.nextInt();//initialisng value to int num2 on object num2
	ob.add();//performing addition
	System.out.println("the sum of the numbers = "+ob.result);//printing the result
	ob.subtract();//performing subtraction
	System.out.println("the difference of the numbers = "+ob.result);//printing the result
	ob.multiply();//performing multiplication
	System.out.println("the product of the numbers = "+ob.result);//printing the result
	ob.divide();//performing division
	System.out.println("the quotioent of the numbers = "+ob.result);//printing the result
}
}


	

