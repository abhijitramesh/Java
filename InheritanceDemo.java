

class Calculator{		//Super,Parent,Base
	public int add(int i,int j) {
		return i+j;
	}
}
class CalcAdv extends Calculator {		//sub,Child,Derived

	
	public int sub(int i, int j) {
		return i-j;
	}
}
class VeryAdvCalc extends CalcAdv{
	public int multiply(int i,int j) {
		return i*j;
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		VeryAdvCalc c1 = new VeryAdvCalc();
		int result = c1.add(5,4);
		int result2 = c1.sub(9,7);
		int result3 = c1.multiply(5, 4);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

}
