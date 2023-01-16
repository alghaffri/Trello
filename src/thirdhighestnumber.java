import java.util.Arrays;

public class thirdhighestnumber {

	public static void main(String[] args) {

		int array[] = { 1000, 2000, 2500, 3000, 4000, 500, 6000, 6500 };

		int Lenght = array.length;

		Arrays.sort(array);

		System.out.println(" The third Largest Number is: " + array[Lenght - 3]);

	}
}
