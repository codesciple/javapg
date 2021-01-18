public class SwapNum {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 16;

		swap(num1, num2);
		System.out.println("num = " + num1 + " and decimal  = " + num2);

	}

    public static void swap(int var1, int var2){
	int temp = var2;
      	var2 = var1;
	    var1 = temp;
    }
}
