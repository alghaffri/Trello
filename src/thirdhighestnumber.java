import java.util.Arrays;

public class thirdhighestnumber {

	public static void main(String[] args) {

		int array[] = { 1000, 2000, 2500, 3000, 4000, 500, 6000, 6500 };

		thirdLargestNo(array);
	}

	public static void thirdLargestNo(int[] arrNumber) {
		Arrays.sort(arrNumber);

		int Lenght = arrNumber.length;

		System.out.println(" The third Largest Number is: " + arrNumber[Lenght - 3]);

	}
}
