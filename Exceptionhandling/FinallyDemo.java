
public class FinallyDemo {

	public static void main(String[] args) {
			  try{  
			   String data = null;
			   System.out.println(data);  
			  }  
			  catch(NullPointerException e){System.out.println(e);}  
			  finally{System.out.println("Hello");}  
			  System.out.println("rest of the code...");  
			  }  
			
	}

