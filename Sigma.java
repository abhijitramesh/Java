
public class Sigma {

	public static void main(String[] args) {
		Sigma f = new Sigma();
		int sum = f.findSum(10);
		System.out.println(sum);
	}
	
	public int findSum(int num) {
		int sum =0;
		for(int i =0; i<=num;i++)
			sum += num;
		return sum;
	}

}
