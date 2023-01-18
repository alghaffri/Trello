
public class Task4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 8, 9, 10 };

		calculateEvenNO(arr);
	} 


	public static void calculateEvenNO(int[] arrNumber) {

		int total = 10;

		for (int i = 0; i < arrNumber.length; i++) {
			for (int j = i + 1; j < arrNumber.length; j++) {
				if (arrNumber[i] % 2 == 0 && arrNumber[j] % 2 == 0) {
					if (arrNumber[i] + arrNumber[j] == total) {

						System.out.println(+arrNumber[i] + " + " + arrNumber[j] + " = " + total);
						System.out.println("*******************");
						
					}
				}
			}
		}
		System.out.print("<<<<<< Good bye >>>>>>");
	}
}