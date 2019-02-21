package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {

		int max = 0;
		int temp = 0;
		
		int[] result = {};

		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j <= arr.length -1; j++) {
				
				temp = arr[i] * arr[j];
				if(max < temp) {
					max = temp;
				}
				
			}
			
		}

	}
}
