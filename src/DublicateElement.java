
public class DublicateElement {

	public static void main(String[] args) {
		
		

		int[] arrDublicate = { 10, 20, 30, 10, 50, 40, 50, 20 };

		for (int i = 0; i < arrDublicate.length; i++) {

			for (int j = i + 1; j < arrDublicate.length; j++) {
				

				if (arrDublicate[i] == arrDublicate[j]) {

					System.out.println(" The Duplicated Number is: " + arrDublicate[i]);

				}

			}
		}

		
	}
}