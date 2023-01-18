
public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 10, 20, 25, 30};
		missingNo(numbers);

	}

	public static void missingNo(int[] arrNumber) {
		
		int missing = 0;
		for (int i = 0; i < arrNumber.length - 1; i++) {

			if (arrNumber[i] + 5 != arrNumber[i + 1]) {
			
				missing = arrNumber[i] + 5;

			}

		}
		System.out.println("the missing number is " + missing);
	}

}