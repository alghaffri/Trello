import java.util.Arrays;

public class SecondHighestNO {

	public static int SecondHighestNumber(int[] secondHighestNumber) {

		Arrays.sort(secondHighestNumber);

		int Lenght = secondHighestNumber.length;

		return secondHighestNumber[Lenght - 2];

		}

		public static void main(String [] args) {

		int array[] = { 40,82,54,74,70,45,90,47,60,71};

		System.out.println(" The Second Largest Number is: " + SecondHighestNumber(array));


		}

		}
