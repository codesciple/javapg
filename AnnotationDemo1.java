import java.util.*;

class Rectangle{
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
}
class Square extends Rectangle{
	@Override
	public void printNameofClass(){	 
		System.out.println("Square");
	}
}

public class AnnotationDemo{
	public static void main(String[] args){
		Square s = new Square();
		s.printNameOfClass();
	}	
}