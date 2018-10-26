
class calc{//learning varable arguments
	public int add(int...n) {//method to add using varard(...)
		int sum =0;//initialiging a variable sum to 0 to add 
		for(int a : n) {//using enhanced array to call values from array n
			sum = sum+a;//adding the values
		}
		return sum;//returning the sum
	}

}
public class VaraddDemo {//declaring main class VaraddDemo

	public static void main(String[] args) {//main()
		calc obj = new calc();//declaring new object obj in calc
  System.out.println(obj.add(1,2,3,4,5));//(Sending the values to calc as an array as vararg is used)
	}

}
