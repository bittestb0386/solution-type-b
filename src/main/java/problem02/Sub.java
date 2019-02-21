package problem02;

public class Sub implements Arithmetic{

	int result = 0;
	
	@Override
	public int calculate(int a, int b) {
		
		result = a - b;
		
		return result;
	}

}
