
public class GenericsDriver {

	public static void main(String[] args) {
		PrintGenericClass.printAnyType(new Integer(10));
		PrintGenericClass.printAnyType(new Double(10.0));
		PrintGenericClass.printAnyType(new Character('c'));
		PrintGenericClass.printAnyType(new String("ASd"));
		PrintGenericClass.printAnyArray(new Integer[] {10,20,50,62,64});
		PrintGenericClass.printAnyArray(new Double[] {10.2,10.5,21.6,22.1});
		PrintGenericClass.printAnyArray(new String[] {"das","sfds","hfg","rt"});
		PrintGenericClass.printAnyArray(new Character[] {'x','d','s','r'});
		PrintGenericClass.add(new Integer(1),new Integer(2));
		PrintGenericClass.add(new Double(1.1),new Double(2.2));
		PrintGenericClass.add(new Character('w'),new Character('d'));
		PrintGenericClass.add(new String("asdf"),new String("rew"));
		PrintGenericClass.SortGenerics(new Integer[] {1, 2, 7, 6});
		PrintGenericClass.SortGenerics(new String[] {"y", "q", "l", "a"});
		PrintGenericClass.SortGenerics(new Double[] {1.11, 1.10, 1.90, 1.01});
		PrintGenericClass.SortGenerics(new Character[] {'z', 'y', 'p', 'b'});
	}

}
