import java.util.HashSet;

public class AppearNo {

	public static void main(String[] args) {
	

			int[] arrNumber = { 1,2,2,3,4,4,5,6,5,6,5,7,8,7,8,9,9 };

			HashSet<Integer> uniqueElements = new HashSet<>();

			HashSet<Integer> duplicateElements = new HashSet<>();


			for (int i = 0; i < arrNumber.length; i++) {

			if (!uniqueElements.contains(arrNumber[i])) {

			uniqueElements.add(arrNumber[i]);

			} else {

			duplicateElements.add(arrNumber[i]);

			}

			}

			uniqueElements.removeAll(duplicateElements);

			System.out.println("Elements that appear only once: " + uniqueElements);


			}

			}