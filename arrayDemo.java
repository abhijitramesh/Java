
public class arrayDemo {//class

	public static void main(String[] arg) {//mainmethod
		int a[] = {1,2,3,4};//a single dimention array in a variable a
		for(int k : a) {//enhanced loop for feching values from single dimension array
			System.out.println(k);//printing using fetched index numbers
		}
		int d[][] = {//jagged array
				{1,2,3,4},
				{2,4,8},
				{5,6,7,8,9}
		};
		for(int k[] : d) {//making sub array k to pass values from 2d array
			for(int c : k) {//making a variable to pass values from the sub array k[] 
			System.out.print(" "+c);}//printing c
			System.out.println();//printing whitespace
		}

	}

}
