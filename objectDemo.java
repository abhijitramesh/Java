import java.util.*;//importing util class to use scanner
class calc{//class used for the objects (classes are blueprints of a programme)
	int num1;//initialising 1st variable
	int num2;//initialising 2nd variable
	int result;//initialising 3rd variable
	public void perfome(){//method to carry out specific processes
		result = num1 + num2;//here addition process is carried out inside the method

	}

}

class ObjectDemo{//class for main 

	public static void main(String[]args){//starting main programme
		Scanner sc = new Scanner(System.in);//importig scanner class and initialising it in object sc
		calc ob = new calc();//creating a new object ob
		ob.num1 = 3;//assigning a value to int num1 on object ob
		ob.num2 = 4;//assiging a value to int num2 on object ob
		ob.perfome();//calling the method to carry out the addition
		System.out.println(ob.result);//printing the result in int result of object ob
		calc ob1 = new calc();//creating new object ob1
		ob1.num1 = sc.nextInt();//accepting a value into int num1 of object ob1
		ob1.num2 = sc.nextInt();//accepting a value into int num2 of ibject ob2
		ob1.perfome();//performing method to carry out addition of num1 and num2 and save it to result all on object ob1
		System.out.println(ob1.result);//printing result from object ob1
		

	}
}