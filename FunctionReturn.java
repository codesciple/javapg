public class FunctionReturn {

	public static void main(String[] args) 
      {
	    int var = test();  // if the function test should return something, it would be stored in this variable
	    System.out.print(var); // lets print var. Should print the value assigned by the function
	}

	public static int test(){ 
	   int variable = 9;  // define a variable that has a value 9
	   return variable;   // return this value when the function is called 
	}
}
