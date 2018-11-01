class hello{
	/**
	 * this class contatins a method display which would print the word Hello
	 */
	public void display() {
	/**
	* this methods is used for printing the word "Hello"
	*/
		System.out.println("Hello");
	}
}
class world extends hello{
	/**
	 * this class extends the super class hello.
	 * this class takes overrides the method display and prints the word "World"
	 */
	public void display() {
		System.out.println("World");
	}
}

public class AnonymousDemo {
	/**
	 * 
	 * @param args command line argument
	 * This is the main class 
	 * In this class 1st I have created an object from the class hello
	 * The class hello has the method to display "Hello"
	 * Then I have created a 2nd object (object1) from class world which extends hello
	 * The 2nd class overrides the method display() to print the word "World"
	 * Then I have created a 3rd object (object2) which has an anonymous class inside which overrides the methods on class hello to print "World"
	 * An Anonymous class is called so as it does not have any name of its own 
	 * An Anonymous class is used at times when overwriting an object is required to be done only once
	 */

	public static void main(String[] args) {//main class
		hello object = new hello();
		/**
		 * created a new object called object from the class hello
		 */
		object.display();
		/**
		 * using the display method in class hello to print the word "Hello"
		 */
		hello object1 = new world();
		/**
		 * created a new object called object1 from the class world which is inherited from the class hello
		 * The class world modifies the display funtion of class hello to print the word "World"
		 */
		object1.display();
		/**
		 * using the display method is class hello to print the word "World"
		 */
		hello object2 = new hello() {
			/**
			 * creating an object called object2 from the class hello again
			 */
			public void display() {
				System.out.println("World");
				/**
				 * using an anonymous class to overwrite the method display in class hello to print "World"
				 */
			}
		};
		object2.display();
		/**
		 * using the display method to print the word "World"
		 */

	}

}
