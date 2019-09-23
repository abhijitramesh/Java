import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintGenericClass {
	
	public static <T> void printAnyType(T x) {
		System.out.println("I am a variable of type"+x.getClass());
		System.out.println("The parent of my"+x.getClass().getGenericSuperclass());
		System.out.println(x);
		System.out.println();
	}
	public static <T> void printAnyArray(T[] x) {
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println(x.getClass());
		System.out.println();

	}
	public static <T> void add(T x,T y) {
	if(x.getClass().toString().equals("class java.lang.Integer")&&y.getClass().toString().equals("class java.lang.Integer")) {
		System.out.println(Integer.sum((Integer)x,(Integer) y));
	}
	else if(x.getClass().toString().equals("class java.lang.Double")&&y.getClass().toString().equals("class java.lang.Double")) {
		System.out.println(Double.sum((Double)x,(Double) y));
	}
	else if((x.getClass().toString().equals("class java.lang.Character")&&
			y.getClass().toString().equals("class java.lang.Character")
			||x.getClass().toString().equals("class java.lang.String")&&
			y.getClass().toString().equals("class java.lang.String"))) {
		System.out.println(x.toString()+y.toString());
	}
	else
	{System.out.println("use parameters of same type");}
	System.out.println();
	}
	public static <T> void SortGenerics(T[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
		
	

}
