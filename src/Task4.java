
public class Task4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 8, 9, 10 };

		Sum(arr);
	}

	public static void Sum(int[] evennumber) {

		int total = 10;

		for (int i = 0; i < evennumber.length; i++) {
			for (int j = i + 1; j < evennumber.length; j++) {
				if (evennumber[i] % 2 == 0 && evennumber[j] % 2 == 0) {
					if (evennumber[i] + evennumber[j] == total) {

						System.out.println(+evennumber[i] + " + " + evennumber[j] + " = " + total);
						System.out.println("*******************");
					}
				}
			}
		}
		
	}
}